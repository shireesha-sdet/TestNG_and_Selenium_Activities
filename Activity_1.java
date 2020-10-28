package testNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Activity_1 {
	
	WebDriver driver;
 
  @BeforeMethod
  public void logIn() throws Exception {
	 
	// System.setProperty("webdriver.geckodriver.driver","Driver_path" );
	 //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	 //capabilities.setCapability("marionette",true);
	 //Thread.sleep(10000);
	  driver = new FirefoxDriver();
	 // Thread.sleep(10000);
	  driver.get("https://www.training-support.net/");
  }

  @Test
  public void modelTestCase() {
	  
	  //Check the title of page
	String page_title =  driver.getTitle();
	System.out.println("Page Title is: " +page_title );
	Assert.assertEquals(page_title, "Training Support");
	driver.findElement(By.id("about-link")).click();
    System.out.println("New page title is: " + driver.getTitle());
    Assert.assertEquals(driver.getTitle(), "About Training Support");
	  
	  
  }
  @AfterMethod
  public void logOut() {
	  driver.quit();
  }

}
