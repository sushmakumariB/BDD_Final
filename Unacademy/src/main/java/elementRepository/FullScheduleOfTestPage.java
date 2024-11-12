package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullScheduleOfTestPage {
	
	public FullScheduleOfTestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-id='test-series']")
	private WebElement clickOnTest;
	
//	@FindBy(xpath = "//p[text()='SEE ALL']")
//	private WebElement clickOnSeeAll;
	
	@FindBy(xpath = "//span[text()='FREE']")
	private WebElement clickOnFreeButton;
	
	@FindBy(xpath = "//h4[text()='Schedule']")
	private WebElement scrollBySchedule;
	
	@FindBy(xpath = "//span[text()='See full schedule']")
	private WebElement clickOnFullSchedule;
	
	public WebElement getClickOnTest() {
		return clickOnTest;
	}

	public WebElement getClickOnFreeButton() {
		return clickOnFreeButton;
	}

	public WebElement getClickOnFullSchedule() {
		return clickOnFullSchedule;
	}
	
	public WebElement getScrollBySchedule() {
		return scrollBySchedule;
	}
	
	
}
