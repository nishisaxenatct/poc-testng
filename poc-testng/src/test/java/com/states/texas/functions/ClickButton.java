package com.states.texas.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickButton {
	
	public void clickPageButton(WebDriver driver, String locaterType, String locaterValue){
		
		driver.findElement(By.xpath(locaterValue)).click();
		
		
	}

}
