package com.testng;

import org.testng.annotations.Test;

public class Demo05_TestNG_Priority {

	@Test(priority = 0,enabled = true)
	public void testA() {
		System.out.println("Test A priority = 0,enabled = true");
	}

	@Test(priority = 2)
	public void eTest() {

		System.out.println("eTest priority = 2");

	}
	
	@Test(priority = 2)
	public void bTest() {

		System.out.println("bTest priority = 2");

	}
	
	
	@Test(priority = 1,enabled = false)
	public void testC() {

		System.out.println("Test C priority = 1 ,enabled = false");

	}
	
	
	@Test
	public void testD() {
   
		System.out.println("Test D");

	}

}
