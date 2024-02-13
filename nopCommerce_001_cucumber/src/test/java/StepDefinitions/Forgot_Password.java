package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Forgot_Password {
	WebDriver driver;
	
	@Given("User already on Login Page")
	public void user_is_on_login_page() {
	   WebDriver driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.navigate().to("http://admin-demo.nopcommerce.com/administration/login?returnUrl=%2F");
	   System.out.println("Step 1 Completed");
	}

	@When("User click on Forgot Password Link")
	public void user_click_on_forgot_password_link() {
	    driver.findElement(By.linkText("Forgot password?")).click();
	    System.out.println("Step 2 Completed");
	   
	}

	@When("User enters Email address to recover account")
	public void user_enters_email_address_to_recover_account() {
	    driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	    System.out.println("Step 3 Completed");
	}

	@When("User click on RECOVER button")
	public void user_click_on_recover_button() {
	    driver.findElement(By.name("send-email")).click();
	}

	@Then("User Landing on homepage")
	public void user_landing_on_homepage() {
	    String ActualTitle= driver.getTitle();
	    String ExpectedTitle= "nopCommerce demo store. Login";
	    Assert.assertEquals(ActualTitle, ExpectedTitle,"Title Successfully Matched");
	}
    @And("User close the browser")
    public void user_close_the_browser() {
    	driver.quit();
    }


}
