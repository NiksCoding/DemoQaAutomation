package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.GenericUtils;

public class Form_Page {

	WebDriver driver;
	GenericUtils genericUtils;
	Actions actions;
	public Form_Page(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		genericUtils = new GenericUtils(driver);
	}
	By FormPage = By.xpath("//span[text()='Practice Form']");
	By OpenCalander = By.xpath("//input[@id='dateOfBirthInput']");
	By selectMonth = By.xpath("//option[text()='November']");
	By SelectYear = By.xpath("//option[text()='1998']");
	By SelectDate = By.xpath("//div[@aria-label ='Choose Monday, November 9th, 1998']");
	By SubmitForm = By.xpath("//button[@id='submit']");
	
	public void submit_the_form() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(FormPage).click();
		genericUtils.scrollWindow();
		//Thread.sleep(3000);
		driver.findElement(OpenCalander).click();
		//Thread.sleep(3000);
		driver.findElement(SelectYear).click();
		//Thread.sleep(3000);
		driver.findElement(selectMonth).click();
		//Thread.sleep(3000);
		driver.findElement(SelectDate).click();
	}
	
}
