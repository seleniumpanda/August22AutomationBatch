package oct20th_2022_session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_using_Actions {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://jqueryui.com/draggable/");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions actions = new Actions(driver);
		WebElement rightclickonMe = driver.findElement(By.cssSelector("span.context-menu-one.btn.btn-neutral"));
		actions.contextClick(rightclickonMe).build().perform();

		List<WebElement> options = driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root"));
		System.out.println("The various webelements after right click are : ");
		for (WebElement element : options) {
			System.out.println(element.getText());
		}

	}

}
