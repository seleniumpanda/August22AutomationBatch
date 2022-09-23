package testCases;

import org.testng.annotations.Test;

import dataProvider_MultipleTestCases.DataRepository;

public class Multiple_Test_Cases {

	
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
