package com.PropertyFileRetrieve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//This class is meant to retrieve data from propeties file

public class LoadedProperty {
	
	
	public static Properties getLoadedProperty(String fileName) {
		
		FileInputStream fip = null;
		Properties prop = null;
		
		try {
			fip = new FileInputStream(fileName);
			
		}catch(FileNotFoundException e) {
		System.err.println("Error while loading file");
		}
		prop = new Properties();
		try {
			prop.load(fip);
		}catch(IOException e) {
			System.err.println("Error while loading file into properties instance");
		}
		return prop;
	}

}
