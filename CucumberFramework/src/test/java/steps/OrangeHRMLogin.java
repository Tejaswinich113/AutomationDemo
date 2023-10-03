package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin extends WebDriverInit {

	@Given("User lands on the OrangeHRM login page")
	public void user_lands_on_the_OrangeHRM_login_page() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

	}

	@When("User enters username as username")
	public void user_enters_username_as_username() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("Admin");

		Thread.sleep(3000);

	}

	@When("User enters password as password")
	public void user_enters_password_as_password() throws InterruptedException {

		driver.findElement(By.name("password")).sendKeys("admin123");

		Thread.sleep(3000);

	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {

		driver.findElement(By.xpath("//button[.=' Login ']")).click();

		Thread.sleep(3000);
	}

	@When("Users wants to logout from application")
	public void users_wants_to_logout_from_application() {

		driver.findElement(By.xpath("(//img[@alt='profile picture'])[1]")).click();

		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

	@Then("User wants to close the browser")
	public void user_wants_to_close_the_browser() {

		driver.close();

	}

	@When("User enters {string} as username")
	public void user_enters_as_username(String username) throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys(username);

		Thread.sleep(3000);

	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String password) throws InterruptedException {

		driver.findElement(By.name("password")).sendKeys(password);

		Thread.sleep(3000);
	}
	
	@Then("User unable to login")
	public void user_unable_to_login() {
	    
		boolean condition = driver.findElement(By.xpath("//p[.='Invalid credentials']")).isDisplayed();
		
		Assert.assertTrue(condition);
	}

}
