package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.AllLanguagesDropdownPage;
import elementRepository.CoursesToSelectPage;
import elementRepository.HomePage;
import elementRepository.UnacademyLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class CoursesToSelect {
	WebDriver driver=DriverFactory.getDriver();
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	HomePage homepage=new HomePage(driver);
	CoursesToSelectPage  courseToSelect=new CoursesToSelectPage(driver);
	AllLanguagesDropdownPage allLanguages=new AllLanguagesDropdownPage(driver);
	
	
	
	@Then("The user clicks on educators")
	public void the_user_clicks_on_educators() throws InterruptedException {
		allLanguages.getEducatorsLink().click();
		Reporter.log("The NEET-UG page is displayed.....", true);
		Thread.sleep(1000);
	}


	@Then("The user clicks on view Profile")
	public void the_user_clicks_on_view_profile() throws InterruptedException {
	    courseToSelect.getViewProfileButton().click();
	    Reporter.log("the user clicks on view profile", true);
	    Thread.sleep(1000);
	}

	@Then("The user clicks on courses")
	public void the_user_clicks_on_courses() throws InterruptedException {
	    courseToSelect.getClickOnCourses().click();
	    Thread.sleep(1000);
	}

	@Then("The user selects course")
	public void the_user_selects_course() throws InterruptedException {
	    courseToSelect.getChemistryForNeet().click();
	    Thread.sleep(1000);
	}

	@Then("The user gets the subscription")
	public void t_he_user_gets_the_subscription() throws InterruptedException {
	    courseToSelect.getSubscriptionButton().click();
	    Assert.assertTrue(courseToSelect.getValidateSubscription().isDisplayed());
	    Thread.sleep(1000);
	}
}
