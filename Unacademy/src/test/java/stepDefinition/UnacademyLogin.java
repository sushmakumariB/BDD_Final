package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.UnacademyLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class UnacademyLogin {
	WebDriver driver=DriverFactory.getDriver();
	UnacademyLoginPage loginPage=new UnacademyLoginPage(driver);
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	@Given("Browser is open and url is navigated")
	public void browser_is_open_and_url_is_navigated() throws Exception {
		String actualURL=driver.getCurrentUrl();
	    String expectedURL=fileUtility.getDataFromPropertiesFiles("url");
	    Assert.assertEquals(actualURL, expectedURL,"URL is not navigated");
	    Reporter.log("Browser is open and url is navigated", true);
	    Thread.sleep(1000);
	    
	}
    //Login
    @Given("The user is able to click on login button")
	public void the_user_is_able_to_click_on_login_button() throws InterruptedException {
		loginPage.getLoginButton().click();
		Reporter.log("clicking on login successfull......", true);
		Thread.sleep(1000);
	}
    
    //Phone Number
	@When("The user enters phone number")
	public void the_user_enters_phone_number() throws Exception {
		 String phoneNumber=fileUtility.getDataFromExcel("Sheet1", 1, 0);
		 loginPage.getPhoneNumberTextField().sendKeys(phoneNumber);
		 Reporter.log("Entering phone number is successfull......", true);
		 Thread.sleep(1000);
	}
	
   //Login Button
	@When("The user clicks on login button")
	public void the_user_clicks_on_login_button() throws InterruptedException {
		loginPage.getOtploginButton().click();
		Reporter.log("clicking on login button sucessfull.......", true);
		Thread.sleep(1000);
	}
	
    //User Enters OTP
	@When("The user should enter otp")
	public void the_user_should_enter_otp() throws InterruptedException {
		Thread.sleep(30000);
		Reporter.log("The user enters otp", true);
	}

	//Successful Login
	@Then("The user should be successfully logged in")
	public void the_user_should_be_successfully_logged_in() throws InterruptedException {
		Reporter.log("webpage is displayed");
		Thread.sleep(1000);
	}
	


}
	