package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		// to drag and drop element we have to use actions class and build().perform();
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_header"));
		Actions a = new Actions(driver);
		a.clickAndHold(from).release(to).build().perform();
		//a.dragAndDrop(from, to).build().perform();
		WebElement from1 = driver.findElement(By.id("form:conpnl"));
		Actions a1 = new Actions(driver);
		a.clickAndHold(from1).dragAndDropBy(from1, 300, 0).build().perform();
	}

}
