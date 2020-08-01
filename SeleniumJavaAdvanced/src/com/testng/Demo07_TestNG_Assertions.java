package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo07_TestNG_Assertions {

	
	@Test
	public void hardAssertionA() {
		
		String expected ="Testing QA";
		System.out.println("hardAssertion Before assertion");
		Assert.assertEquals("Testing QAA", expected);
		System.out.println("hardAssertion After assertion");
	}

	@Test
	public void hardAssertionB() {
		
		System.out.println("hardAssertionB Before assertion");
		Assert.assertEquals(true, true);
		System.out.println("hardAssertionB After assertion");
	}

	@Test
	public void softAssertionA() {
		
		SoftAssert softAssert = new SoftAssert();
		String expected ="Testing QA";
		System.out.println("softAssertionA Before assertion");
		softAssert.assertEquals("Testing QAA", expected);
		System.out.println("softAssertionA After assertion");
		softAssert.assertAll();    // -> Mandatory
	}
	
	
	@Test
	public void softAssertionB() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssertionB Before assertion");
		softAssert.assertEquals(25, 25);
		System.out.println("softAssertionB After assertion");
		softAssert.assertAll();    // -> Mandatory
	}



}
