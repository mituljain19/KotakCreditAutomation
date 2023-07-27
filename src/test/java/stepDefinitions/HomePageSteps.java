package stepDefinitions;

import cucumber.Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	
	Manager manager;
	HomePage homePage;
	
	public HomePageSteps(Manager context) {
		manager = context;
		homePage = manager.getPageObjectFactory().getHomePage();
	}
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page(){
		homePage.launchKotakHomePage();	
	}
	
	@When("^user navigates to Credit Cards Page$")
	public void user_navigates_to_Credit_Cards_Page(){
		homePage.navigateToCreditCardsPage();	
	}

}
