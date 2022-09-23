package com.automation.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSelectClassDropDown {
	
	public static WebDriver driver;
	public static Select select;
	
	@Test
	public void facebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Cena");
		driver.findElement(By.name("reg_email__")).sendKeys("JohnCena@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("JohnCena@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("JohnCena@123");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Dec");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1960");
		
		driver.findElement(By.xpath("//div[@id = 'custom_gender_container']/preceding::input[2]")).click();
		
		
	}

}
