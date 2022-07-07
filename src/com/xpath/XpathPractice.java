package com.xpath;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium"
				+ "\\SeliniumTesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		email.sendKeys("ab12@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		 password.sendKeys("123456");
		
       WebElement FP = driver.findElement(By.xpath("//a [text()='Forgotten password?']"));
       
       FP.click();
	}

}
