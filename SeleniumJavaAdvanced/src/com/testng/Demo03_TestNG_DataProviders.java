package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo03_TestNG_DataProviders {

	//Approach 1
	
/*
	@DataProvider
	public Object[][] dataProvidersDemo(){
		Object[][] data = new Object[2][3];
		
		data[0][0]="Sumit";
		data[0][1]=29;
		data[0][2]="Hassan";
		data[1][0]="Suhas";
		data[1][1]=32;
		data[1][2]="Bangalore";
		return data;
		
	}
	*/
	
	//Approach 2
	
	@DataProvider
	public Object[][] dataProvidersDemo(){
		
		return new Object[][] {
			{"Sumit", 29, "Hassan"},
			{"Suhas", 32, "Bangalore"},
			{"Mahesh", 24, "Mysore"}	
		};
		
		
	}
	
	@Test(dataProvider = "dataProvidersDemo")
	public void testa(String name,int age,String address) {
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Address is "+address);
		System.out.println("----------------------");
		
	}
	

	
}
