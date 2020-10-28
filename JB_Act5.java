package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act5 {
	WebDriver driver;
	@BeforeMethod

	public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
	@Test
	public void navigateToJob()
	{
		driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
		String pagetitle = driver.findElement(By.xpath("//*[@id=\"post-7\"]/header/h1")).getText();
		System.out.println("page title is "+pagetitle);
		Assert.assertEquals(pagetitle, "Jobs");
		System.out.println("Verified that user is in correct page");
	}

	@AfterMethod
	public void logOut()
	{
		driver.close();
	}
	
}
