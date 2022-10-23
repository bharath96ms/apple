package com.facebook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
 public ReadConfig() {
	File src = new File("./configurations/config.properties");
	try {
		FileInputStream fis= new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e) {
		System.out.println("Error messoge"+ e.getMessage());
	}
 }
 public String GetBrowser() {
	 String browser=pro.getProperty("browser");
	return browser;
}
}
