package com.programs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {

	
	@BeforeSuite
	public void beforeSuiteSetup() {
		System.out.println("Before Suite Setup Done");
	}
	
	@AfterSuite
	public void afterSuiteSetup() {
		System.out.println("After Suite Tear down Done");
	}
	
	
	@BeforeTest
	public void beforeTestSetUp() {
		System.out.println("Before Test Setup Done");
	}
	
	@AfterTest
	public void afterTestTearDown() {
		System.out.println("After Test tear down done");
	}
	
	
	
	@BeforeClass
	public void beforeClassSetUp() {
		System.out.println("Before Class Setup Done");
	}
	
	public void afterClassTearDown() {
		System.out.println("After Class tear down done");
	}
	
	@BeforeMethod
	public void beforeMethodSetup() {
		System.out.println("Before Method setup done");
	}
	
	@AfterMethod
	public void afterMethodTearDown() {
		System.out.println("After Method tear down done");
	}
	
		
	@Test(priority=1)
	public void test1() {
		System.out.println("Test1 Method Executed");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2 Method Executed");
	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("Test3 Method Executed");
	}
		
	@Test(priority=4)
	public void test4() {
		System.out.println("Test4 Method Executed");
	}
	

	@Test(priority=5)
	public void test5() {
		System.out.println("Test5 Method Executed");
	}
	
	
	
}
