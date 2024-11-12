package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import elementRepository.AllLanguagesDropdownPage;
import elementRepository.CoursesToSelectPage;
import elementRepository.HomePage;
import io.cucumber.java.en.Then;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class AllLanguagesDropdown {
	WebDriver driver=DriverFactory.getDriver();
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	HomePage homepage=new HomePage(driver);
	AllLanguagesDropdownPage allLanguages=new AllLanguagesDropdownPage(driver);
	CoursesToSelectPage  courseToSelect=new CoursesToSelectPage(driver);

	@Then("The user clicks on dropdown and select {int} inside all languages")
	public void the_user_clicks_on_dropdown_and_select_inside_all_languages(Integer rownum) throws Exception {
	   Thread.sleep(5000);
	 //  homepage.getDropDownButton().click();
	   driver.findElement(By.xpath("//button[text()='All languages']")).click();
	   String sortBy=fileUtility.getDataFromExcel("Sheet2", rownum, 0);
	   
	   allLanguages.clickOnSortByValue(driver, sortBy);
	   Thread.sleep(3000);
	}

	}


	

