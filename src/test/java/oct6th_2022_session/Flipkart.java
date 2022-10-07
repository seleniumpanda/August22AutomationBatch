package oct6th_2022_session;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static WebDriver driver;
    public static ChromeOptions options;
    public static FirefoxOptions options1;
	
    public static void main(String[] args) {
		
    	options = new ChromeOptions();
		options.setHeadless(true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/shirt/men-shirt/casual-shirt/pr?sid=clo,ash,axc,mmk,kp7&otracker=categorytree&otracker=nmenu_sub_Men_0_Casual%20Shirts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       List<WebElement> CasualShirts =  driver.findElements(By.cssSelector("div._2WkVRV"));
       System.out.println("Total casual shirts in this page is : " + CasualShirts.size());
       
       List<WebElement> CasualShirtsPrice =  driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
       
       for(int i=0 ; i<CasualShirts.size(); i++) {
    	System.out.println(CasualShirts.get(i).getText() + "---------" + CasualShirtsPrice.get(i).getText());   
       }
       
       
       
       
 
       driver.quit();
	}

}
