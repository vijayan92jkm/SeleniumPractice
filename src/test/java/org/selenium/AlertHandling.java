package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public static void main (String [] args ) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/alert.xhtml;jsessionid=node07pmr9jmiactu184w46l2fnyd2374600.node0");
		// navigate option is used to refresh, forward, backward the current browser we cant do this in driver.get() method
		WebElement simpleAlert = 	driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		//To handle the alert have to switch to alert by using alert interface
		Alert acceptSimpleAlert = driver.switchTo().alert();
		acceptSimpleAlert.accept();
		WebElement confirmAlert = driver.findElement(By.id("j_idt88:j_idt93"));
		confirmAlert.click();
		Alert cancelConfirmAlert = driver.switchTo().alert();
		cancelConfirmAlert.dismiss();
		WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
		promptAlert.click();
		Alert textPromptAlert = driver.switchTo().alert();
		textPromptAlert.sendKeys("Handling Alert");
		textPromptAlert.accept();
		WebElement DeleteAlert = driver.findElement(By.id("j_idt88:j_idt106"));
		confirmAlert.click();
		Alert yesAlert = driver.switchTo().alert();
		cancelConfirmAlert.accept();

		WebElement cancelAlert = driver.findElement(By.id("j_idt88:j_idt95"));
		cancelAlert.click();
		Actions a = new Actions(driver);
		WebElement close = driver.findElement(By.id("j_idt88:j_idt98"));
		a.moveToElement(close);
		a.click();
		a.build().perform();

		WebElement sweetModal = driver.findElement(By.id("j_idt88:j_idt100"));
		sweetModal.click();
		Actions a1 = new Actions(driver);
		WebElement sweetModalClose = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a"));
		a1.moveToElement(sweetModalClose);
		a1.click();
		a1.build().perform();




	}

}


