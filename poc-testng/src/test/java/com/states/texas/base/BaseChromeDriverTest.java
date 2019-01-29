package com.states.texas.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseChromeDriverTest {
	 protected WebDriver driver;
	 
  @BeforeMethod(description="Create ChromeDriver")
  public void createChromeDriver() {
	  
	  
	  String path = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
	  
  }

  @AfterMethod(description="Close the Chrome Driver")
  public void closeChromeDriver() {
	  driver.close();
  }

}
