package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesToSelectPage {
   
     
     public CoursesToSelectPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "(//span[text()='View Profile'])[1]")
     private WebElement viewProfileButton;
     
     @FindBy(xpath = "//div[@class='css-9hlkmq-TabLabel er9wa531' and text()='Courses']")
     private WebElement clickOnCourses;
     
     @FindBy(xpath = "(//img[@alt='Thumbnail']/../..//span[text()='Hindi'])[1]")
     private WebElement chemistryForNeet;
     
     @FindBy(xpath = "//div[contains(@class,'css-o1fy')]//button[text()='Get subscription' and @type='button']")
     private WebElement SubscriptionButton;
     
     @FindBy(xpath = "//h3[text()='NEET UG']")
     private WebElement validateSubscription;
     
   

     public WebElement getViewProfileButton() {
 		return viewProfileButton;
 	 }


 	public WebElement getClickOnCourses() {
 		return clickOnCourses;
 	}
 	
 	public WebElement getChemistryForNeet() {
 		return chemistryForNeet;
 	}
	
	
	public WebElement getSubscriptionButton() {
		return SubscriptionButton;
	}


	public WebElement getValidateSubscription() {
		return validateSubscription;
	}


	


	
	

    
    
 	
}
