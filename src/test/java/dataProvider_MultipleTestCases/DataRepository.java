package dataProvider_MultipleTestCases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataRepository {
	
	
	@DataProvider
	public static Object[][] getData(Method name) {
		System.out.println("Test Case which has this method is: " + name.getName());
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
