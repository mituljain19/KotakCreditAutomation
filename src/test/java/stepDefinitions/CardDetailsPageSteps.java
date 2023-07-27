package stepDefinitions;

import cucumber.Manager;
import io.cucumber.java.en.When;
import pageObjects.CardDetailsPage;

public class CardDetailsPageSteps {
	
	Manager manager;
	CardDetailsPage cardDetailsPage;
	
	public CardDetailsPageSteps(Manager context) {
		manager = context;
		cardDetailsPage = manager.getPageObjectFactory().getCardDetailsPage();
	}
	
	@When("Clicks Get your card now")
	public void clicks_get_your_card_now() {
	    cardDetailsPage.clickGetYourCardNow();
	}	
}
