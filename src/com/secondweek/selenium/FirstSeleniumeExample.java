package com.secondweek.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumeExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("input")).sendKeys("123457");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.className("icon svg-header svg-search-mw svg-search-mw-dim hidden-md hidden-lg")).click();
		driver.close();
		
		
		
		

	}

}
