package com.bankapplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Banking {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.rapidtestpro.com/login.php");
		
		driver.findElement(By.id("accno")).sendKeys("1234556666");
		
		driver.findElement(By.id("pass")).sendKeys("MavDemo@01");
		
		driver.findElement(By.xpath("//input[@value='Login Now ! ']")).click();
		
		driver.findElement(By.id("accpin")).sendKeys("12345");
		
		//driver.findElement(By.xpath("//input[@value='Validate PIN ! ']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		
		driver.findElement(By.xpath("//a[@href='/view/?v=Statement']")).click();
		
		driver.findElement(By.linkText("Fund Transfers")).click();
		
		//fund transfer section
		
		driver.findElement(By.name("rbname")).sendKeys("citi bank");
		
		driver.findElement(By.name("rname")).sendKeys("jyotium");
		
		driver.findElement(By.name("accno")).sendKeys("12345678901");
		
		driver.findElement(By.name("swift")).sendKeys("12345678901");
		
		driver.findElement(By.name("amt")).sendKeys("1");
		
		Select select = new Select(driver.findElement(By.id("toption")));
		select.selectByVisibleText("Domestic Transfer");
		select.selectByIndex(1);
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		  LocalDate localDate = LocalDate.now();
		  
		
	      driver.findElement(By.id("dot")).sendKeys(dtf.format(localDate));
		  
		  driver.findElement(By.id("desc")).sendKeys("gift");
		  
		
		  
		  driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		
		
		
	}

}
