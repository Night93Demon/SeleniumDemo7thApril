package com.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Drivers.Drivers;

public class LaunchAndCloseBrowser {
	
	public static WebDriver driver;
	
	
	
	public void LaunchBrowser(String fileName) {
		driver = Drivers.getdriver(fileName);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void CloseBrowser() {
	
		driver.close();
	}
	
	

}
