package stepDefinitions;

import cucumber.Manager;
import io.cucumber.java.en.When;
import pageObjects.VerifyOTPPage;

public class VerifyOTPPageSteps {
	Manager manager;
	VerifyOTPPage verifyOTPPage;
	
	public VerifyOTPPageSteps(Manager context) {
		manager = context;
		verifyOTPPage = manager.getPageObjectFactory().getVerifyOTPPage();
	}
	
	@When("User verify otp")
	public void user_verify_otp() {
		verifyOTPPage.clickVerifyButton();
	}

}
