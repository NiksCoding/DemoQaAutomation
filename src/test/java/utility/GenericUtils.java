package utility;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {

	
	public TestBase testBase;
	public WebDriver driver;
	public WebDriverWait wait;
	public GenericUtils(WebDriver driver) {
		//testBase = new TestBase();
		//driver = testBase.driver;
		this.driver = driver;
		  
		
	}
	
	public void scrollWindow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", ""); 
		 
	}
	public void scrollTillElement(WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
		 manualWait(1000);
		
	}
	public WebDriverWait explicitWait() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}
	
	@SuppressWarnings("deprecation")
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void handle_Tabs() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to parent window
	      driver.switchTo().window(newTb.get(0));
	      System.out.println("Page title of new tab: " + driver.getTitle());
	      //switch to parent window
	     // driver.switchTo().window(newTb.get(0));
	     // System.out.println("Page title of parent window: " + driver.getTitle());
	}
	public void handle_Windows(String string) {
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        java.util.Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        if(string.equalsIgnoreCase("ChildWindows")) {
        	while (iterator.hasNext()) {
                String ChildWindow = iterator.next();
                    if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);         
                }
            }
        }
        if(string.equalsIgnoreCase("MainWindow")) {
        	driver.switchTo().window(mainWindowHandle);
        }
        
	}
	public void manualWait(int duration) throws InterruptedException {
		Thread.sleep(duration);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
}
