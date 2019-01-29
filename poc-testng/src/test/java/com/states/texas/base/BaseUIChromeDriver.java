package com.states.texas.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUIChromeDriver {
	
	//instance of singleton class
	
	private static BaseUIChromeDriver instanceOfBaseUIChromeDriver = null;
	
	private WebDriver driver;
	
	//Private Constructor in case of Singleton
	
	private  BaseUIChromeDriver() {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//to create an instance class
	
	public static BaseUIChromeDriver getinstanceOfBaseUIChromeDriver(){
		
		if(instanceOfBaseUIChromeDriver==null){
			instanceOfBaseUIChromeDriver= new BaseUIChromeDriver();
		}
		return instanceOfBaseUIChromeDriver;
		
	}
	
	//to get driver
	
	public WebDriver getDriver(){
		
		return driver;
	}


	/*protected static WebDriver driver;

	public static WebDriver createChromeDriver() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}*/
}
