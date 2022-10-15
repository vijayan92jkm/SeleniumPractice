package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		String frame1Text = frame1.getText();
		System.out.println(frame1Text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement frame2 =driver.findElement(By.id("Click"));
		frame2.click();
		String frame2Text = frame2.getText();
		System.out.println(frame2Text);

		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int frameCount = totalFrames.size();
		System.out.println(frameCount);
	}

}
