package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act2 {
	
	WebDriver driver;
	
	@BeforeMethod

	public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
	@Test
	public void getHeading()
	{
	String heading = driver.findElement(By.className("entry-title")).getText();
	System.out.println("heading is: " +heading);
	Assert.assertEquals(heading,"Welcome to Alchemy Jobs");
	System.out.println("Both the headings are same");
		
	}
	
	@AfterMethod
	public void logOut()
	{
		driver.close();
	}

}
