package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.FileReaderFactory;

public class HomePage {
	WebDriver driver;
		
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and contains(text(),'Cards &')]")
	private WebElement dropdown_Cards;
	
	@FindBy(xpath="//li/a[@class='header-overlay-id' and text()='Credit Cards']")
	private WebElement dropdownItem_CreditCards;
	
	public void launchKotakHomePage() {
		driver.get(FileReaderFactory.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void navigateToCreditCardsPage() {
		Actions actions=new Actions(driver);
		actions.moveToElement(dropdown_Cards).perform();
		dropdownItem_CreditCards.click();		
	}

}