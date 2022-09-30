package filehandling;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_ReadingFromIt {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream ip;

	public static void main(String[] args) throws Exception {
		// 1st Step - Create the object of Properties File
        prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir") +  "\\src\\test\\java\\filehandling\\rediff.properties";
		
		//2nd Step - create the object of FileInputStream(to read data mostly in form of sequence of bytes)
		ip = new FileInputStream(path);
		
		//3rd Step - this will load the file
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("usernameXpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("signinButtonXpath"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.get(prop.getProperty("url"));
		 * driver.findElement(By.xpath(prop.getProperty("xpathUsername"))).sendKeys(prop
		 * .getProperty("username"));
		 * driver.findElement(By.xpath(prop.getProperty("xpathPassword"))).sendKeys(prop
		 * .getProperty("password"));
		 * driver.findElement(By.xpath(prop.getProperty("xpathSignInButton"))).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath(prop.getProperty("xpathLogout"))).click();
		 */

	}

}
