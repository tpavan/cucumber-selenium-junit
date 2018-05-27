package com.selftest.steps;

import java.util.Map;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;

public class Vehicle {
	
	public Map<String, String> map;
	
	@Test
	@Given("^vehicle name and address$")
	public void printDetails(){
		System.out.println("Khunti");
	}
	
	@Given("^read excel data$")
	public void readExcelData(){
		System.out.println("Read test data");
	}
	
}
