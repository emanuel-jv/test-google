package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void loginTest() {
		
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 second
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// open page
		String url = "https://www.google.com/";
		driver.get(url);
		System.out.println("Page is opened.");

		// sleep for 3 second
		sleep(2000);
		
		//Close Driver
		driver.quit();
	}

	private void sleep(long m) {
		// sleep for 3 seconds
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generate catch block
			e.printStackTrace();
		}
	}
}
