package testNGActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act1 {
	
	WebDriver driver;
	
@BeforeMethod

public void logIn()

{
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs");
	
}
	

@Test
public void verifyTitle()
{
	String page_title = driver.getTitle();
	System.out.println("Page title is: " +page_title);
	Assert.assertEquals(page_title, "Alchemy Jobs – Job Board Application");
}

@AfterMethod
public void logOut()
{
	driver.close();
}
}
