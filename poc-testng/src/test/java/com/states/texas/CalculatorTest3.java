package com.states.texas;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.states.texas.base.BaseTest;

//@Ignore
public class CalculatorTest3 extends BaseTest {
	
	Calculator cal; 
	int result;
	
	@BeforeMethod
	public void beforeMethod(){
		
		System.out.println("Creating object in beforeMethod");
		cal = new Calculator();
		
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("printing result" +result);
		result = 0;
		
	}
	
	
	@DataProvider(name="addition")
	public Object[][] dataProviderAdditionTest(){
		return new Object[][] {
			    {2, 3, 5},
			    {10, 30, 40},
			    {40, 12, 52}
			};
		
	}
	
	@Test(dataProvider="addition",description ="Run the test Case  multiple times with different set of data", timeOut=100, enabled=true, priority=1)
	public void additionTest(int a,int b, int output){
		
		//Arrange
		
		//int result;
	
		//Act
		result = cal.addition(a, b);
		
			
		//Assert
		
		Assert.assertEquals(result, output);
		
	}
	
	
	@DataProvider(name="substraction")
	public Object[][] dataProvidersubstractionTest(){
		
		return new Object[][]{
			{10, 5, 5},
			{30, 10, 20},
			{50, 60, -10}
		};
		
	}
	
	
	
	@Test(dataProvider="substraction",description="Verify substraction in Calculator", priority=2)
	public void substractionTest(int a, int b, int output){
		
		//Arrange
		
		
		//int result;
		
		//Act
		
		result = cal.substraction(a, b);
		
		//Assert
		
		Assert.assertEquals(result, output);
	}
	
	@DataProvider(name="multiplication")
	public Object[][] dataProviderMultiplicationTest(){
		
		return new Object[][]{
			
			{10, 2, 20},
			{20, 20, 400},
			{30, 9, 270}
		};
		
	}
	
	@Test(dataProvider="multiplication",description="Verify the multiplication in Calculator", priority=3)
	public void multiplicationTest(int a, int b, int output){
		
		//Arrange
		
		
		//int result;
		
		//Act
		result = cal.multiplication(a, b);
		
		//Assert
		Assert.assertEquals(result, output);
	}
	
	@DataProvider(name="division")
	public Object[][] dataProviderDivisionTest(){
		return new Object[][]{
			
			{9, 3, 3},
			{10, 2, 5},
			{50, 25, 2}
			
		};
	}
	
	@Test(dataProvider="division",description="Verify the Division for Calculator", priority=4)
	
	public void divisionTest(int a, int b, int output){
		
		//Arrange
		
		//int result;
		
		//Act
		result = cal.division(a, b);
		
		//Assert
		Assert.assertEquals(result, output);
	}

}
