package StepDefinations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.PageObjectsManager;
import utility.GenericUtils;
import utility.TestBase;


@Test
public class LoginSteps {
	GenericUtils genericUtils;
	TestBase testBase;
	WebDriver driver ;
	PageObjectsManager pageObjectsManager; 
	public  LoginSteps() {
		testBase = new TestBase();
		driver = testBase.webDriver();
		pageObjectsManager = new PageObjectsManager(driver);
		genericUtils = new GenericUtils(driver);
	}
	
	
	@Given("user open the demoQA App")
	public void user_open_the_demo_qa_app() {
		driver.get("https://demoqa.com/");
		//Maximize current window
		driver.manage().window().maximize();
	}
   
   @When("user click on the {string}")
   public void user_click_on_the(String string) {
	   genericUtils.scrollWindow();
	   pageObjectsManager.homePage().open_Tile(string);
       
   }
	
	@Then("validate tile get open")
	public void validate_tile_get_open() {
		System.out.println("Elements are visible");
		
		// driver.quit();
	}
	//To open Element Items
	@And("user open the {string} page")
	public void user_open_the_element_items(String string) throws Throwable {
		pageObjectsManager.elementPage().open_Element_Items(string);
	}
//Glue code for Element Items page
	//Text Box
	
	@Given("user on the Elements page")
	public void user_on_the_elements_page(){
		driver.get("https://demoqa.com/");
		//Maximize current window
		driver.manage().window().maximize();
		genericUtils.scrollWindow();
		pageObjectsManager.homePage().open_ElementTile();
	}
   @Then("user fill all the text box")
   public void user_fill_all_the_text_box() {
	   pageObjectsManager.elementPage().TextBox();
   }
   @And("user click on submit button")
   public void user_click_on_submit_button() throws InterruptedException {
	   genericUtils.implicitWait();
		 genericUtils.scrollWindow();
	   pageObjectsManager.elementPage().submitTextBox();
	   System.out.println("text Box submitted");
	   Thread.sleep(3000);
	   pageObjectsManager.elementPage().printText("Name");
	   pageObjectsManager.elementPage().printText("Email");
	   pageObjectsManager.elementPage().printText("currentAddress");
	   pageObjectsManager.elementPage().printText("permanentAddress");
	   
   }
   
   //Check Box
   @Then("user tick react check box")
    public void user_open_the_checkBox_page() throws Exception {
	   pageObjectsManager.elementPage().checkReactBox();
   }
     //Radio Button
   @Then("user tick impressive radio button")
   public void user_tick_impressive_radio_button() {
	   pageObjectsManager.elementPage().impressiveRadioButton();
  }

   //web tables
   @Then("user open a new form from add button")
   public void user_open_a_new_form_from_add_button() {
	   pageObjectsManager.elementPage().click_add_button();
   }
   @And("submit after filling the details")
   public void submit_after_filling_the_details() {
	   pageObjectsManager.elementPage().submit_the_details_in_the_webTable();
   }
   //Buttons
   @Then("user perform the mouse {string}")
   public void user_perform_the_mouse_action(String string) throws InterruptedException {
	   
	   pageObjectsManager.elementPage().mouse_action(string);
   }
   //Links
   @Then("user select the {string}")
   public void user_select_the_links(String string) {
	   pageObjectsManager.elementPage().links(string);
   }
   //Upload and Download Image
   @Then("validate user able to download the image")
   public void validate_user_able_to_download_the_image() {
	   System.out.println("Image downloaded");
	   //pageObjectsManager.elementPage().downloadImage();
	    
   }
   @And("user is able to upload an image")
   public void user_able_to_upload_an_image()  {
	   pageObjectsManager.elementPage().uploadImage();
   }
   
   //**Submit the Form**
   
   @And("user submit the form with details")
   public void submit_the_form() throws Throwable {
	   pageObjectsManager.formPage().submit_the_form();
   }
   
   //Open AlertsFrameAndWindowsItems
   @And("user open the page {string}")
	public void Alerts_Frame_And_Windows_Items(String string) throws Throwable {
		pageObjectsManager.alertsFrameAndWindows_Page().open_AlertsFrameAndWindowsItems(string);
	}
   
   //Browse windows
   
   @And("user open the Browser Windows item {string}")
	public void browser_windows_Items(String string) throws Throwable {
		pageObjectsManager.alertsFrameAndWindows_Page().open_browserWindows_item(string);
	}
   
   @Then("validate {string}")
   public void validate_actions(String string) throws Throwable {
	   pageObjectsManager.alertsFrameAndWindows_Page().validate_BrowserItems(string);
   }
   
   //Alerts
   @Then("user open the Alerts item {string}")
   public void user_open_the_Alerts_item(String string) throws Throwable {
	   pageObjectsManager.alertsFrameAndWindows_Page().open_Alert_items(string);
   }
   @And("validate Alert {string}")
   public void validate_Alerts_Action(String string) throws Throwable {
	   pageObjectsManager.alertsFrameAndWindows_Page().validate_alerts_action(string);
	   driver.close();
   }
   
   //Modal
   @Then("user click on the modal button {string}")
   public void user_click_on_yhe_modal_button(String string) {
	   pageObjectsManager.alertsFrameAndWindows_Page().open_modal_dialog(string);
   }
   @And("print modal Text {string}")
   public void print_modal_Text(String string) throws Throwable {
	   pageObjectsManager.alertsFrameAndWindows_Page().get_model_text(string);
	   driver.close();
   }
   
   //Widgets Items
   @And("user open the widgets item page {string}")
   public void open_widgets_items(String string) throws Throwable {
	   pageObjectsManager.widgetsPage().open_widgets_items(string);
	   //driver.close();
   }
   //Auto Complete
   @Then("user fill the auto text field {string}")
   public void fill_auto_complete_text_field(String string) throws Throwable {
	   pageObjectsManager.widgetsPage().auto_Complete_field(string);
   }
   // fill the Date and time from picker
   @Then("user fill the Date and time from picker")
   public void fill_the_date_and_time_picker() throws Throwable {
	   pageObjectsManager.widgetsPage().select_date_and_time();
   }
   //Slider bar
   @Then("user able to slide on the bar")
   public void slide_on_the_bar() throws Throwable {
	   pageObjectsManager.widgetsPage().set_SliderBar();
   }
   //Progress Bar
   @Then("user able to progress on the bar")
   public void progress_on_the_progressBar() {
	   pageObjectsManager.widgetsPage().progress_Bar();
   }
   //ToolTips
   @Then("user able to get the tool tip text")
   public void user_able_to_get_the_tool_tip_text() throws Throwable {
	   pageObjectsManager.widgetsPage().get_Tool_Tip_Text();
   }
   //HoverMenu
   @Then("user able to hover to menu item")
   public void user_able_to_hover_to_menu_item() throws Throwable {
	   pageObjectsManager.widgetsPage().hover_menu_Item();
   }
   
  //Interactions
   @Then("user open the interaction item page {string}")
   public void user_open_the_interaction_item_page(String string) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   pageObjectsManager.interaction_page().openInteractionItems(string);
       
   }
   //Resizable Box
   @Then("user able to resize the box {string}")
   public void user_able_to_resize_the_the_box(String resizableBox) throws Throwable {
	   pageObjectsManager.interaction_page().resize(resizableBox,250,175);
       // Write code here that turns the phrase above into concrete actions
       
   }
   @Then("user able to drop box {string}")
   public void user_able_to_drop_box(String string) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
     pageObjectsManager.interaction_page().droppable(string);
   }
   
   @AfterTest(alwaysRun = true)
	public void closeTest() {
		   driver.quit();
	}
   
}
