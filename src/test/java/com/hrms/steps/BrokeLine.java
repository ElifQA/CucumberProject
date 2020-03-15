package com.hrms.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokeLine {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("http://abcdatabase.com/basicauth");
        driver.get("http://test:test@abcdatabase.com/basicauth");
        Thread.sleep(1000);

	}

}
