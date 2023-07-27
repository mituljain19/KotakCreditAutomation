package cucumber;

import factory.FileReaderFactory;
import factory.PageObjectFactory;
import factory.WebDriverFactory;

public class Manager {
	private WebDriverFactory webDriverFactory;
	private PageObjectFactory pageObjectFactory;
	private FileReaderFactory fileReaderFactory;
	
	public Manager(){
		webDriverFactory = new WebDriverFactory();
		pageObjectFactory = new PageObjectFactory(webDriverFactory.getDriver());
		fileReaderFactory = new FileReaderFactory();
	}
	
	public WebDriverFactory getWebDriverFactory() {
		return webDriverFactory;
	}
	
	public PageObjectFactory getPageObjectFactory() {
		return pageObjectFactory;
	}
	
	public FileReaderFactory getFileReaderFactory() {
		return fileReaderFactory;
	}
}
