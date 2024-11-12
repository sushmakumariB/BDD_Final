package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnacademyLoginPage {
	public UnacademyLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginButton;
	
     @FindBy(xpath = "//input[@type='tel' and @maxlength='15']")
     private WebElement phoneNumberTextField;
     
     @FindBy(xpath = "//button[text()='Login']")
     private WebElement otploginButton;



	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}
	public WebElement getOtploginButton() {
		return otploginButton;
	}
	
   
    
     
     
}
