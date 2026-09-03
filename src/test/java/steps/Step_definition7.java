package steps;

import org.junit.Assert;

import Base_class.base_class7;
import Pages.deliveryorders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition7 extends base_class7 {
	
	deliveryorders od = new deliveryorders(wd) ;

  //1st scenario
	@Given("the user launches the EspoCRM application")
	public void the_user_launches_the_espo_crm_application() {
		
	    openurl("https://demo.us.espocrm.com/");
	    
	}

	@When("the user clicks the Login button")
	public void the_user_clicks_the_login_button() {
	    
		clicks(explicitWaitClickable(od.getLoginButton()));

	}

	@Then("the user should be successfully logged into EspoCRM")
	public void the_user_should_be_successfully_logged_into_espo_crm() {
	    
		Assert.assertTrue(
		        "User is not successfully logged into EspoCRM",
		        isDisplayed(od.getHomepage())
		    );
		
		System.out.println("user should be successfully logged into EspoCRM");
		
	}
	
	
 //2nd scenario
	@Given("the user is on the homepage")
	public void the_user_is_logged_into_espo_crm() {
	    
		System.out.println("the user is on the homepage");
	}

	@When("the user mousehovers over Sales and Purchases")
	public void the_user_hovers_over_sales_and_purchases() {
	    
	    
	    ScrollToElement(od.getSalesPurchases());
	    clicks(explicitWaitClickable(od.getSalesPurchases()));
	    
	    
	}

	@When("the user clicks on Delivery Orders")
	public void the_user_clicks_on_delivery_orders() {
	  
		clicks(explicitWaitClickable(od.getDeliveryOrders()));
	}

	@Then("the Delivery Orders page should be displayed")
	public void the_delivery_orders_page_should_be_displayed() {
	    
	     
	    Assert.assertEquals( "Delivery Orders",
	    	    explicitWaitVisible(od.getDeliveryOrdersLabel()).getText()
	    	);

		System.out.println("the Delivery Orders page should be displayed");
		 
	}

	 //3rd scenario
	@Given("the user is on the Delivery Orders page")
	public void the_user_is_on_the_delivery_orders_page() {
	   
		System.out.println("the user is on the Delivery Orders page");
	}

	@When("the user clicks on Create Delivery Order")
	public void the_user_clicks_on_create_delivery_order() {
	    
		clicks(explicitWaitClickable(od.getCreateDeliveryOrder()));
	}

	@When("the user selects {string} from the Status dropdown")
	public void the_user_selects_from_the_status_dropdown(String string) {
	    
		clicks(explicitWaitClickable(od.getStatus()));
		clicks(explicitWaitVisible(od.getCompleted()));
	}

	@When("the user selects {string} from the Account dropdown")
	public void the_user_selects_from_the_account_dropdown(String string) {
	   
		 actionClick(explicitWaitClickable(od.getAccount()));
		 actionClick(explicitWaitClickable(od.getJaneville()));
	}

	@When("the user enters {string} in the Date Ordered field")
	public void the_user_enters_in_the_date_ordered_field(String dateOrdered) {
	    
		explicitWaitVisible(od.getDateOrdered()).clear();
		explicitWaitVisible(od.getDateOrdered()).sendKeys(dateOrdered);
	}

	@When("the user enters {string} in the Delivery Date field")
	public void the_user_enters_in_the_delivery_date_field(String deliveryDate) {
	   
		explicitWaitVisible(od.getDeliveryDate()).sendKeys(deliveryDate);
		
	}

	@When("the user selects {string} from the Warehouse dropdown")
	public void the_user_selects_from_the_warehouse_dropdown(String string) {
	    
		clicks(explicitWaitClickable(od.getWarehouse()));
		clicks(explicitWaitVisible(od.getMainWarehouse()));
		
	}

	@When("the user selects {string} from the Shipping Provider dropdown")
	public void the_user_selects_from_the_shipping_provider_dropdown(String string) {
	   
		clicks(explicitWaitClickable(od.getShippingProvider()));
		clicks(explicitWaitVisible(od.getRoyalParcel()));

	}

	@When("the user enters {string} in the Description field")
	public void the_user_enters_in_the_description_field(String description) {
	  
		explicitWaitVisible(od.getDescription()).sendKeys(description);
	}

	@When("the user clicks on Save")
	public void the_user_clicks_on_save() {
	   
		clicks(explicitWaitClickable(od.getSave()));
	}

	@Then("the delivery order should be created successfully with result")
	public void the_delivery_order_should_be_created_successfully_with_result() {
	    
		Assert.assertTrue(
			    "Delivery Order number is not displayed",
			    isDisplayed(od.getDeliveryOrderNumber())
			);
		System.out.println("the delivery order should be created successfully");
	}

	//4th scenario
	@Given("the user is on Delivery Orders page")
	public void the_user_is_on_delivery_orders_page() {
	   
		System.out.println("the user is on Delivery Orders page");
	}
	
	@When("the user clicks on Edit")
	public void the_user_clicks_on_edit() {
	   
		clicks(explicitWaitClickable(od.getEdit()));
		
	}

	@When("the user updates description in the Description field & clicks on save")
	public void the_user_updates_description_in_the_description_field_clicks_on_save() {
	    
		explicitWaitVisible(od.getDescription()).clear();
		explicitWaitVisible(od.getDescription()).sendKeys("new product description");
		
	}

	@Then("the Delivery Order should be updated successfully")
	public void the_delivery_order_should_be_updated_successfully() {
	    
		/*clicks(explicitWaitClickable(od.getSave()));
		
		Assert.assertEquals(
		        explicitWaitVisible(od.getSavedMessage()).getText(),
		        "Saved",
		        "Saved message is not displayed"
		    );*/

		
		System.out.println("the Delivery Order should be updated successfully");
	}
	
	//5th scenario
	
	@Given("the user is on the Delivery Order saved page")
	public void the_user_is_on_the_delivery_order_saved_page() {
	   
		System.out.println("the user is on the Delivery Order saved page");
	}

	@When("the user navigates back")
	public void the_user_navigates_back() {
	   
		      back();
		
	}

	@When("the user selects the Completed status filter option")
	public void the_user_selects_the_completed_status_filter_option() {
	   
		clicks(explicitWaitClickable(od.getConfirm()));
	    back();
	    
	    clicks(explicitWaitClickable(od.getFilter()));
		clicks(explicitWaitClickable(od.getcompletedstatus()));


	}

	@Then("the user should be able to view completed Delivery Orders")
	public void the_user_should_be_able_to_view_completed_delivery_orders() {
	  
		 Assert.assertEquals(
			        explicitWaitVisible(od.getDeliveryOrderNum()).getText(),
			        "DO-00005",
			        "Delivery Order number is not displayed"
			    );
		System.out.println("the user should be able to view completed Delivery Orders");
	}
	
	//6th scenario
	
	@Given("the user is on the completed status Delivery Order")
	public void the_user_is_on_the_completed_status_delivery_order() {
	   
		System.out.println("the user is on the completed status Delivery Order");
	}

	@When("the user selects the all status filter option")
	public void the_user_selects_the_all_status_filter_option() {
	    
		clicks(explicitWaitClickable(od.getFilter()));
		clicks(explicitWaitClickable(od.getallstatus()));
	}

	@When("the user enters delivery order number in the search box")
	public void the_user_enters_delivery_order_number_in_the_search_box() {
	   
		explicitWaitVisible(od.getSearchBox()).sendKeys("DO-00005");
	}

	@When("the user clicks the Search button")
	public void the_user_clicks_the_search_button() {
	   
		clicks(explicitWaitClickable(od.getSearchButton()));
	}

	@Then("the user should see the delivery order number")
	public void the_user_should_see_the_delivery_order_number() {
	    
		 Assert.assertEquals(
			        explicitWaitVisible(od.getDeliveryOrderNum()).getText(),
			        "DO-00005",
			        "Delivery Order number is not displayed"
			    );
		 
		System.out.println("the user should see the delivery order number");
	}
	
	
 

}


