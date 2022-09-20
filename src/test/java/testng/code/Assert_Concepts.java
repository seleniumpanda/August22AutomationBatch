package testng.code;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concepts {
	
	//Validation
	//Assert vs SoftAssert
	//Assert - it will not execute the logic after it and it will move to the next Test Case
	
	//SoftAssert
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void checkingOutPut() {
		String S1 = "Hero";
		String S2 = "Zero";
	    softassert.assertTrue(S1.equals(S2)); 
	    System.out.println(2 + 3);        
	    
	    Assert.assertNotEquals(S1, S2);
	    System.out.println("Hello World");
	    
	    softassert.assertAll();
	}
	
	@Test
	public void somethingElse() {
		int i = 10;
		int j = 20*i;
		System.out.println(j);
	}

}
