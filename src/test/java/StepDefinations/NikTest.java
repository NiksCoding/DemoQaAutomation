package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_Objects.Home_Page;
import utility.TestSetup;
@Test
public class NikTest {
	TestSetup testSetup;
	Home_Page homePage;
	WebDriver driver;
	public NikTest() {
		testSetup =new  TestSetup(driver);
		//homePage = testSetup.pageObjectsManager.homePage();
		driver = testSetup.testBase.webDriver();
	}
	
	public void webDriver() throws Throwable {
//		driver.get("https://demoqa.com/");
//		driver.manage().window().maximize();
//		testSetup.genericUtils.scrollWindow();
//		//testSetup.pageObjectsManager.homePage().open_ElementTile();
//		homePage.open_FormsTile();
//		testSetup.pageObjectsManager.formPage().submit_the_form();
		driver.get("https://www.amazon.in/");
		//testSetup.genericUtils.maximizeWindow();
        // Find the "Today's Deals" element using XPath
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement todayDealsLink = driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));

        // Click on the "Today's Deals" link
        //todayDealsLink.click();
        search.sendKeys("Bag");
        testSetup.genericUtils.manualWait(3000);
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='left-pane-results-container']//div[3]")).click();
        driver.switchTo().newWindow(WindowType.WINDOW);
        System.out.println(driver.getTitle());
       
       
	}
}
 