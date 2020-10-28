package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act4 {
WebDriver driver;
	
	@BeforeMethod

	public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
	@Test
	public void getSecondHeading()
	{
		String secondheading = driver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2")).getText();
		System.out.println("Second Heading is "+secondheading);
		Assert.assertEquals(secondheading, "Quia quis non");
		System.out.println("Both the headings are matching");
		
	}
	
	@AfterMethod
	public void logOut()
	{
		driver.close();
	}

}
