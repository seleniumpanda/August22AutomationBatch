package oct13th_2022_session;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables_Concept {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		String companyName = "Rajeshwari Cans";

		List<WebElement> allCompanyNames = driver
				.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));

		List<WebElement> allCurrentPrices = driver
				.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));

		System.out.println("Total companies are : " + allCompanyNames.size());
		System.out.println("Total current prices are : " + allCurrentPrices.size());
		
		
		for(int i=0 ; i<allCompanyNames.size(); i++) {
			if(companyName.equals(allCompanyNames.get(i).getText())) {
			System.out.println(allCompanyNames.get(i).getText() + " ------" + allCurrentPrices.get(i).getText());
		      break;
			}
	}
	}
}
