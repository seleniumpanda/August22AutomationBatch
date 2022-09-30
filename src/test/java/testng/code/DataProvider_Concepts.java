package testng.code;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concepts {
	
	//used for Data Parameterization
	//using mulitple input parameters to validate one logic to get output
	
	//login logic - un/pwd    u1/p1,  u2/p2, u3/p3, u4/p4
	
	@Test(dataProvider = "getData") //The name of the data provider for this test method.
	public void dataMatrix(String Browser, String username, String password, int employee_id) {
		
	}
	
	//Rule 1: Returns a 2 Dimensional Object Array
	//Rule 2: You have to enter the values as in rows and cols of this 2-D Obj Array
	//Rule 3: you have to pass the dataProvider annotation and equate it to the name of the method provided in the @DataProvider
	//Rule 4: the number of input parameters in the @Test method will be equal to the number of cols of the 2-D object Array

	//The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals 
	//to the name of this annotation.
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Chrome";
		data[0][1] = "username1";
		data[0][2] = "password1";
		data[0][3] = 123;
		
		data[1][0] = "Firefox";
		data[1][1] = "username2";
		data[1][2] = "password2";
		data[1][3] = 124;
		
		data[2][0] = "IE";
		data[2][1] = "username3";
		data[2][2] = "password3";
		data[2][3] = 125;
		
		return data;
		
	}
}
