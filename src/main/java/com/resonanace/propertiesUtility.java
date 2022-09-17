package com.resonanace;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class can be utilized for reading and writing .properties files
 * @author Disha M. Salunkhe
 *
 */
public class propertiesUtility {

	public String getValue(String filepath, String FileKey) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		String value = null; 
		try {
			prop.load(fis);
			prop.getProperty(FileKey);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}
	
	public String getLocator(String key) {
		String dir = System.getProperty("user.dir")+"src/main/resources/OR.Properties";
		
		String locator =  getValue(dir, key);
		String[] parts = locator.split("##");
		return locator;
		

	}

}
