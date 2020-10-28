package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act3 {
	
WebDriver driver;
	
	@BeforeMethod

	public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
	@Test
	public void verifyImage()
	{
		String URL = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println("Url is "+URL);
		
	}
	
	@AfterMethod
	public void logOut()
	{
		driver.close();
	}

}
