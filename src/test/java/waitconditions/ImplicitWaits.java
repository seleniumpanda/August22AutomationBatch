package waitconditions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaits {

	public static WebDriver driver;

	public static void main(String[] args) {
		// it is a smart wait

		// even if you ask Selenium to wait for 10 seconds - but if Selenium can find
		// that Web Element or whatever
		// it is doing in 3 seconds then Selenium will proceed with the next operation
		// implicit wait is for the whole program
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
	}

}
