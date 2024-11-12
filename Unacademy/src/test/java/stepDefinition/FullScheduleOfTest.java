package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elementRepository.AllLanguagesDropdownPage;
import elementRepository.FullScheduleOfTestPage;
import elementRepository.UnacademyLoginPage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class FullScheduleOfTest {
	WebDriver driver=DriverFactory.getDriver();
	UnacademyLoginPage loginPage=new UnacademyLoginPage(driver);
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	AllLanguagesDropdownPage allLanguages=new AllLanguagesDropdownPage(driver);
	FullScheduleOfTestPage  fullScheduleOfTest=new FullScheduleOfTestPage(driver);
	@Then("The user clicks on view all educators button")
	public void the_user_clicks_on_view_all_educators_button() throws InterruptedException {
		Thread.sleep(1000);
		allLanguages.getViewAllEducatorsButton().click();
		Reporter.log("The NEET-UG page is displayed.....", true);
	}

	@Then("The user selects test")
	public void the_user_selects_test() throws InterruptedException {
	    fullScheduleOfTest.getClickOnTest().click();
	    Thread.sleep(1000);
	}


	@Then("The user selects the free button")
	public void the_user_selects_the_free_button() throws InterruptedException {
	    fullScheduleOfTest.getClickOnFreeButton().click();
	    Thread.sleep(1000);
	}

	@Then("The user scrolls and clicks on full schedule")
	public void the_user_scrolls_and_clicks_on_full_schedule() throws InterruptedException {
	  driverUtility.scrollToElement(driver, fullScheduleOfTest.getScrollBySchedule());
	   fullScheduleOfTest.getClickOnFullSchedule().click();
	   Thread.sleep(1000);
	}
}
