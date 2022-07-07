package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium"
				+ "\\SeliniumTesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		email.sendKeys("ab@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		
		pass.sendKeys("123456");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		login.click();
		
		Thread.sleep(5000);
		
	  TakesScreenshot ts = (TakesScreenshot) driver; 
	  
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  
	 File des= new File ("C:\\Users\\Ruban\\Selinium\\SeliniumTesting\\ScreenShot\\pic.png");
		
	 FileHandler.copy(source, des);
	 
	 	}

}
