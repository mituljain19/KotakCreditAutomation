package stepDefinitions;

import cucumber.Manager;
import io.cucumber.java.en.When;
import pageObjects.VerifyMobilePage;

public class VerifyMobilePageSteps {
	Manager manager;
	VerifyMobilePage verifyMobilePage;
	
	public VerifyMobilePageSteps(Manager context) {
		manager = context;
		verifyMobilePage = manager.getPageObjectFactory().getVerifyMobilePage();
	}
	
	@When("User provide \"(.*)\" to get otp")
	public void user_provide_mobile_number_to_get_otp(String mobilenum) {
		verifyMobilePage.enterMobileNumber(mobilenum);
		verifyMobilePage.checkConsentCheckbox();
		verifyMobilePage.clickGetOTPButton();
	
	}

}
