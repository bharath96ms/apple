package com.facebook.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.facebook.utilities.ReadConfig;

public class BaseUrl {
	
	ReadConfig rc=new ReadConfig();
	
	public static WebDriver driver;
	String baseUrl="https://www.facebook.com/";
	String username="bharath";
	String password="bharathmeshach@gmail.com";

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		if(br.equals("chrome")) 
		{
			//set the driver executable path
			System.setProperty("webdriver.chrome.driver", rc.GetBrowser());
			//instantiate the browser specific class
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}

