package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllLanguagesDropdownPage {
	

	public AllLanguagesDropdownPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@class='css-x09y9p-TabContainer e1qfn6d712']//div[@class=\'css-9hlkmq-TabLabel e1qfn6d713\' and text()='Educators']")
    private WebElement educatorsLink;
	
	@FindBy(xpath = "//button[@class='eqmamtt6 aquilla-button button css-udjx2l-StyledButton']//span[text()='View all educators']")
	private WebElement viewAllEducatorsButton;
//	
	
	@FindBy(xpath = "//button[@class='css-1uo0led-DropDownButton e1v4hctf0' and text()='All languages']")
	private WebElement allLanguagesDropdown;

    @FindBy(xpath = "//span[text()='Hinglish']")
    private WebElement dropDownHinglish;
    
	@FindBy(xpath = "//span[text()='English']")
    private WebElement dropDownEnglish;
    
    @FindBy(xpath = "//span[text()='Hindi']")
    private WebElement dropDownHindi;
      
	public WebElement getEducatorsLink() {
		return educatorsLink;
	}

	public WebElement getViewAllEducatorsButton() {
		return viewAllEducatorsButton;
	}

	public WebElement getAllLanguagesDropdown() {
		return allLanguagesDropdown;
	}
	public WebElement getDropDownHinglish() {
		return dropDownHinglish;
	}

	public WebElement getDropDownHindi() {
		return dropDownHindi;
	}

	public WebElement getDropDownEnglish() {
		return dropDownEnglish;
	}
	
	public void clickOnSortByValue(WebDriver driver,String sortBy) {
		driver.findElement(By.xpath("//span[text()='"+sortBy+"']")).click();
	}
	

}