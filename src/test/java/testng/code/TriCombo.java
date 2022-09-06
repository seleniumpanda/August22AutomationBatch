package testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriCombo {
	public static WebDriver driver;

	// @BeforeMethod, @Test, @AfterMethod

	@BeforeMethod
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
	}

	@Test
	public void businessEmailTest() throws InterruptedException {
		driver.findElement(By.cssSelector("a.bmailicon.relative")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class = 'search-icons']/preceding::a[1]")).click();
		//driver.navigate().to("https://www.rediff.com");
		
		// whatever page selenium found here after coming back

	}
	
	  @Test
	  public void clickonSignLinkandEnterLoginCredentials() {
	  driver.findElement(By.className("signin")).click(); 
	  driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	  driver.findElement(By.id("password")).sendKeys("Selenium@123");
	  driver.findElement(By.className("signinbtn")).click();
	  }
	 

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
