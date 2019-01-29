package com.states.texas.functions;

import org.openqa.selenium.WebDriver;

import com.states.texas.base.BaseUIChromeDriver;

public class NavigateURL {
	
	
	
	public void navigateURl(WebDriver driver, String locaterType, String locaterValue, String parameter){
		
		//WebDriver driver = BaseUIChromeDriver.getinstanceOfBaseUIChromeDriver().getDriver();
		
		driver.get(parameter);
		
	}
	
	/*public static void main(String[] args){
		
		WebDriver driver = BaseUIChromeDriver.getinstanceOfBaseUIChromeDriver().getDriver();
		System.out.println(driver);

		
	}*/
	
	

}
