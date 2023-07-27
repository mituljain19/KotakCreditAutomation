package stepDefinitions;

import cucumber.Manager;
import io.cucumber.java.en.When;
import pageObjects.CreditCardsPage;

public class CreditCardsPageSteps {
	
	Manager manager;
	CreditCardsPage creditCardsPage;
	
	public CreditCardsPageSteps(Manager context) {
		manager = context;
		creditCardsPage = manager.getPageObjectFactory().getCreditCardsPage();
	}
	
	@When("Apply for Myntra Kotak Credit Card")
	public void apply_for_myntra_kotak_credit_card() {
		creditCardsPage.clickApplyNowOfMytraKotakCreditCard();
	    
	}

}
