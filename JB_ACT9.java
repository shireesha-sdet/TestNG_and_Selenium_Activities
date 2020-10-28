package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_ACT9 {
	WebDriver driver;
	@BeforeMethod

	public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
	}
	
	@Test
	public void verifySitebackend()
	{
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		String dashbaord = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/h1")).getText();
		Assert.assertEquals(dashbaord, "Dashboard");
		System.out.println("User logged in successfully");
		driver.findElement(By.xpath("//*[text() = 'Job Listings'][1]")).click();
		driver.findElement(By.xpath("//*[text() = 'Add New']")).click();
	}


}
