package com.webelementmethods;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethodsPractice {

	public static void main(String[] args) {
		
		String url = "https://www.instagram.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium"
				+ "\\SeliniumTesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("abcd@gmail.com");
		
		WebElement password = driver.findElement(By.className("password"));
		
		password.sendKeys("12sd");

	}

}
