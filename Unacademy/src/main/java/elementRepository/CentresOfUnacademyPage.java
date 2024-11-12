package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CentresOfUnacademyPage {

	public CentresOfUnacademyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h4[text()='Our Centres are now open across India']")
	private WebElement scrollTillCentres;
	
	@FindBy(xpath = "//span[text()='Know more about Centres']")
	private WebElement clickOnKnowMore;
	
	@FindBy(xpath = "//h2[text()='Our flagship centres']")
	 private WebElement flagshipCentres;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/button[2]/span")
	private WebElement clickOnViewDetails;
  
	public WebElement getClickOnViewDetails() {
		return clickOnViewDetails;
	}

	public WebElement getFlagshipCentres() {
		return flagshipCentres;
	}

	public WebElement getScrollTillCentres() {
		return scrollTillCentres;
	}

	public WebElement getClickOnKnowMore() {
		return clickOnKnowMore;
	}

	
	
	}	

