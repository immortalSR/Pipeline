package com.Itvedant.TestNGpackages;

import org.testng.Assert;
import org.testng.annotations.Test;


public class hardAssertionCode {

	@Test
	public void hardAssertion() {
	
	
		String expectedText="suyash";
		
		String actualText="yash";
		
		System.out.println("Asserting (Comparing actual and expected result)");	
	
		Assert.assertEquals(expectedText, actualText,"hey...");									//hard assertion happening... and both strings are not equal and test fail
		
		System.out.println("Assertig other");										// code will not execute futher if assertEquals fails 
		
}
}