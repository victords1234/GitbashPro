package com.flipkart.genericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtils  {
	public void getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\TestData\\getKeyValue.properties");
		Properties prop=new Properties();
		prop.load(fis);
		prop.getProperty(key);
	}
}
