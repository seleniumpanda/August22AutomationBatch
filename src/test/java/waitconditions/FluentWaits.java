package waitconditions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				                                                 .pollingEvery(Duration.ofSeconds(10))
				                                                 .ignoring(NoSuchElementException.class);
		
		WebElement anything = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return null;
			}
			
		} );
		

	}

}
