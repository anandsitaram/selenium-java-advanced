package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo02_TestNG_Parameters_Optional {

	@Parameters({"name","address"})
	@Test
	public void TestA(@Optional("Test QA") String name,@Optional("Mysore") String address) {

		System.out.println("Name is "+name+" and address is "+address);
	}
	

	
}
