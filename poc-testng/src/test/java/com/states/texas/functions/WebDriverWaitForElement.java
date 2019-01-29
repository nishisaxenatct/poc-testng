package com.states.texas.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitForElement {
	
	public void waitForElement(WebDriver driver, long timestamp){
		
		driver.manage().timeouts().implicitlyWait(timestamp, TimeUnit.SECONDS);
		
		/*WebDriverWait wait = new WebDriverWait(driver, timestamp);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));*/
		
	}

}
