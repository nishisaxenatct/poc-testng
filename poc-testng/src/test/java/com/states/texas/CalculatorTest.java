package com.states.texas;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class CalculatorTest {
	
	@Test(description ="Verify the Addition of the Calculator", timeOut=100, enabled=true, priority=1)
	public void additionTest(){
		
		//Arrange
		
		Calculator cal = new Calculator();
		int result;
	
		//Act
		result = cal.addition(10, 20);
			
		//Assert
		
		Assert.assertEquals(result, 30);
		
	}
	
	@Test(description="Verify substraction in Calculator", priority=2)
	public void substractionTest(){
		
		//Arrange
		
		Calculator cal = new Calculator();
		int result;
		
		//Act
		
		result = cal.substraction(30, 20);
		
		//Assert
		
		Assert.assertEquals(result, 10);
	}
	
	@Test(description="Verify the multiplication in Calculator", priority=3)
	public void multiplicationTest(){
		
		//Arrange
		
		Calculator cal = new Calculator();
		int result;
		
		//Act
		result = cal.multiplication(10, 5);
		
		//Assert
		Assert.assertEquals(result, 50);
	}
	
	@Test(description="Verify the Division for Calculator", priority=4)
	
	public void divisionTest(){
		
		//Arrange
		Calculator cal = new Calculator();
		int result;
		
		//Act
		result = cal.division(25, 5);
		
		//Assert
		Assert.assertEquals(result, 5);
	}

}
