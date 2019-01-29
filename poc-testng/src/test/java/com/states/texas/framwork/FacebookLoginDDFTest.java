package com.states.texas.framwork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.states.texas.base.BaseChromeDriverTest;
import com.states.texas.utility.ExcelUtility;

/*DataDriverframwork*/
public class FacebookLoginDDFTest extends BaseChromeDriverTest{
	
	@BeforeMethod(description="Launching Browser")
	public void startBrowser(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(description="Verify the Login page with valid userid and password")
	  public void loginSiteDDF() throws InterruptedException, IOException {
		
		//Arrange
		AtomicInteger objAI = new AtomicInteger();
		String[][] result;
		ExcelUtility utility = new ExcelUtility();
		
		//Act
		
		result = utility.getDataFromExcel("testdata.xlsx", "Sheet1");
		for(int i =0;i<=result.length-1;i++){
			System.out.println(i);
			String username = result[i][0];
			String password = result[i][1];
			
			driver.get("https://www.facebook.com");
			
           driver.findElement(By.id("email")).sendKeys(username);
			
			driver.findElement(By.id("pass")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();	
			
			
			if(driver.getTitle().equals("Facebook")){
				System.out.println("Test Case pass");
			}else{
				System.out.println("Test Case Failed");
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(screenshot, new File("screenshots\\screenshot" + objAI.incrementAndGet() +".png"));
			}
			
		
		
			
		}
		
			
			
		
	  }
	

}
