package page_Objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utility.GenericUtils;

public class Element_Page {

	 WebDriver driver;
	 public Actions actions;
	 GenericUtils genericUtils;
	 WebDriverWait wait;
	public Element_Page(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		genericUtils = new GenericUtils(driver);
		//driver = new ChromeDriver();
		
	}
	By Elementitems = By.xpath("//div[@class='element-list collapse show']//span");
	By TextBox = By.xpath("//span[text()='Text Box']");
	By CheckBox = By.xpath("//span[text()='Check Box']");
	By RadioButton = By.xpath("//span[text()='Radio Button']");
	By WebTables = By.xpath("//span[text()='Web Tables']");
	By Buttons = By.xpath("//span[text()='Buttons']");
	By Links = By.xpath("//span[text()='Links']");
	By BrokenLinksImages = By.xpath("//span[text()='Broken Links - Images']");
	By UploadAndDownload = By.xpath("//span[text()='Upload and Download']");
	By DynamicProperties = By.xpath("//span[text()='Dynamic Properties']");
	
	public void open_Element_Items(String string) throws Throwable {
		List<WebElement> elementItems = driver.findElements(Elementitems);
		for(WebElement elementName : elementItems) {
			if(elementName.getText().equalsIgnoreCase(string)) {
				System.out.println(elementName.getText() + " page Open");
				genericUtils.scrollTillElement(elementName);
				elementName.click();
			}
		}
		
//		if(string.equalsIgnoreCase("TextBox")) {
//			driver.findElement(TextBox).click();
//		}
//		if(string.equalsIgnoreCase("CheckBox")) {
//			driver.findElement(CheckBox).click();
//		}
//		if(string.equalsIgnoreCase("RadioButton")) {
//			driver.findElement(RadioButton).click();
//		}
//		if(string.equalsIgnoreCase("WebTables")) {
//			driver.findElement(WebTables).click();
//		}
//		if(string.equalsIgnoreCase("Buttons")) {
//			//Thread.sleep(2000);
//			genericUtils.scrollWindow();
//			driver.findElement(Buttons).click();
//		}
//		if(string.equalsIgnoreCase("Links")) {
//			genericUtils.scrollWindow();
//			driver.findElement(Links).click();
//		}
//		if(string.equalsIgnoreCase(" BrokenLinksImages")) {
//			genericUtils.scrollWindow();
//			driver.findElement(BrokenLinksImages).click();
//		}
//		if(string.equalsIgnoreCase("UploadAndDownload")) {
//			genericUtils.scrollWindow();
//			driver.findElement(UploadAndDownload).click();
//		}
//		if(string.equalsIgnoreCase("DynamicProperties")) {
//			genericUtils.scrollWindow();
//			driver.findElement(DynamicProperties).click();
//		}
		
	}
	//text Box page
	By FullName = By.xpath("//div[@class='col-md-9 col-sm-12']//child::input[@placeholder='Full Name']");
	By Email = By.xpath("//div[@class='col-md-9 col-sm-12']//child::input[@placeholder='name@example.com']");
	By CurrentAddress = By.xpath("//div[@class='col-md-9 col-sm-12']//child::textarea[@placeholder='Current Address']");
	By Permnentaddress = By.xpath("//div[@class='col-md-9 col-sm-12']//child::textarea[@id='permanentAddress']");
	By SubmitButton = By.id("submit");
	 public void TextBox() {
		 driver.findElement(FullName).sendKeys("Nikhil");
		 driver.findElement(Email).sendKeys("nikhil@yopmail.com");
		 driver.findElement(CurrentAddress).sendKeys("India");
		 driver.findElement(Permnentaddress).sendKeys("India Delhi");
		
		
	}
	 public void submitTextBox() {
		 
		 driver.findElement(SubmitButton).click();
	 }
	 
