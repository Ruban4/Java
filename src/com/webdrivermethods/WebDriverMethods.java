package com.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium"
				+ "\\SeliniumTesting\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
			
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.netflix.com/in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		driver.navigate().refresh();
		
		// driver.close();
		
		// driver.quit();
		
		
	}

}
