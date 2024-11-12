package stepDefinition;

import org.openqa.selenium.WebDriver;

import elementRepository.CentresOfUnacademyPage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class CentersOfUnacademy {
	WebDriver driver=DriverFactory.getDriver();
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	CentresOfUnacademyPage centresOfUnacademy=new CentresOfUnacademyPage(driver);
	
	@Then("The user Scrolls till our centers are now open")
	public void the_user_scrolls_till_our_centers_are_now_open() {
		driverUtility.scrollToElement(driver, centresOfUnacademy.getScrollTillCentres());
	}

	@Then("The user clicks on know more about centers")
	public void the_user_clicks_on_know_more_about_centers() {
	    centresOfUnacademy.getClickOnKnowMore().click();
	}

	@Then("The user scrolls to the centre")
	public void the_user_scrolls_to_the_centre() {
	   driverUtility.scrollToElement(driver, centresOfUnacademy.getFlagshipCentres());
	}

	@Then("The user clicks on view details")
	public void the_user_clicks_on_view_details() {
	    centresOfUnacademy.getClickOnViewDetails().click();
}
}
