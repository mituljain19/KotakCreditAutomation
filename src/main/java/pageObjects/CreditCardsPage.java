package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardsPage {
	WebDriver driver;
	
	public CreditCardsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[starts-with(text(),'Myntra Kotak')]/ancestor::div[@class='sa-card']//a[contains(text(),'Apply Now')]")
	private WebElement button_CreditCardApplyNow;
	
	public void clickApplyNowOfMytraKotakCreditCard() {		
		button_CreditCardApplyNow.click();
	}
	
}