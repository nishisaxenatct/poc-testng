package com.states.texas.base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	@BeforeSuite(description="This is base class before Suite")
	public void beforeSuite(){
		System.out.println("Test BaseClass before Suit");
	}
	
	@BeforeMethod(description="This is Base class before Method")
	public void baseClassBeforeMethod(){
		
		System.out.println("Test BaseClass before Method");
		
	}

}
