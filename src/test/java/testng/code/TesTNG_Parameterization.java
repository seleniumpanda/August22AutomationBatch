package testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//testng.xml file is the most important file for testng projects
//parameterization, batchrunning, parallel execution

//paramterization - p1u1, p2u2, p3u3

//Browser = Chrome
//url = 
//username
//password

public class TesTNG_Parameterization {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser" , "url" , "username", "password"})
	public void rediffParameterization(String Browser, String url, String username, String password) {
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		} else if (Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
		
	}
	

}
