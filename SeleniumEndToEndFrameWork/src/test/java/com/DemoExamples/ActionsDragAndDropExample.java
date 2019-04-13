package com.DemoExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestRun.TestRun;

public class ActionsDragAndDropExample extends TestRun {
	@Test
	public void testcase() throws InterruptedException {

		runbrowser();
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		Thread.sleep(2000);
		WebElement country = driver
				.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[2]/div/div"));
		WebElement src = driver.findElement(
				By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[2]/ul/li[1]/div/div"));
		WebElement dest = driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(country).doubleClick().build().perform();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		mouse.dragAndDrop(src, dest).perform();
		;
		Thread.sleep(2000);
		WebElement pricechecker = driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1"));
		Assert.assertTrue(pricechecker.getText().contains("2999"));
		driver.quit();

	}

}