	 By NameText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='name']");
	 By emailText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='email']");
	 By currentAddressText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='currentAddress']");
	 By permanentAddressText = By.xpath("//div[@class='border col-md-12 col-sm-12']//child::p[@id='permanentAddress']");
	
	 public void printText(String string) {
		 if(string.equalsIgnoreCase("Name")) {
			 String str = driver.findElement(NameText).getText(); 
			System.out.println(str);
		 }
		 if(string.equalsIgnoreCase("email")) {
			 String str = driver.findElement(emailText).getText(); 
			 System.out.println(str);
		 }
		 if(string.equalsIgnoreCase("currentAddress")) {
			 String str = driver.findElement(currentAddressText).getText(); 
			 System.out.println(str);
		 }
		 if(string.equalsIgnoreCase("permanentAddress")) {
			 String str = driver.findElement(permanentAddressText).getText(); 
			 System.out.println(str);
		 } 
		
	 }
	 
	 //Check Box
	 
	 By Toggle0 = By.xpath("//div[@id='tree-node']/ol/li/span/button");
	 By Toggle1 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button");
	 By Toggle2 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button");
	 By Toggle2A = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/button");
	 By ReactCheckBox = By.xpath("//label[@for='tree-node-react']/span[1]");
	 By Toggle2B = By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/button");
	 By Toggle3 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/button");
	 
	 public void checkReactBox () throws Exception {
		 genericUtils.manualWait(2000);
		// WebElement element = driver.findElement(Toggle0);
		 genericUtils.scrollTillElement(driver.findElement(Toggle0));
		 System.out.println("window scrolled till element visible");
		 genericUtils.manualWait(2000);
		 driver.findElement(Toggle0).click();
		 genericUtils.manualWait(2000);
		 driver.findElement(Toggle2).click();
		 genericUtils.manualWait(2000);
		 driver.findElement(Toggle2A).click();
		 genericUtils.manualWait(2000);
		 driver.findElement(ReactCheckBox).click();
	 }
	 
	 //Radio Button
	 By ImpressiveRadioButton = By.xpath("//label[@for='impressiveRadio']");
	 public void impressiveRadioButton() {
		 driver.findElement(ImpressiveRadioButton).click();
	 }
		
	 //WebTables
	 By AddButton = By.xpath("//button[@id='addNewRecordButton']");
	 public void click_add_button() {
		 driver.findElement(AddButton).click();
	 }
	 
	 By FirstName = By.xpath("//input[@placeholder='First Name']");
	 By LastName = By.xpath("//input[@placeholder='Last Name']");
	 By EmailWebTable = By.xpath("//input[@placeholder='name@example.com']");
	 By Age = By.xpath("//input[@placeholder='Age']");
	 By Salary = By.xpath("//input[@placeholder='Salary']");
	 By Department = By.xpath("//input[@placeholder='Department']");
	 By SubmitwebTable = By.xpath("//button[@id='submit']");
	 public void submit_the_details_in_the_webTable() {
		 driver.findElement(FirstName).sendKeys("Nikhil");
		 driver.findElement(LastName).sendKeys("Raj");
		 driver.findElement(EmailWebTable).sendKeys("nikhil@yopmail.com");
		 driver.findElement(Age).sendKeys("24");
		 driver.findElement(Salary).sendKeys("80000");
		 driver.findElement(Department).sendKeys("QA");
		 driver.findElement(SubmitwebTable).click();
	 }
	 
	 //Buttons
	 
	 By DoubleClick = By.xpath("//button[text()='Double Click Me']");
	 By RightClick = By.xpath("//button[text()='Right Click Me']");
	 public void mouse_action(String string) throws InterruptedException { 
		 if(string.equalsIgnoreCase("DoubleClick")) {
			Thread.sleep(2000);
			actions.doubleClick(driver.findElement(DoubleClick)).perform();
			 System.out.println("To double click");
			
		 }
         if(string.equalsIgnoreCase("RightClick")) {
        	 Thread.sleep(2000);
        	 actions.contextClick(driver.findElement(RightClick)).perform(); 
        	 System.out.println("To right click");
		 }
		
		 
	 }
	 //Links
	 By SimpleLink = By.xpath("//div[@id='linkWrapper']//child::a[@id='simpleLink']");
	 By DynamicLink = By.xpath("//div[@id='linkWrapper']//child::a[@id='dynamicLink']");
	 By ApiLink = By.xpath("//div[@id='linkWrapper']//child::a[@id='created']");
	 
	 public void links(String string) {
		 if(string.equalsIgnoreCase("Simple Link")) {
			 driver.findElement(SimpleLink).click();
		 }
		 if(string.equalsIgnoreCase("Dynamic Link")) {
			 driver.findElement(DynamicLink).click();
		 }
		 if(string.equalsIgnoreCase("Api Link")) {
			 driver.findElement(ApiLink).click();
		 }
	 }
	 //Upload and Download Images
	 By DownloadImageBtn = By.xpath("//a[text()='Download']");
	 By UploadImageBtn = By.xpath("//input[@id='uploadFile']");
	 
	 public void downloadImage() {
		 driver.findElement(DownloadImageBtn).click();
	 }
	 public void uploadImage()  {
		 driver.findElement(UploadImageBtn).sendKeys("D:\\Downloads\\sampleFile (2).jpeg");
		 
	 }
	 
		
	
}
