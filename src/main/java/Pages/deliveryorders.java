package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deliveryorders {
	
	WebDriver wd;

    public deliveryorders(WebDriver wd)
    
    {//local variable
		   
		   this.wd = wd;
	        
		   PageFactory.initElements(wd, this);
		  
		   }
    
    
    // Login button
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }
    
    //salesPurchases
    @FindBy(xpath = "//span[text()='Sales & Purchases']")
    WebElement salesPurchases;

    public WebElement getSalesPurchases() {
        return salesPurchases;
    }
    
    //deliveryorders
    @FindBy(xpath = "//span[text()='Delivery Orders']")
    WebElement deliveryOrders;

    public WebElement getDeliveryOrders() {
        return deliveryOrders;
    }
    
    //Create Delivery Order
    @FindBy(xpath = "//a[contains(.,'Create Delivery Order')]")
    private WebElement createDeliveryOrder;

    public WebElement getCreateDeliveryOrder() {
        return createDeliveryOrder;
    }

    //status button
    @FindBy(xpath = "//div[@data-name='status']")
    private WebElement status;

    public WebElement getStatus() {
        return status;
    }
   
    //completed
    @FindBy(xpath = "//*[text()='Completed']")
    private WebElement completed;

    public WebElement getCompleted() {
        return completed;
    }
    
    //account button
    @FindBy(xpath = "//div[@data-name='account']//button")
    private WebElement account;

    public WebElement getAccount() {
        return account;
    }
    
    //Stratabiz
    @FindBy(xpath = "//a[text()='Janeville']")
    private WebElement Janeville;

    public WebElement getJaneville() {
        return Janeville;
    }
    
   //Date Ordered
    @FindBy(xpath = "//input[@data-name='dateOrdered']")
    private WebElement dateOrdered;

    public WebElement getDateOrdered() {
        return dateOrdered;
    }
    
   //Delivery Date
    @FindBy(xpath = "//input[@data-name='deliveryDate']")
    private WebElement deliveryDate;

    public WebElement getDeliveryDate() {
        return deliveryDate;
    }
    
    //warehouse button
    @FindBy(xpath = "//div[@data-name='warehouse']//button")
    private WebElement warehouse;

    public WebElement getWarehouse() {
        return warehouse;
    }
   
    //Main Warehouse
    @FindBy(xpath = "//a[text()='Main Warehouse']")
    private WebElement mainWarehouse;

    public WebElement getMainWarehouse() {
        return mainWarehouse;
    }
    
    //Shipping Provider
    @FindBy(xpath = "//div[@data-name='shippingProvider']")
    private WebElement shippingProvider;

    public WebElement getShippingProvider() {
        return shippingProvider;
    }
    
    //Royal Parcel
    @FindBy(xpath = "//*[text()='Royal Parcel']")
    private WebElement royalParcel;

    public WebElement getRoyalParcel() {
        return royalParcel;
    }
    
    //Description
    @FindBy(xpath = "//textarea[@data-name='description']")
    private WebElement description;

    public WebElement getDescription() {
        return description;
    }
    
    //save
    @FindBy(xpath = "//button[contains(.,'Save')]")
    private WebElement save;

    public WebElement getSave() {
        return save;
    }
    
    //edit
    @FindBy(xpath = "//button[@data-name='edit']")
    private WebElement edit;

    public WebElement getEdit() {
        return edit;
    }
    
    //confirm button
    @FindBy(xpath = "//button[@data-name='confirm']")
    private WebElement confirm;

    public WebElement getConfirm() {
        return confirm;
    }
    
    //search box
    @FindBy(xpath = "//input[@class='form-control text-filter']")
    private WebElement searchBox;

    public WebElement getSearchBox() {
        return searchBox;
    }
    
    //search button
    @FindBy(xpath = "//button[@class='btn btn-default search btn-icon btn-icon-x-wide']")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }
    
    //reset button
    @FindBy(xpath = "//button[@data-action='reset']")
    private WebElement reset;

    public WebElement getReset() {
        return reset;
    }
    
    //filter option
    @FindBy(xpath = "//button[@title='Filter']")
    private WebElement filter;

    public WebElement getFilter() {
        return filter;
    }
    
    //completed status
    @FindBy(xpath = "//div[text()='Completed']")
    private WebElement completedstatus;

    public WebElement getcompletedstatus() {
        return completedstatus;
    }
    
  //completed status
    @FindBy(xpath = "//div[text()='All']")
    private WebElement allstatus;

    public WebElement getallstatus() {
        return allstatus;
    }
    
    //home page
    @FindBy(xpath = "//span[text()='Home']")
    private WebElement homepage;

    public WebElement getHomepage() {
        return homepage;
    }
    
    //delivery order   
    @FindBy(xpath = "//span[@title='Click to refresh']")
    private WebElement deliveryOrdersLabel;

    public WebElement getDeliveryOrdersLabel() {
        return deliveryOrdersLabel;
    }
  
    //deliveryorder number
    @FindBy(xpath = "//span[contains(text(),'DO-00')]")
    private WebElement deliveryOrderNumber;

    public WebElement getDeliveryOrderNumber() {
        return deliveryOrderNumber;
    }
    
    //save message
    @FindBy(xpath = "//div[text()='Saved']")
    private WebElement savedMessage;

    public WebElement getSavedMessage() {
        return savedMessage;  
     
    }
    
    //order number
    @FindBy(xpath = "//a[text()='DO-00005']")
    private WebElement deliveryOrderNum;

    public WebElement getDeliveryOrderNum() {
        return deliveryOrderNum;
    }
    
    //deliveryorders dropdown
    @FindBy(xpath = "//button[contains(@class,'btn-link')]")
    private WebElement dropdown;

    public WebElement getDropdown() {
    return dropdown;
    }
    
    //view option
    @FindBy(xpath = "//a[@data-action='quickView']")
    private WebElement view;

    public WebElement getView() {
    return view;
    }
    
    //close option
    @FindBy(xpath = "//button[text()='Close']")
    private WebElement close;

    public WebElement getClose() {
    return close;
    }
    
    //remove option
    @FindBy(xpath = "//a[@data-action='quickRemove']")
    private WebElement remove;

    public WebElement getRemove() {
    return remove;
    }
    
}
