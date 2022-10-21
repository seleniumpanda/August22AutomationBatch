package oct20th_2022_session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_TestNG_Class2 {
	
public static WebDriver driver;
	
	@Test(threadPoolSize = 2, invocationCount = 2)
	public void testcase1() {
		System.out.println("test Case 1: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://easemytrip.com");
	}
	
	@Test(threadPoolSize = 2, invocationCount = 2)
	public void testcase2() {
		System.out.println("test Case 2: " + Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://rediff.com");
	}
	
	@Test(threadPoolSize = 2, invocationCount = 2)
	public void testcase3() {
		System.out.println("test Case 3: " + Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://amazon.com");
	}

}


