package handling_alerts_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_ToHandle_Alerts_Popups {
	
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("proceed")).click();
	
	//What is an Alert ??
	
	//99% people say Alert is a Class (Wrong Answer)
	
	//Alert is an interface (Correct answer)
	
	//What are the 3 important methods within Alert interface ??
	
	Alert alert = driver.switchTo().alert();
	String alertText = alert.getText();
	System.out.println("Text of this alert is: " + alertText);
	//alert.dismiss();
	alert.accept();
	
	Thread.sleep(10000);
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.name("proceed")).click();

	}

}
