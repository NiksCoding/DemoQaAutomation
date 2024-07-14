package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.GenericUtils;

public class AlertsFrameAndWindows_Page {

	WebDriver driver;
	GenericUtils genericUtils;
	Actions actions;
	public AlertsFrameAndWindows_Page(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		genericUtils = new GenericUtils(driver);	

	}

	By BrowserWindows = By.xpath("//span[text()='Browser Windows']");
	By Alerts = By.xpath("//span[text()='Alerts']");
	By Frames = By.xpath("//span[text()='Frames']");
	By NestedFrames = By.xpath("//span[text()='Nested Frames']");
	By ModalDialogs = By.xpath("//span[text()='Modal Dialogs']");


	public void open_AlertsFrameAndWindowsItems(String string) {

		if(string.equalsIgnoreCase("BrowserWindows")) {
			driver.findElement(BrowserWindows).click();
		}
		if(string.equalsIgnoreCase("Alerts")) {
			genericUtils.scrollWindow();
			driver.findElement(Alerts).click();
		}
		if(string.equalsIgnoreCase("Frames")) {
			genericUtils.scrollWindow();
			driver.findElement(Frames).click();
		}
		if(string.equalsIgnoreCase("NestedFrames")) {
			genericUtils.scrollWindow();
			driver.findElement(NestedFrames).click();
		}
		if(string.equalsIgnoreCase("ModalDialogs")) {
			genericUtils.scrollWindow();
			driver.findElement(ModalDialogs).click();
		}
	}
	//Browser windows
	By NewTabBtn = By.xpath("//button[text() ='New Tab']");
	By NewWindowBtn = By.xpath("//button[text() ='New Window']");
	By NewWindowMessageBtn = By.xpath("//button[text() ='New Window Message']");

	public void open_browserWindows_item(String string) {
		if(string.equalsIgnoreCase("NewTabBtn")) {
			driver.findElement(NewTabBtn).click();
		}
		if(string.equalsIgnoreCase("NewWindowBtn")) {
			driver.findElement(NewWindowBtn).click();
		}
		if(string.equalsIgnoreCase("NewWindowMessage")) {
			genericUtils.scrollWindow();
			driver.findElement(NewWindowMessageBtn).click();
		}
	}

	public void validate_BrowserItems(String string) throws Throwable {
		if(string.equalsIgnoreCase("NewTabOpen")) {
			Thread.sleep(3000);
			//Handle tabs switch to 0th tab
			genericUtils.handle_Tabs();
		}
		if(string.equalsIgnoreCase("NewWindowOpen")) {
			Thread.sleep(3000);
			//handle windows switch to main or child window
			genericUtils.handle_Windows("ChildWindows");
			WebElement text = driver.findElement(By.id("sampleHeading"));
			System.out.println("Heading of child window is " + text.getText());
			driver.close();
		}
		if(string.equalsIgnoreCase("NewWindowMessageOpen")) {
			Thread.sleep(3000);
			//handle windows switch to main or child window
			genericUtils.handle_Windows("ChildWindows");
			Thread.sleep(3000);
			WebElement text = driver.findElement(By.xpath("//body//text()"));
			System.out.println("Heading of child window is " + text.getText());
			driver.close();
		}

	}

	//Alerts
	By SimpleAlert = By.xpath("//button[@id='alertButton']");
	By timerAlertBtn = By.xpath("//button[@id='timerAlertButton']");
	By confirmBtn = By.xpath("//button[@id='confirmButton']");
	By promtBtn = By.xpath("//button[@id='promtButton']");

	public void open_Alert_items(String string) throws Throwable {

		Thread.sleep(3000);
		if(string.equalsIgnoreCase("SimpleAlert")) {
			driver.findElement(SimpleAlert).click();

		}
		if(string.equalsIgnoreCase("timerAlertBtn")) {
			driver.findElement(timerAlertBtn).click();

		}
		if(string.equalsIgnoreCase("confirmBtn")) {

			genericUtils.scrollWindow();
			Thread.sleep(3000);
			driver.findElement(confirmBtn).click();
		}
		if(string.equalsIgnoreCase("promtBtn")) {

			genericUtils.scrollWindow();
			Thread.sleep(3000);
			driver.findElement(promtBtn).click();
		}
	}
	public void validate_alerts_action(String string) throws Throwable {
		Thread.sleep(3000);
		genericUtils.explicitWait().until(ExpectedConditions.alertIsPresent());
		if(string.equalsIgnoreCase("closeAlert")) {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();					
		}
		if(string.equalsIgnoreCase("closeDelayedAlert")) {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		if(string.equalsIgnoreCase("closeConfirmBox")) {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		if(string.equalsIgnoreCase("ClosePromptBox")) {
			driver.switchTo().alert().sendKeys("Text");
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
	}
	//Modal Dialogs
	By SmallModal = By.xpath("//button[@id='showSmallModal']");
	By LargeModel = By.xpath("//button[@id='showLargeModal']");

	public void open_modal_dialog(String string) {

		if(string.equalsIgnoreCase("SmallModal")) {
			driver.findElement(SmallModal).click();
		}
		if(string.equalsIgnoreCase("LargeModal")) {	
			driver.findElement(LargeModel).click();
		}

	}
	By SmallModalText = By.xpath("//div[@class='modal-body']");
	By closeSmallModal = By.xpath("//button[@id='closeSmallModal']");
	By LargeModalText = By.xpath("//div[@class='modal-body']//p");
	By closeLargeModal = By.xpath("//button[@id='closeLargeModal']");

	public void get_model_text(String string) throws Throwable {
		Thread.sleep(3000);
		if(string.equalsIgnoreCase("SmallModal")) {
			String smallModelText = driver.findElement(SmallModalText).getText();
			System.out.println(smallModelText);
			driver.findElement(closeSmallModal).click();
		}
		if(string.equalsIgnoreCase("LargeModal")) {
			String largeModelText = driver.findElement(LargeModalText).getText();
			System.out.println(largeModelText);
			driver.findElement(closeLargeModal).click();
		}
	}
	
	
}











