package factory;

import org.openqa.selenium.WebDriver;
import pageObjects.VerifyOTPPage;
import pageObjects.CreditCardsPage;
import pageObjects.HomePage;
import pageObjects.PersonalDetailsPage;
import pageObjects.VerifyMobilePage;
import pageObjects.CardDetailsPage;

public class PageObjectFactory {
	private WebDriver driver;
	private CardDetailsPage cardDetailsPage;
	private CreditCardsPage creditCardsPage;
	private HomePage homePage;
	private VerifyMobilePage verifyMobilePage;
	private VerifyOTPPage verifyOTPPage;
	private PersonalDetailsPage personalDetailsPage;
	
	public PageObjectFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public CreditCardsPage getCreditCardsPage() {
		return (creditCardsPage == null) ? creditCardsPage = new CreditCardsPage(driver) : creditCardsPage;
	}
	
	public CardDetailsPage getCardDetailsPage() {
		return (cardDetailsPage == null) ? cardDetailsPage = new CardDetailsPage(driver) : cardDetailsPage;
	}
	
	public VerifyMobilePage getVerifyMobilePage() {
		return (verifyMobilePage == null) ? verifyMobilePage = new VerifyMobilePage(driver) : verifyMobilePage;
	}
	
	public VerifyOTPPage getVerifyOTPPage() {
		return (verifyOTPPage == null) ? verifyOTPPage = new VerifyOTPPage(driver) : verifyOTPPage;
	}
	
	public PersonalDetailsPage getPersonalDetailsPage() {
		return (personalDetailsPage == null) ? personalDetailsPage = new PersonalDetailsPage(driver) : personalDetailsPage;
	}
}
