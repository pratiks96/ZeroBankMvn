package com.zeroBank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.zeroBank.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new java.util.Properties();
			FileInputStream ip=new FileInputStream("H:\\Pratik_Testing\\Eclipse workspace\\ZeroBank\\src\\main\\java\\com\\zeroBank\\qa\\config\\Config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "H:\\Pratik_Testing\\Eclipse workspace\\ZeroBank\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "H:\\Pratik_Testing\\Eclipse workspace\\ZeroBank\\Drivers\\geckodriver.exe");
			driver=new ChromeDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);//press ctrl & curser over page load timeout click it...so it will go to TestUtil class
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
	

}
}