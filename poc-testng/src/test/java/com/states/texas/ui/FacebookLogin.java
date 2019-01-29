package com.states.texas.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.states.texas.base.BaseChromeDriverTest;

public class FacebookLogin extends BaseChromeDriverTest {
  
	@BeforeMethod(description="Starting the Browser")
	public void startBrowser(){
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(description="Verify the Login page with valid userid and password")
  public void loginSite() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("nishisaxenatct@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("rajendra@1987");
		
		driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
		
		
		
	  
	
  }
}
