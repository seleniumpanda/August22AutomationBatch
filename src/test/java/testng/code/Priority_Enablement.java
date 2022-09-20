package testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Priority_Enablement {

	public static WebDriver driver;

	@Test(priority = 1) //PASS
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	}

	@Test(priority = 2, dependsOnMethods = "launchUrl") //FAIL
	public void clickonsigninLink() {
		 Assert.fail();
		driver.findElement(By.className("signin")).click(); //this one is not executed
       
	}

	@Test(priority = 3, dependsOnMethods = { "launchUrl", "clickonsigninLink" }, alwaysRun = true) //FAIL - element not found
	public void enterCredentials() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
	}

	@Test(priority = 4, dependsOnMethods = { "launchUrl", "clickonsigninLink", "enterCredentials" }, alwaysRun = true) //FAIL
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();
	}

	@Test(priority = 5, dependsOnMethods = { "launchUrl", "clickonsigninLink", "enterCredentials", "logout" }, alwaysRun = true) //FAIL
	public void rediffHomeLinkClick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}

}
