package com.testng;

import org.testng.annotations.Test;

public class Demo04_TestNG_DependsOn {

	@Test
	public void dependsOnDemo() {
		System.out.println("Depends on demo");
	}

	@Test(dependsOnMethods = { "dependsOnDemo" })
	public void testA() {

		System.out.println("testA will be executed after excution of dependsOnDemo test ");

	}
	
	@Test(dependsOnMethods = { "testA" })
	public void testB() {

		System.out.println("testB will be executed after excution of testA test ");

	}

}
