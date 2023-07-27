package stepDefinitions;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import cucumber.Manager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pageObjects.PersonalDetailsPage;

public class PersonalDetailsPageSteps {
	Manager manager;
	PersonalDetailsPage personalDetailsPage;
	
	public PersonalDetailsPageSteps(Manager context) {
		manager = context;
		personalDetailsPage = manager.getPageObjectFactory().getPersonalDetailsPage();
	}
	
	@When("User fills personal details")
	public void user_fills_personal_details(DataTable data) {
		Map<String, String> map = data.asMap(String.class, String.class);
		System.out.println(map.get("pannumber"));
		System.out.println(map.get("dob"));
		System.out.println(map.get("emailid"));
		System.out.println(map.get("gender"));
		
//		personalDetailsPage.enterPanNumber(map.get("pannumber"));
//		personalDetailsPage.selectDateOfBirth(map.get("dob"));
//		personalDetailsPage.enterEmailId(map.get("emailid"));
//		personalDetailsPage.selectGender(map.get("gender"));
//		personalDetailsPage.clickProceedButton();
	}
}
