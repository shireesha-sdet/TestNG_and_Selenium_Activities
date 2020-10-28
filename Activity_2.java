package testNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity_2 {
  
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }
  
  @Test(priority =1)
  public void test1()
  {
	  String title = driver.getTitle();
	  System.out.println("Page tilte is " +title);
	  Assert.assertEquals(title, "Target Practice");
  }
  
  @Test
  public void test2()
  {
	 WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
	  Assert.assertTrue(blackbutton.isDisplayed());
	  Assert.assertEquals(blackbutton.getText(), "black");
  }
  
  @Test(enabled = false)
  public void test3()
  {
	  String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  

  @Test
  public void test4()
  {
	  throw new SkipException("Skipping test case"); 
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
