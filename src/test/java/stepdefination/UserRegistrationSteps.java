package stepdefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {

	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {

		List<List<String>> userlist = dataTable.asLists(String.class);
		for (List<String> e : userlist) {
			System.out.println("Details" + e);
		}
	}

	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		List<Map<String, String>> userListMap = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> e : userListMap) {
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("phone"));
			System.out.println(e.get("city"));
		}
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {

	}

}
