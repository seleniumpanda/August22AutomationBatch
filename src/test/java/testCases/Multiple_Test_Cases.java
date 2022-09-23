package testCases;

import org.testng.annotations.Test;

import dataProvider_MultipleTestCases.DataRepository;

public class Multiple_Test_Cases {
	
	/* 1 test case - 1 DataProvider

	50 test cases - 1 DataProvider ??

	1. I will create a separate package > A class > @DataProvider
	2. I will create another package where in I will write all my Test Cases
	3. The @DataProvider's method I have to make it static - this is to connect with the other Classes
	4. Linking process @Test(dataProviderClass = ClassName.class) 
	5. Again in the test cases I have to pass the (dataProvider = "nameoftheMethodInsidetheDataProvider")
	6. In all the test cases have to pass the input parameters == no of cols
	7. pass Method (java.lang.reflect) as an input parameter inside the @DataProvider methodname (parameterize) */

	
	@Test(dataProvider = "getData", dataProviderClass = DataRepository.class)
	public void launchUrl(String Browser, String username, String password, int EmployeeID) {
		
	}
	
	@Test(dataProvider = "getData", dataProviderClass = DataRepository.class)
	public void clickOnSignIn(String Browser, String username, String password, int EmployeeID) {
		
	}
	
	@Test(dataProvider = "getData", dataProviderClass = DataRepository.class)
	public void Credentials(String Browser, String username, String password, int EmployeeID) {
		
	}
	
	@Test(dataProvider = "getData", dataProviderClass = DataRepository.class)
	public void logOut(String Browser, String username, String password, int EmployeeID) {
		
	}
	
	@Test(dataProvider = "getData", dataProviderClass = DataRepository.class)
	public void goBacktoLandingPage(String Browser, String username, String password, int EmployeeID) {
		
	}
}
