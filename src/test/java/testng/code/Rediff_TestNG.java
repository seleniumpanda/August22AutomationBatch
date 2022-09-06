package testng.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG {

	public static WebDriver driver;

	@Test (priority = 1)
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test (priority = 2)
	public void loginlinkClick() {
		WebElement signinLink = driver.findElement(By.className("signin"));
		if (signinLink.isDisplayed() && signinLink.isEnabled()) {
			signinLink.click();
		} else {
			System.out.println("signinLink is not enabled and is not clickable");
		}

	}

	@Test (priority = 3)
	public void loginCredentialsPageTest() {
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement signinButton = driver.findElement(By.className("signinbtn"));

		if (usernameTextBox.isDisplayed() && usernameTextBox.isEnabled() && passwordTextBox.isDisplayed()
				&& passwordTextBox.isEnabled() && signinButton.isDisplayed() && signinButton.isEnabled()) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextBox.sendKeys("Selenium@123");
			signinButton.click();
		} else {
			System.out.println("All the web elements are not enabled and cannot be located");
		}
	}

	@Test (priority = 4)
	public void tearDown() {
		driver.quit();
	}

}
