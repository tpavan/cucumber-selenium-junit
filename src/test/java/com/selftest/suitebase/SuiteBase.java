package com.selftest.suitebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class SuiteBase {

	public WebDriver driver;
	
	@Before
	public void openApp(String browser){
		switch (browser) {
		case "firefox":
			 driver = new FirefoxDriver();
			 driver.get("http:\\facebook.com");
			break;
		case "chrome":
			System.setProperty("driver.chrome.webdriver", "");
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
	}
}
