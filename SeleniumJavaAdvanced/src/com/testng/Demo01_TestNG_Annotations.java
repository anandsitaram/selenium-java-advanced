package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo01_TestNG_Annotations {

	@Test
	public void TestA() {

		System.out.println(" ------ Test Case A ------ ");
	}
	
	@Test
	public void TestB() {

		System.out.println(" ------ Test Case B ------ ");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("@BeforeMethod - It will run before each test method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("@AfterMethod - It will run after each test method");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("@BeforeClass - It will run before the first test method invoked in current class");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("@AfterClass - It will run after all the  test methods have been run ");

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println(
				"@BeforeTest - It will run before any  test method belonging to the classes inside <test> tag");

	}

	@AfterTest
	public void afterTest() {

		System.out.println(
				"@AfterTest - It will run after all test methods belonging to the classes inside <test> tag have ran ");

	}

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println(
				"@BeforeSuite - It will run before all the tests inside test suite");

	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println(
				"@AfterSuite - It will run after all the tests inside test suite have ran");
	}

}
