package com.Itvedant.TestNGpackages;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertionCode {
	
	@Test
	public void testSoftAssertion() {
		
	SoftAssert soft=new SoftAssert();
	
		String expectedText="suyash";
		
		String actualText="suyash";
		
		System.out.println("Asserting (Comparing actual and expected result)");	
	
		soft.assertEquals(expectedText, actualText);									//in soft assertion happening... and both strings are not equal and test fail
		
		System.out.println("Assertion complet");										// even though both string are not equal code will still execute futher
		
		soft.assertAll();
		
	}

}
