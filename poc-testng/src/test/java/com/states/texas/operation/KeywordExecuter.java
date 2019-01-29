package com.states.texas.operation;

import org.openqa.selenium.WebDriver;

import com.states.texas.base.BaseUIChromeDriver;
import com.states.texas.functions.ClickButton;
import com.states.texas.functions.NavigateURL;
import com.states.texas.functions.SendKeysForBrowser;
import com.states.texas.functions.WebDriverWaitForElement;

public class KeywordExecuter {
	
	NavigateURL objBrowserFunction = new NavigateURL();
	WebDriverWaitForElement objWait = new WebDriverWaitForElement();
	WebDriver driver = BaseUIChromeDriver.getinstanceOfBaseUIChromeDriver().getDriver();
	SendKeysForBrowser objSendKeys = new SendKeysForBrowser();
	ClickButton objClickButton = new ClickButton();

	public void executeOperation(String keyWord, String locaterType, String locaterValue, String parameter) {
		
		
		switch (keyWord) {

		case "Navigate":
			objBrowserFunction.navigateURl(driver,locaterType, locaterValue, parameter);
			System.out.println(keyWord);
			break;

		case "WaitForEle":
			objWait.waitForElement(driver, 10);
			System.out.println(keyWord);
			break;

		case "sendKeys":
			objSendKeys.sendKeysOperation(driver, keyWord, locaterType, locaterValue, parameter);
			System.out.println(keyWord);
			break;
		

		case "click":
			objClickButton.clickPageButton(driver, locaterType, locaterValue);
			System.out.println(keyWord);
			break;
			

		default:
			System.out.println("Invalid Keyword");

		}
	}
	
	
}
