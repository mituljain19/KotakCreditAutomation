package utilities.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUtilities {	
	
	public static void untilElementToBeClickable(WebDriver driver, WebElement element, int timeoutInSeconds) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void untilVisibilityOf(WebDriver driver, WebElement element, int timeoutInSeconds) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}
