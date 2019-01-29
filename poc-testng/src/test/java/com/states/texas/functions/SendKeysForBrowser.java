package com.states.texas.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeysForBrowser {
	
	public void sendKeysOperation(WebDriver driver, String keyword, String locatorType, String locaterValue, String parameter){
		
		driver.findElement(By.id(locaterValue)).sendKeys(parameter);
			
		
		
		
	}

}
