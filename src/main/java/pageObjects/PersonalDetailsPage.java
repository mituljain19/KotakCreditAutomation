package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {
	WebDriver driver;
	
	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="panNumber")
	private WebElement textBox_PanNumber;
	
	@FindBy(name="dob")
	private WebElement Calendar_DateOfBirth;

	@FindBy(name="emailId")
	private WebElement textBox_EmailId;
	
	@FindBy(xpath="//div[@class='gender']//p")
	private List<WebElement> listOfButton_gender;
	
	@FindBy(id="nextBtn")
	private WebElement button_proceed;
	
	public void enterPanNumber(String pannumber) {
		textBox_PanNumber.sendKeys(pannumber);
	}
	
	public void selectDateOfBirth(String dateOfBirth) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','1990-11-19')", Calendar_DateOfBirth);
	}
	
	public void enterEmailId(String emailId) {
		Actions actions=new Actions(driver);
		actions.moveToElement(textBox_EmailId).perform();
		textBox_EmailId.sendKeys(emailId);
	}
	
	public void selectGender(String gender) {
		Actions actions=new Actions(driver);
		actions.moveToElement(listOfButton_gender.get(0)).perform();
		switch (gender.toLowerCase().trim()) {
		case "male":
			listOfButton_gender.get(0).click();
			break;
		case "female":
			listOfButton_gender.get(1).click();
			break;
		case "transgender":
			listOfButton_gender.get(2).click();
			break;
		default:
			listOfButton_gender.get(0).click();
			break;
		}
	}
	
	public void clickProceedButton() {
		button_proceed.click();
	}
}
