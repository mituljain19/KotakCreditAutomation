package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.selenium.WaitUtilities;

public class VerifyMobilePage {
	WebDriver driver;
	
	public VerifyMobilePage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="mobileNum")
	private WebElement textBox_MobileNumber;

	@FindBy(xpath="//input[@id='consentCheckbox0']/following-sibling::p[@class='c-checkbox__text ']")
	private WebElement checkbox_Consent;

	@FindBy(id="nextBtn")
	private WebElement button_GetOTP;

	
	public void enterMobileNumber(String mobilenum) {
		WaitUtilities.untilVisibilityOf(driver, textBox_MobileNumber, 20);
		textBox_MobileNumber.sendKeys(mobilenum);
	}

	public void checkConsentCheckbox() {
//		Actions actions=new Actions(driver);
		WaitUtilities.untilVisibilityOf(driver, checkbox_Consent, 30);
		checkbox_Consent.click();
		
	}

	public void clickGetOTPButton() {
		button_GetOTP.click();
	}
}
