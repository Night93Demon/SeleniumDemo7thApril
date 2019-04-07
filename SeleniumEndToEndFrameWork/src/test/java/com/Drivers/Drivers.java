package com.Drivers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.PropertyFileRetrieve.LoadedProperty;

public class Drivers {
	
	
	private static WebDriver driver;
	private static Properties prop;
	
	public static WebDriver getdriver(String filepath) {
		String browser = null;
		prop = Drivers.userPropFile(filepath);
		browser = prop.getProperty("browsername");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
			driver =  new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefox"));
			driver =  new FirefoxDriver();
		}else {
			System.out.println("Invalid Browser");
			driver= null;
			}
		return driver;
	}
	
	public static Properties userPropFile(String fileName) {
		prop = LoadedProperty.getLoadedProperty(fileName);
		return prop;
	}
	
	
	
}
