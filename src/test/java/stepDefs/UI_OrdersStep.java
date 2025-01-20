package stepDefs;



import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Cart_Page;
import pageObjects.Inventory_Main_Page;
//import pageObjects.Login_Page;
import utils.ReadConfigFile;

public class UI_OrdersStep {

//	public Login_Page loginPage = new Login_Page();
	public Inventory_Main_Page inventoryMainPage = new Inventory_Main_Page();
	public Cart_Page cartPage = new Cart_Page();
    static String URL = ReadConfigFile.readConfig("URL");

    @Given("User is on Amazon page")
    public void user_is_on_amazon_page()  {
        System.out.println("Launching browser and site "+URL );
    }

	@When("User selects the item to add cart")
	public void clicks_button_to_add_item_in_cart() throws Exception {
	   inventoryMainPage.clickAddButton();
	}

    @When("User search for {string} as search item")
    public void search_item(String search) throws Exception {
        inventoryMainPage.searchItem(search);
    }
	
	@Then("Verify the cart has been updated and displays the number of items in the cart")
	public void should_be_visible_counter_yellow_badge_on_cart_icon() throws InterruptedException {
	    inventoryMainPage.visibilityOfYellowBadgeCounter();
	}
	@When("In inventpory page select {int} items")
	public void in_inventpory_page_select_items(Integer n) throws Exception {
		inventoryMainPage.selectItems(n);
		
	}

	@And("User clicks on Add to cart icon")
	public void user_clicks_on_shoping_cart_icon() throws Exception {
		inventoryMainPage.clickOnCart();
		
	} 

	@Then("There should be {int} items in the shopping cart list")
	public void there_should_be_items_in_the_shopping_cart_list(Integer n) { 
		cartPage.checkNumberOfItems(cartPage.itemCount(), n);
		
	}
	@When("User selects")
	public void user_selects(io.cucumber.datatable.DataTable dataTable){
	    List<String> selectedItems = dataTable.asList();
	    for(String itemName : selectedItems ) {	
	    	inventoryMainPage.addItemInCartByName(itemName);
	    }
	    
	}
	@And("The user clicks on shoping cart icon")
	public void the_user_clicks_on_shoping_cart_icon() throws InterruptedException {
		inventoryMainPage.clickOnCart();
	}
	
	@And("Clicks Checkout button")
	public void clicks_checkout_button(){
		cartPage.clickCheckout();
	}

}
