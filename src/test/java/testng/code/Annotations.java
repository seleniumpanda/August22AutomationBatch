package testng.code;

import org.testng.annotations.*;
//@BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod >@Test > @AfterMethod >@AfterClass > @AfterTest  > @AfterSuite
//if there is no @Test in your java class it will not get executed

public class Annotations {
	
	@BeforeSuite
    public void beforeSuite() {
		System.out.println("This is before suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method method");
	}
	

	
	  @Test 
	  public void mainMethodReplacerMethod() {
	  System.out.println("This is my Test Case"); }
	 
	
	
	@AfterMethod
	public void aftermethodMethod() {
		System.out.println("This is after method method");
	}
	
	@AfterClass
	public void aferclassMethod() {
	  System.out.println("This is after class method");	
	}
		
	@AfterTest
	public void aftertestMethod() {
		System.out.println("This is after test method");
	}
	
	@AfterSuite
	public void aftersuiteMethod() {
		System.out.println("This is after suite test method");
	}
		
		
		
		
		
		
		
		
	}


