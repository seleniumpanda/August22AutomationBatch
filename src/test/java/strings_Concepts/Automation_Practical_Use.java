package strings_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Practical_Use {
	
	public static WebDriver driver;
	//public static String browser = new String("chrome");
	public static String browser = "firefox";

	public static void main(String[] args) {
	
	//To test in a particular
		
	
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}else {
		System.out.println("Not opening in either");
	}

	}

}
