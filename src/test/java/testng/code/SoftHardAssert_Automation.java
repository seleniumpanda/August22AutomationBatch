package testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.*;

public class SoftHardAssert_Automation {
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();

	@Test(priority = 1) // PASS
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertAll();

	}

	@Test(priority = 2, dependsOnMethods = "launchUrl")
	public void clickonsigninLink() {

		WebElement signinLink = driver.findElement(By.className("signin"));
		softassert.assertTrue(signinLink.isEnabled());
		signinLink.click();
		
		softassert.assertAll();
	}

	@Test(priority = 3, dependsOnMethods = { "launchUrl", "clickonsigninLink" }, alwaysRun = true)
	public void enterCredentials() {
		Assert.assertTrue(true);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();

	}

	@Test(priority = 4, dependsOnMethods = { "launchUrl", "clickonsigninLink", "enterCredentials" }, alwaysRun = true)
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();
	}

	@Test(priority = 5, dependsOnMethods = { "launchUrl", "clickonsigninLink", "enterCredentials",
			"logout" }, alwaysRun = true) // FAIL
	public void rediffHomeLinkClick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}

}
