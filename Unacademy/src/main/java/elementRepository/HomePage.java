package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='css-700ue5-DropDownButton ecnotob0']")
	private WebElement verifyHomePage;
//	@FindBy(xpath="//button[text()='UPSC CSE - GS']")
//    private WebElement verifyHomePage;
	
	
	@FindBy(xpath = "//button[@class='css-700ue5-DropDownButton ecnotob0']")
	private WebElement dropDownButton;
	
	@FindBy(xpath = "//p[text()='IITJEE, NEET UG and Foundation']")
	private WebElement scrollBy;
	
	public WebElement getScrollBy() {
		return scrollBy;
	}

	@FindBy(xpath = "//p[text()='Add another goal']")
	private WebElement addAnotherGoalButton;
	
//	@FindBy(xpath = "//p[text()='NEET UG']/..//img[@alt='NEET UG']")
//	private WebElement clickNeetUG;
	@FindBy(xpath ="//img[@alt='Sushma Sush']")
	private WebElement neetugPageDisplayed;
	

	public WebElement getNeetugPageDisplayed() {
		return neetugPageDisplayed;
	}

	public WebElement getVerifyHomePage() {
		return verifyHomePage;
	}
	
	public WebElement getDropDownButton() {
		return dropDownButton;
	}
	
	public WebElement getAddAnotherGoalButton() {
		return addAnotherGoalButton;
	}
	
	
	
//	


}
