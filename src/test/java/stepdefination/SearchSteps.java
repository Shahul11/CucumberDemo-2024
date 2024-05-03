package stepdefination;

import org.junit.Assert;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search filed in Amazon Page")
	public void i_have_a_search_filed_in_amazon_page() {
		System.out.println("Step 1: I am on search page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search for product with name " + productName + " and price " + price);
		product = new Product(productName, price);

	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: Product with name " + productName + " is displayed");

		search = new Search();
		String prdName = search.displayProduct(product);
		System.out.println("Name of the product " + prdName);
		Assert.assertEquals(product.getProductName(), prdName);

	}

	
	@Then("order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer int1, String string) {
		System.out.println("Order Id is " + int1 + "Name of the person is " + string);
	}

}
