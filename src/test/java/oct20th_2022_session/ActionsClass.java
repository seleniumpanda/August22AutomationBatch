package oct20th_2022_session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		//Mouse Actions - Left Click, Right Click, Double Click, Drag, Drop
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		Actions actions = new Actions(driver);
		WebElement signinLink = driver.findElement(By.className("signin"));
		actions.click(signinLink).build().perform();
		WebElement usernametextbox = driver.findElement(By.id("login1"));
		actions.click(usernametextbox).sendKeys("seleniumpanda@rediffmail.com").build().perform();
		WebElement passwordtextbox = driver.findElement(By.id("password"));
		actions.click(passwordtextbox).sendKeys("Selenium@123").build().perform();
		WebElement signinbutton = driver.findElement(By.name("proceed"));
		actions.click(signinbutton).build().perform();
		

		
	

	}

}
