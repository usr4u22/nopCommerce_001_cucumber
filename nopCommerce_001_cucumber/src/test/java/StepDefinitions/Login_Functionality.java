package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Functionality {
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void User_is_on_Login_Page() {
	  WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	
	@When("User enters Username")
	public void user_enters_username() {
	  driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	   
	}

	@When("User enters Password")
	public void User_enters_password() {
	    driver.findElement(By.name("Password")).sendKeys("admin");
	}
	
	@When("User check Remember me button")
	public void User_check_Remember_me_button() {
		driver.findElement(By.id("RememberMe")).click();
	}

	@When("User click on LOG IN button")
	public void User_click_on_log_in_button() throws InterruptedException {
	   driver.findElement(By.xpath("\\button[@type='Submit']")).click();
	   Thread.sleep(10);
	}

	@Then("User navigate to dashboard")
	public void User_navigate_to_dashboard() {
	  String ActualTitle= driver.getTitle();
	  String ExpectedTitle = "Dashboard / nopCommerce administration";
	  Assert.assertEquals(ActualTitle,ExpectedTitle,"User Successfully Navigate to Dashboard");
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.quit();
	}




}
