package com.TestRun;

import com.TestBase.LaunchAndCloseBrowser;

public class TestRun extends LaunchAndCloseBrowser {
	
	String fileName = "D:\\Projects\\SeleniumEndToEndFramework\\User Data\\UserConfig.Properties";

	public void runbrowser()  {
		
		LaunchBrowser(fileName);
		
	}
	
	

}
