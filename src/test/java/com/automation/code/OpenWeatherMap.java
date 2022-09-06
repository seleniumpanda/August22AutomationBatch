package com.automation.code;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWeatherMap {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");

      WebElement elementLogo = driver.findElement(By.cssSelector("div.section.where-to"));
      File source = elementLogo.getScreenshotAs(OutputType.FILE);
      System.out.println(System.getProperty("user.dir"));
      File dest = new File(System.getProperty("user.dir") + "\\test-output\\images\\elementLogo1.png");
      

      try {
		FileHandler.copy(source, dest);
      } catch (IOException exception) {
		exception.printStackTrace();
      }
}
}