package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.selenium.WaitUtilities;

public class CardDetailsPage {
	WebDriver driver;
	
	public CardDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Get your')]")
	private WebElement button_GetYourCardNow;
	
	public void clickGetYourCardNow() {
		WaitUtilities.untilElementToBeClickable(driver, button_GetYourCardNow, 20);
		button_GetYourCardNow.click();
	}
	
}
