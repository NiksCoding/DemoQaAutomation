package utility;

import org.openqa.selenium.WebDriver;

import page_Objects.PageObjectsManager;

public class TestSetup {
	public WebDriver driver;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public PageObjectsManager pageObjectsManager;

	public TestSetup(WebDriver driver) {
		this.driver = driver;
		testBase = new TestBase();
		genericUtils = new GenericUtils(testBase.webDriver());
		pageObjectsManager = new PageObjectsManager(driver);
	}

/* public TestBase testBase() {
	 testBase = new TestBase();
	 return testBase;
 }
 public GenericUtils genericUtils() {
	 genericUtils = new GenericUtils(testBase.webDriver());
	 return genericUtils;
 }
 public PageObjectsManager pageObjectsManager() {
	 pageObjectsManager = new PageObjectsManager(testBase.webDriver());
	 return pageObjectsManager;
 }*/
}
