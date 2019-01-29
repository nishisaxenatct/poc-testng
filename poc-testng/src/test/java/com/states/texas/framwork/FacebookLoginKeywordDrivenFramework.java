package com.states.texas.framwork;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.states.texas.operation.KeywordExecuter;
import com.states.texas.utility.ExcelUtility;

public class FacebookLoginKeywordDrivenFramework {
	
	
	
	@DataProvider(name="keywordDrivernData")
	public Object[][] dataProvider() throws IOException{
		
		Object[][] result;
		ExcelUtility utility = new ExcelUtility();
		result = utility.getKeywordDrivenDataFromExcel("keyWordDriven.xlsx", "TC01");
		return result;
		
		
	}
	
  @Test(dataProvider="keywordDrivernData", description="Verify KeywordDriven Framework")
  public void loginFacebookWithFDD(String testSteps, String keyWord, String locaterType, String locaterValue, String parameter, String handlenull) {
	  
	  KeywordExecuter objKeyword = new KeywordExecuter();
	  objKeyword.executeOperation(keyWord, locaterType, locaterValue, parameter);
	  
  }
}
