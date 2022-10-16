package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/window.xhtml;jsessionid=node0sp5i0boafsbj4bonx3zc5k0y375615.node0");
		driver.manage().window().maximize();
		
		//Confirm new windows opened
		String defaultWindow = driver.getWindowHandle();
		WebElement confirmNewWindow = driver.findElement(By.id("j_idt88:new"));
		confirmNewWindow.click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String newWindow : allWindows) {
			driver.switchTo().window(newWindow);
			
		}
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input"));
		searchBox.sendKeys("Selenium"+Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(defaultWindow);
		
		WebElement closeNewWindow = driver.findElement(By.id("j_idt88:j_idt93"));
		closeNewWindow.click();
		Set<String> allWindows1 = driver.getWindowHandles();
		int totalWindows = allWindows1.size();
		System.out.println(totalWindows);
		for (String newWindow1 : allWindows1) {
		if (!allWindows1.equals(defaultWindow)) {
			driver.switchTo().window(newWindow1);
			driver.close();
		}
			
		
			
		}
		
		
	}

}
