package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Registration_nopCommerce {
	WebDriver driver;
	
	@Given("User already on Home Page")
	public void user_already_on_home_page() {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.navigate().to("https://demo.nopcommerce.com/");
	   
	}

	@When("User click on HomePage Register Button")
	public void user_click_on_HomePage_register_button() {
		driver.findElement(By.partialLinkText("egis")).click();    
		//List<WebElement> all_links = driver.findElements(By.tagName("a"));
    //for(WebElement link: all_links) {
    	
    }
      
    
		
	    
	

	@When("Title of Registration Page should be Matched")
	public void title_of_registration_page_should_be_matched() {
	    String ActualTitle= driver.getTitle();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String ExpectedTitle= "nopCommerce demo store";
	    Assert.assertEquals(ActualTitle,ExpectedTitle,"Title Matched Successfully");
	}

	@When("User Choose Gender")
	public void user_choose_gender() {
	   driver.findElement(By.id("gender-male")).click();
	}

	@When("User enters First Name")
	public void user_enters_first_name() {
	   driver.findElement(By.id("FirstName")).sendKeys("Demo");
	}

	@When("User enters Last Name")
	public void user_enters_last_name() {
	    driver.findElement(By.id("LastName")).sendKeys("User11");
	}

	@When("User select Date of Birth")
	public void user_select_date_of_birth() {
	   WebElement Date_of_Birth= driver.findElement(By.name("DateOfBirthDay"));
		Select DOB = new Select(Date_of_Birth);
		DOB.selectByVisibleText("27");
	   WebElement Date_of_Birth_Month= driver.findElement(By.name("DateOfBirthMonth"));
	   Select MOB= new Select(Date_of_Birth_Month);
	   MOB.selectByVisibleText("February");
	   WebElement Year_of_Birth= driver.findElement(By.name("DateOfBirthYear"));
	   Select YOB= new Select(Year_of_Birth);
	   YOB.selectByVisibleText("1997");
	}

	@When("User enters Email")
	public void user_enters_email() {
		driver.findElement(By.name("Email")).sendKeys("DemoUser11@Ymail.com");
	}

	@When("User Enters Company names")
	public void user_enters_company_names() {
	    driver.findElement(By.name("Company")).sendKeys("Alfa Beeta Company");
	}

	@When("User Uncheck the Newsletter")
	public void user_uncheck_the_newsletter() {
	    driver.findElement(By.name("Newsletter")).click();
	}

	@When("User enters password")
	public void user_enters_password() {
	   driver.findElement(By.name("Password")).sendKeys("DemoUser11");
	  
	}

	@When("User enters confirm password")
	public void user_enters_confirm_password() {
		driver.findElement(By.name("ConfirmPassword")).sendKeys("DemoUser11");
	    
	}
   
	@When("User click on Register button ")
	public void User_click_on_Register_button() {
		driver.findElement(By.name("register-button")).click();
	}
	
	
   @When("User closed the browser")
	public void user_closed_the_browser() {
	    driver.quit();
	}




}
