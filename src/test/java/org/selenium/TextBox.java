package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		WebElement nameEditBox = driver.findElement(By.id("j_idt88:name"));
		nameEditBox.sendKeys("Vijayan Priya");

		WebElement appendCountryName = driver.findElement(By.id("j_idt88:j_idt91"));
		nameEditBox.sendKeys(" India");

		WebElement disabledEditBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean editBoxStatus = disabledEditBox.isEnabled();
		System.out.println(editBoxStatus);

		WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearText.clear();

		WebElement retrieveText = driver.findElement(By.id("j_idt88:j_idt97"));
		String textInBox = retrieveText.getAttribute("value");
		System.out.println(textInBox);

		WebElement emailAndTab = driver.findElement(By.id("j_idt88:j_idt99"));
		emailAndTab.sendKeys("Vijayan92jkm@gmail.com"+Keys.TAB);
		WebElement aboutYourself = driver.findElement(By.id("j_idt88:j_idt101"));
		boolean aboutBoxStatus = aboutYourself.isSelected();
		System.out.println(aboutBoxStatus);

		WebElement mandatoryField = driver.findElement(By.id("j_idt106:thisform:age"));
		mandatoryField.sendKeys(Keys.ENTER);
		Actions a = new Actions (driver);
		WebElement ageMand = driver.findElement(By.id("j_idt106:thisform:j_idt110"));
		a.moveToElement(ageMand).getClass();
		


	}

}
