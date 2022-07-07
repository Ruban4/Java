package com.scrollup.scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupandScrolldown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium"
				+ "\\SeliniumTesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
			
		driver.manage().window().maximize();
		
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		
		jc.executeScript("window.scrollBy(0,2550)", "");
		
		Thread.sleep(5000);
		
		jc.executeScript("window.scrollBy(0,-2550)", "");
		
		WebElement bottom = driver.findElement(By.xpath("//a[text()='Help']"));
		
		// jc.executeScript("arguments[0].scrollIntoView()", bottom);
		
		jc.executeScript("arguments[0].click()", bottom);
				
	     

	}

}
