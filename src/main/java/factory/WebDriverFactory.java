package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import enums.DriverType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	private WebDriver driver;
	private static DriverType driverType;
	
	public WebDriverFactory() {
		driverType = FileReaderFactory.getInstance().getConfigReader().getBrowser();
	}
	
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
	
	private WebDriver createDriver() {
        switch (driverType) {	    
        case FIREFOX : 
        	WebDriverManager.firefoxdriver().setup();
        	driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	WebDriverManager.chromedriver().setup();
        	ChromeOptions chromeoptions = new ChromeOptions();
        	chromeoptions.addArguments("--remote-allow-origins=*");
        	chromeoptions.addArguments("-–disable-notifications");
        	driver = new ChromeDriver(chromeoptions);
    		break;
        case EDGE : 
        	EdgeOptions edgeoptions = new EdgeOptions();
            edgeoptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            edgeoptions.addArguments("--remote-allow-origins=*");
            edgeoptions.setCapability("ignore-certificate-errors", true);
        	WebDriverManager.edgedriver().setup();
        	driver = new EdgeDriver(edgeoptions);
    		break;
        }
        if(FileReaderFactory.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderFactory.getInstance().getConfigReader().getImplicitlyWait()));
		return driver;
	}	
	
	public void quitDriver() {
		driver.close();
		driver.quit();		
	}

}
