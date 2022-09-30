package waitconditions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaits {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//if you give 10 seconds, it will wait for 10 seconds even though the webelement has come in 2 secs
		
		//Thread.sleep(1000); is a form of explicit wait
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login1")));
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("seleniumpanda@rediffmail.com");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Selenium@123");
		
		

		wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
		WebElement signinBtn = driver.findElement(By.name("proceed"));
		signinBtn.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("rd_logout")));
		WebElement logoutLink = driver.findElement(By.className("rd_logout"));
		logoutLink.click();

	}

}
