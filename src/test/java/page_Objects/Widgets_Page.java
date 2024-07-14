package page_Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.GenericUtils;

public class Widgets_Page {

	WebDriver driver;
	GenericUtils genericUtils;
	Actions actions;
	public Widgets_Page(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		genericUtils = new GenericUtils(driver);	

	}
	//Widgets
		By AutoComplete = By.xpath("//span[text()='Auto Complete']");
		By Accordian = By.xpath("//span[text()='Accordian']");
		By DatePicker = By.xpath("//span[text()='Date Picker']");
		By Slider = By.xpath("//span[text()='Slider']");
		By ProgressBar = By.xpath("//span[text()='Progress Bar']");
		By ToolTips = By.xpath("//span[text()='Tool Tips']");
		By Menu = By.xpath("//span[text()='Menu']");
		By SelectMenu = By.xpath("//span[text()='Select Menu']");

		public void open_widgets_items(String string) throws Throwable {
			genericUtils.scrollWindow();
			//genericUtils.explicitWait().until(ExpectedConditions.visibilityOfAllElements())
			if(string.equalsIgnoreCase("Accordian")) {
				driver.findElement(Accordian).click();
			}
			if(string.equalsIgnoreCase("AutoComplete")) {
				driver.findElement(AutoComplete).click();
				
			}
			if(string.equalsIgnoreCase("DatePicker")) {
				driver.findElement(DatePicker).click();
			}
			if(string.equalsIgnoreCase("Slider")) {
				driver.findElement(Slider).click();
			}
			if(string.equalsIgnoreCase("ProgressBar")) {
				genericUtils.scrollWindow();
				driver.findElement(ProgressBar).click();
			}
			if(string.equalsIgnoreCase("ToolTips")) {
				genericUtils.scrollWindow();
				driver.findElement(ToolTips).click();
			}
			if(string.equalsIgnoreCase("Menu")) {
				genericUtils.scrollWindow();
				driver.findElement(Menu).click();
			}
			if(string.equalsIgnoreCase("SelectMenu")) {
				genericUtils.scrollWindow();
				driver.findElement(SelectMenu).click();
			}
		}
		//Auto fill Text field
		By MultipleColorName = By.xpath("//input[@id='autoCompleteMultipleInput']");
		By SingleColorName = By.xpath("//input[@id='autoCompleteSingleInput']");
		
		public void auto_Complete_field(String string) throws Throwable {
			
			if(string.equalsIgnoreCase("MultiTextField")) {
				WebElement element = driver.findElement(MultipleColorName);
				element.sendKeys("R");
				Thread.sleep(2000);
				element.sendKeys(Keys.ARROW_DOWN);
				element.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				element.sendKeys("R");
				element.sendKeys(Keys.ENTER);
			}
			if(string.equalsIgnoreCase("SingleTextField")) {
				WebElement element = driver.findElement(SingleColorName);
				element.sendKeys("R");
				Thread.sleep(2000);
				element.sendKeys(Keys.ARROW_DOWN);
				element.sendKeys(Keys.ENTER);
			}	
		}
		//date time picker
		By DateInput = By.xpath("//input[@id='datePickerMonthYearInput']");
		By MonthDropDownBtn = By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']");
		By Month = By.xpath("//div[@class='react-datepicker__month-dropdown']//div[12]");
		By YearDropDownBtn = By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']");
		By Year = By.xpath("//div[@class='react-datepicker__year-dropdown']//div[7]");
		By Day = By.xpath("//div[@class='react-datepicker__month']//div[5]//div[6]");
		By dateAndTimePickerInput = By.xpath("//input[@id='dateAndTimePickerInput']");
		By Time = By.xpath("//ul[@class='react-datepicker__time-list']//li[5]");
		
		public void select_date_and_time() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(dateAndTimePickerInput).click();
			Thread.sleep(2000);
			driver.findElement(MonthDropDownBtn).click();
			Thread.sleep(2000);
			driver.findElement(Month).click();
			Thread.sleep(2000);
			driver.findElement(YearDropDownBtn).click();
			Thread.sleep(2000);
			driver.findElement(Year).click();
			Thread.sleep(2000);
			driver.findElement(Day).click();
			Thread.sleep(2000);
			driver.findElement(Time).click();
		}
		//Slider
		By SliderBar = By.xpath("//input[@type='range']");
		
		public void set_SliderBar() throws Throwable {
			WebElement slider = driver.findElement(SliderBar);
			Thread.sleep(2000);
			Actions move = new Actions(driver);
			//origin is at 50pt, each point equals 5 pxl 
			//so to move slider to origin move x axis to -250
			move.dragAndDropBy(slider, -10, 0).perform();
			
		}
		//Progress Bar
		By StartStopButton = By.xpath("//button[@id='startStopButton']");
		By ProgressBarValue = By.xpath("//div[@role='progressbar']");
		By ResetBtn = By.xpath("//button[@id='resetButton']");
		//By ProgrefssBarValue = By.cssSelector("//div[@id='progressBar']//div[@aria-valuenow='56']");
		public void progress_Bar() {
			WebElement startStopBtn= driver.findElement(StartStopButton);
			startStopBtn.click();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.pollingEvery(Duration.ofMillis(100));
			// wait.until(ExpectedConditions.attributeToBe(ProgressBarValue, "aria-valuenow", "65"));
			// StartStopBtn.click();
			boolean progressStatus = wait.until(ExpectedConditions.attributeToBe(ProgressBarValue, "aria-valuenow", "65"));
			if(progressStatus=true) {
				wait.until(ExpectedConditions.presenceOfElementLocated(StartStopButton)).click();
			}
		}
		//Tool Tip
		By ToolTipBtn = By.xpath("//*[@id='toolTipButton']");
		
		public void get_Tool_Tip_Text() throws Throwable {
			WebElement ToolTip= driver.findElement(ToolTipBtn);
			Thread.sleep(2000);
			actions.moveToElement(ToolTip).perform();
			String toolTipTxt = ToolTip.getText();
			System.out.println(toolTipTxt);
		}
		//Menu
		By MenuItem2 = By.xpath("//a[text()='Main Item 2']");
		By SubList3 = By.xpath("//ul[@id='nav']//li[2]//li[3]//a[text()='SUB SUB LIST »']");
		By SubSubItem2 = By.xpath("//ul[@id='nav']//li[2]//li[3]//li[2]//a");
		////a[text()='Sub Sub Item 2']
	  public void hover_menu_Item() throws Throwable {
		  Thread.sleep(3000);
		  WebElement menuItem2 = driver.findElement(MenuItem2);
		  actions.moveToElement(menuItem2).perform();
		  WebElement subList3 = driver.findElement(SubList3);
		  genericUtils.explicitWait().until(ExpectedConditions.visibilityOf(subList3));
		  actions.moveToElement(subList3).perform();
		  WebElement subSubItem2 = driver.findElement(SubSubItem2);
		  genericUtils.explicitWait().until(ExpectedConditions.visibilityOf(subSubItem2));
		  actions.moveToElement(subSubItem2).perform();
	  }
		
		
		
		
		
}
