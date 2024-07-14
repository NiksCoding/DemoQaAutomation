package page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.GenericUtils;

public class Interactions_Page {
	WebDriver driver;
	GenericUtils genericUtils;
	Actions actions;
	public Interactions_Page(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		genericUtils = new GenericUtils(driver);
	}
	By InteractionItems = By.xpath("//div[@class='element-list collapse show']//span");
	
	public void openInteractionItems(String items) throws Throwable {
		List<WebElement>  elements = driver.findElements(InteractionItems);
		  for(WebElement item : elements) {
			  if(item.getText().equalsIgnoreCase(items)) {
				  genericUtils.scrollTillElement(item);
				  item.click();
				  genericUtils.manualWait(3000);
				  
				 
				 
			  }
		  }
		  
	}
	//Resizable Boxes
	By Resize = By.xpath("//div[@class='box react-resizable']");
	By ResizableHandle = By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']");
	By ResizableHandle2 = By.xpath("//div[@id='resizable']//span");
	public void resize(String string,int offSetX , int offSetY ) throws Throwable {
		List<WebElement> resize = driver.findElements(Resize);
		WebElement restrictedBox = driver.findElement(ResizableHandle);
		WebElement freeBox = driver.findElement(ResizableHandle2);
		  for(WebElement text:resize) {
			  System.out.println(text.getText());
			  String textInBox = text.getText();
			  if(textInBox.equalsIgnoreCase(string)) {
				  System.out.println("moved to 1st box");
				  genericUtils.manualWait(3000);
				  genericUtils.scrollTillElement(text);
				  genericUtils.manualWait(3000);
				  if(string.equalsIgnoreCase("Resizable")) actions.moveToElement(freeBox);
				  else actions.moveToElement(restrictedBox);
				  System.out.println("moved to 1st text box");
				  genericUtils.manualWait(3000);
				  actions.clickAndHold().moveByOffset(offSetX, offSetY).release().build().perform();
			  }
		  }
		             
		
	}
	//Drag and drop
	By DroppableItems = By.xpath("//nav[@class='nav nav-tabs']//a");
	By Draggable = By.id("draggable");
	By Droppable = By.id("droppable");
	
	
	public void droppable(String dropType) throws Throwable {
		List<WebElement> droppableItems = driver.findElements(DroppableItems);
		for(WebElement item:droppableItems) {
			if(item.getText().equalsIgnoreCase(dropType)) {
				genericUtils.scrollTillElement(item);
				item.click();	
			}
				
		}
		if(dropType.equalsIgnoreCase("simple")) {
			WebElement draggable = driver.findElement(Draggable);
			WebElement droppable = driver.findElement(Droppable);
			genericUtils.scrollTillElement(draggable);
			genericUtils.manualWait(3000);
			actions.dragAndDrop(draggable, droppable).build().perform();;
			System.out.println(droppable.getText());
		}
		
	}
	

}
