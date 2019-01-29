package com.states.texas;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Ignore
public class CalculatorTest1 {
	
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
	
	
	
	
	@Test(description ="Verify the Addition of the Calculator", timeOut=100, enabled=true, priority=1)
	public void additionTest(){
		
		//Arrange
		
		//int result;
	
		//Act
		result = cal.addition(10, 20);
			
		//Assert
		
		Assert.assertEquals(result, 30);
		
	}
	
	@Test(description="Verify substraction in Calculator", priority=2)
	public void substractionTest(){
		
		//Arrange
		
		
		//int result;
		
		//Act
		
		result = cal.substraction(30, 20);
		
		//Assert
		
		Assert.assertEquals(result, 10);
	}
	
	@Test(description="Verify the multiplication in Calculator", priority=3)
	public void multiplicationTest(){
		
		//Arrange
		
		
		//int result;
		
		//Act
		result = cal.multiplication(10, 5);
		
		//Assert
		Assert.assertEquals(result, 50);
	}
	
	@Test(description="Verify the Division for Calculator", priority=4)
	
	public void divisionTest(){
		
		//Arrange
		
		//int result;
		
		//Act
		result = cal.division(25, 5);
		
		//Assert
		Assert.assertEquals(result, 5);
	}

}
