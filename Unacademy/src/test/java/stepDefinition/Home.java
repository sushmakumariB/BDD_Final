package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class Home {
	WebDriver driver=DriverFactory.getDriver();
	HomePage homepage=new HomePage(driver);
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	@Given("The user is on the Unacademy homepage")
	public void the_user_is_on_the_unacademy_homepage() throws InterruptedException {
	   homepage.getVerifyHomePage().isDisplayed();
	   Thread.sleep(1000);
	}

	@When("The user clicks on the Dropdown menu")
	public void the_user_clicks_on_the_dropdown_menu() throws InterruptedException {
	    homepage.getDropDownButton().click();
	    Thread.sleep(1000);
	}

	@When("The user selects add another goal")
	public void the_user_selects_add_another_goal() throws InterruptedException {
	    homepage.getAddAnotherGoalButton().click();
	    Thread.sleep(2000);
	}

	@When("The user selects NEET-UG")
	public void the_user_selects_neet_ug() throws InterruptedException {
	   WebElement move=driver.findElement(By.xpath("//p[text()='NEET UG']/..//img[@alt='NEET UG']"));
	   driverUtility.scrollToElement(driver, homepage.getScrollBy());
	   Actions act=new Actions(driver);
	   act.moveToElement(move).click().perform();
	   Thread.sleep(1000);
	}


	@Then("The NEET-UG page should be displayed")
	public void the_neet_ug_page_should_be_displayed() throws InterruptedException {
	    Assert.assertTrue(homepage.getNeetugPageDisplayed().isDisplayed());
	    Thread.sleep(1000);
	}
}
