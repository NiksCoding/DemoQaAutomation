package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Home_Page {
	
	 WebDriver driver;
	public Home_Page(WebDriver driver) {
		this.driver = driver;
				
	}

	

	By ElementTile = By.xpath("//div//h5[text()='Elements']");
	By FormsTile = By.xpath("//div//h5[text()='Forms']");
	By Alert_Frame_WindowsTile = By.xpath("//div//h5[text()='Alerts, Frame & Windows']");
	By WidgetsTile =  By.xpath("//div//h5[text()='Widgets']");
	By InteractionsTile =  By.xpath("//div//h5[text()='Interactions']");
	By BookStoreApplicationsTile =  By.xpath("//div//h5[text()='Book Store Application']");
	
	public void open_ElementTile() {
		driver.findElement(ElementTile).click();
	}
	public void open_FormsTile() {
		driver.findElement(FormsTile).click();
	}
	public void open_Alert_Frame_WindowsTile() {
		driver.findElement(Alert_Frame_WindowsTile).click();
	}
	
	public void open_Tile(String Tiles) {
		if(Tiles.equalsIgnoreCase("Elements")) {
			driver.findElement(ElementTile).click();
		}
		if(Tiles.equalsIgnoreCase("Forms")) {
			driver.findElement(FormsTile).click();
		}
		if(Tiles.equalsIgnoreCase("AlertsFrameAndWindows")) {
			driver.findElement(Alert_Frame_WindowsTile).click();
		}
		if(Tiles.equalsIgnoreCase("Widgets")) {
			driver.findElement(WidgetsTile).click();
		}
		if(Tiles.equalsIgnoreCase("Interactions")) {
			driver.findElement(InteractionsTile).click();
		}
		if(Tiles.equalsIgnoreCase("BookStoreApplications")) {
			driver.findElement(BookStoreApplicationsTile).click();
		}
	}



}
