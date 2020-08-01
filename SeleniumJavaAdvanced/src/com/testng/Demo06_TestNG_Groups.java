package com.testng;

import org.testng.annotations.Test;

public class Demo06_TestNG_Groups {

	@Test(groups = {"sanity","regression"})
	public void testA() {
		System.out.println("Test A with groups {\"sanity\",\"regression\"}");
	}


	@Test(groups = {"sanity"})
	public void testb() {

		System.out.println("Test B with groups {\"sanity\"}");

	}
	
	
	@Test(groups = {"regression"})
	public void testC() {

		System.out.println("Test C with groups {\"regression\"}");

	}
	


}
