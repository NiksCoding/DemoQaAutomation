package utility;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.Before;


public class TestBase {

	public WebDriver driver;


	public  WebDriver webDriver() {
		driver = new ChromeDriver();

		return driver;
	}
public void tearDown() {

    if (this.driver != null) {
        this.driver.quit();
    }

}

@AfterMethod(alwaysRun = true)
public void afterTestMethod(Method method) {

    // Clean ups for test level services
    tearDown();

}

@AfterSuite(alwaysRun = true)
public void afterTestSuite() {

    tearDown();

}

	
}
