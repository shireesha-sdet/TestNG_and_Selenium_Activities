package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JB_Act7 {
	WebDriver driver;
	
	@BeforeMethod
    public void logIn()

	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
	@Test
	public void createNewJob()
	{
		//click on Post a job
		driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
		//click on signin
		driver.findElement(By.xpath("//*[@id=\"submit-job-form\"]/fieldset[1]/div/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		
		//enter email id
		//driver.findElement(By.id("create_account_email")).sendKeys("shireesha.815@gmail.com");
		//job title
		driver.findElement(By.id("job_title")).sendKeys("Automation Testing");
		//location
		driver.findElement(By.id("job_location")).sendKeys("Bangalore");
		//Select Job Type
		WebElement dropdown = driver.findElement(By.id("job_type"));
		Select jobtype = new Select(dropdown);
		jobtype.selectByVisibleText("Full Time");
		
		//enter description
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("Testing job");
		driver.switchTo().defaultContent();
		//enter application name
		driver.findElement(By.id("application")).sendKeys("shireesha.815@gmail.com");
		//enter company name
		driver.findElement(By.id("company_name")).sendKeys("IBM India Pvt Ltd");
		//click on preview
		driver.findElement(By.name("submit_job")).click();
		
		//click on submit listing
		driver.findElement(By.id("job_preview_submit_button")).click();
		
		//click on jobs
		driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
		
		
	}
	
	

}
