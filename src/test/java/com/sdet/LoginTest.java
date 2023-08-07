package com.sdet;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivaprasad.baad\\eclipse-workspace\\com.maven\\drivers");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/");
		
		WebElement signIn = driver.findElement(By.xpath("//a[@href='/login']"));
		signIn.click();
		
		WebElement userName = driver.findElement(By.xpath("//*[@placeholder='Email Address']"));
		userName.clear();
		userName.sendKeys("test@email.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
		password.clear();
		password.sendKeys("abcabc");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='login']"));
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Assert.assertEquals("My Courses", driver.findElement(By.xpath("//h1")).getText());
		
		driver.close();
	}

}
