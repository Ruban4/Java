package com.dropdown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium"
				+ "\\SeliniumTesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		btn.click();
		
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select (day);
		
		s.selectByValue("2");
		
		WebElement month = driver.findElement(By.xpath("//select [@id='month']"));
		
		Select s1 = new Select (month);
		
		s1.selectByVisibleText ("May");
		

	}

}
