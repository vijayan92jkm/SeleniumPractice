package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0icrj7xsp64wa1f2gzu2jkctsp394257.node0");
		driver.manage().window().maximize();
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select s1 = new Select(dropDown1);
		s1.selectByIndex(1);
		WebElement dropDown2 = driver.findElement(By.id("j_idt87:auto-complete_input"));
		dropDown2.sendKeys("sele");
		Select s2 =new Select(dropDown2);
		s2.selectByIndex(4);
		WebElement dropDown3 = driver.findElement(By.id("j_idt87:city"));
		Select s3 = new Select (dropDown3);
			s3.selectByVisibleText("Denver");
			if (s3.equals("Denver")) {
				System.out.println("Mentioned country cities loaded");
				
			}
			
		
		
		
		

	}

}
