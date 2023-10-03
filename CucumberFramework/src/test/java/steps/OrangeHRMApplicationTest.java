package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class OrangeHRMApplicationTest extends WebDriverInit {
	
	@When("User clicks on Admin Tab and verify user on Admin page")
	public void user_clicks_on_Admin_Tab_and_verify_user_on_Admin_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		
		boolean admincond = driver.findElement(By.xpath("//h6[.='Admin']")).isDisplayed();
		
		Assert.assertTrue(admincond);
	    
		Thread.sleep(3000);
	}

	@When("User clicks on Leave Tab and verify user on Leave page")
	public void user_clicks_on_Leave_Tab_and_verify_user_on_Leave_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[.='Leave']")).click();
		
		boolean leavecond = driver.findElement(By.xpath("//h6[.='Leave']")).isDisplayed();
		
		Assert.assertTrue(leavecond);
		
		Thread.sleep(3000);
	   
	}

	@When("User clicks on Claim Tab and verify user on Claim page")
	public void user_clicks_on_Claim_Tab_and_verify_user_on_Claim_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[.='Claim']")).click();
		
		boolean claimcond = driver.findElement(By.xpath("//h6[.='Claim']")).isDisplayed();
		
		Assert.assertTrue(claimcond);
		
		Thread.sleep(3000);
	    
	}


}
