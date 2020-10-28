package testNGActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act6 {
	WebDriver driver;
	@BeforeMethod

	public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
	@Test
	public void applyToJob()
	{
		driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
		String pagetitle = driver.findElement(By.xpath("//*[@id=\"post-7\"]/header/h1")).getText();
		System.out.println("page title is "+pagetitle);
		Assert.assertEquals(pagetitle, "Jobs");
		driver.findElement(By.id("search_keywords")).sendKeys("Testing");
		driver.findElement(By.id("search_location")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[2]/a"));
		System.out.println(link.getText());
		link.click();
		 
		//driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/div[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"post-1451\"]/div/div/div/div[3]/input")).click();
		String email_id = driver.findElement(By.xpath("//*[@id=\"post-1451\"]/div/div/div/div[3]/div/p/a")).getText();
		System.out.println("Email id is " +email_id);
	}
	
	@AfterMethod
	public void logout()
	{
		driver.close();
	}

}
