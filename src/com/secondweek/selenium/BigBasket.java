package com.secondweek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://www.bigbasket.com/");	
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("input"));
		element.sendKeys("fruits "+"\n");
		
		Thread.sleep(100);
		
		
		
	}

}
