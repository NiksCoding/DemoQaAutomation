
Feature: Demo QA Tiles

 @Tiles
  Scenario Outline:  Open the Tiles
  
    Given user open the demoQA App
    When user click on the '<Tiles>'
    Then validate tile get open
    
    Examples:
    |Tiles|
    |Elements|
    |Forms|
    |AlertsFrameAndWindows|
    |Widgets|
    |Interactions|
    |BookStoreApplications|
    
   #Elements Tile
   @ElementItems
   Scenario Outline: Open Element items
   
   Given user open the demoQA App
   When user click on the "Elements"
   Then validate tile get open
   And user open the '<ElementsItem>' page
   
   Examples:
   |ElementsItem|
   |Text Box|
   #|Check Box|
   #|Radio Buttons|
   #|Web tables|
   #|Buttons|
   #|Links|
   #|Broken Links - Images|
   #|Upload and Download|
   #|Dynamic Properties|	
   
   @TextBox
   Scenario: Fill the text box
   
   Given user on the Elements page
   And user open the "TextBox" page
   Then user fill all the text box
   And user click on submit button
   
   @CheckBox
   Scenario: CheckBox
   Given user on the Elements page
   And user open the "CheckBox" page
   Then user tick react check box
   
   @RadioButton
   Scenario: CheckBox
   Given user on the Elements page
   And user open the "RadioButton" page
   Then user tick impressive radio button
   
    @Webtables
   Scenario: CheckBox
   Given user on the Elements page
   And user open the "Webtables" page
   Then user open a new form from add button
   And submit after filling the details
   
   @Buttons
   Scenario Outline: Buttons
   Given user on the Elements page
   And user open the "Buttons" page
   Then user perform the mouse '<action>'
   Examples:
   |action|
   |DoubleClick|
   |RightClick|
   
   
   @Links
   Scenario Outline: Links
   Given user on the Elements page
   And user open the "Links" page
   Then user select the '<links>'
   
   Examples:
   |links|
   |Simple link|
   |Dynamic link|
   |Api link|
   
   @Upload_Download
   
   Scenario: Upload and Download image
   
  Given user on the Elements page
  And user open the "UploadAndDownload" page
  Then validate user able to download the image
  And user is able to upload an image
   
   #Form Tile
   @FormsTile
   Scenario: Submit the form
   
   Given user open the demoQA App
   When user click on the "Forms"
   Then validate tile get open
   And user submit the form with details
   
   #Alerts Frame and window Tile
   @AlertsFrameAndWindowsItems
   Scenario Outline: Open AlertsFrameAndWindows Items
   
   Given user open the demoQA App
   When user click on the "AlertsFrameAndWindows"
   Then validate tile get open
   And user open the page '<AlertsFrameAndWindowsItems>'
   
   Examples:
   |AlertsFrameAndWindowsItems|
   |BrowserWindows|
   |Alerts|
   |Frames|
   |NestedFrames|
   |ModalDialogs|
   
   @BrowserWindows
   Scenario Outline: BrowserWindows
   
   Given user open the demoQA App
   When user click on the "AlertsFrameAndWindows"
   And user open the page "BrowserWindows"
   Then user open the Browser Windows item '<BrowserWindowsBtn>'
   And validate '<Action>' 
   
   Examples:
   |BrowserWindowsBtn|Action|
   |NewTabBtn|NewTabOpen|
   #|NewWindowBtn|NewWindowOpen|
   #|NewWindowMessage|NewWindowMessageOpen|
   
   @Alerts
   Scenario Outline: Alerts
   
   Given user open the demoQA App
   When user click on the "AlertsFrameAndWindows"
   And user open the page "Alerts"
   Then user open the Alerts item '<AlertsBtn>'
   And validate Alert '<Action>' 
   
   Examples:
   |AlertsBtn|Action|
   |SimpleAlert|closeAlert|
   |timerAlertBtn|closeDelayedAlert|
   |confirmBtn|closeConfirmBox|
   |promtBtn|ClosePromptBox|
   
   @ModalDialogs
   Scenario Outline: Modals
   
   Given user open the demoQA App
   When user click on the "AlertsFrameAndWindows"
   And user open the page "ModalDialogs"
   Then user click on the modal button '<ModalBtn>'
   And print modal Text '<ModalType>'
   
   Examples:
   |ModalBtn|ModalType|
   |SmallModal|SmallModal|
   |LargeModal|LargeModal|
   
   
   #Widgets
   @WidgetsItems
   Scenario Outline: Open Widgets Items
   
   Given user open the demoQA App
   When user click on the "Widgets"
   Then validate tile get open
   And user open the widgets item page '<WidgetsItems>'
   
   Examples:
   |WidgetsItems|
  # |Accordian|
   |AutoComplete|
  # |DatePicker|
  # |Slider|
  # |ProgressBar|
  # |ToolTips|
  # |Menu|
  # |SelectMenu|
  
  @AutoCompleteField
  Scenario Outline: Fill the Auto text fields
  
  Given user open the demoQA App
  When user click on the "Widgets"
  And user open the widgets item page "AutoComplete"
  Then user fill the auto text field '<field>'
  
  Examples:
  |field|
  |MultiTextField|
  |SingleTextField|
   
   @DateAndTimePicker
   Scenario: Fill the Date and time from picker
  
  Given user open the demoQA App
  When user click on the "Widgets"
  And user open the widgets item page "DatePicker"
  Then user fill the Date and time from picker
  
  @SliderBar
   Scenario: Slide the Bar
  
  Given user open the demoQA App
  When user click on the "Widgets"
  And user open the widgets item page "Slider"
  Then user able to slide on the bar
  
   @ProgressBar
   Scenario: Slide the Bar
  
  Given user open the demoQA App
  When user click on the "Widgets"
  And user open the widgets item page "ProgressBar"
  Then user able to progress on the bar
    
    @ToolTip
   Scenario: Slide the Bar
  
  Given user open the demoQA App
  When user click on the "Widgets"
  And user open the widgets item page "ToolTips"
  Then user able to get the tool tip text
   
    @HoverMenu
   Scenario: Slide the Bar
  
  Given user open the demoQA App
  When user click on the "Widgets"
  And user open the widgets item page "Menu"
  Then user able to hover to menu item
  
  #Interactions
   @InteractionItems
   Scenario Outline: Open Interaction Items
   
   Given user open the demoQA App
   When user click on the "interactions"
   Then validate tile get open
   And user open the interaction item page '<InteractionItems>'
   
   Examples:
   |InteractionItems|
   #|Sortable|
   #|Selectable|
   |Resizable|
   #|Droppable|
   #|Dragabble|
   
   
   #Resizable
   @ResizeBox
   Scenario Outline: Resize the box
   Given user open the demoQA App
   When user click on the "interactions"
   Then validate tile get open
   And user open the interaction item page "Resizable"
   And user able to resize the box '<box>'
   
   Examples:
   |box|
   |Resizable box, starting at 200x200. Min size is 150x150, max is 500x300.|
   |Resizable|
   
   #Droppable
   @Droppable
   Scenario Outline: Resize the box
   Given user open the demoQA App
   When user click on the "interactions"
   Then validate tile get open
   And user open the interaction item page "Droppable"
   And user able to drop box '<boxType>'
   
   Examples:
   |boxType|
   |Simple|
   #|Accept|
   #|Prevent Propogation|
   #|Revert Draggable|   
   
  
