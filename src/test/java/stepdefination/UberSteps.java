package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		System.out.println("Step 1:" + carType);

	}

	@When("User selects car {string} and pick up point as {string} drop location {string}")
	public void user_selects_car_and_pick_up_point_as_drop_location(String carType, String pickUpPoint,
			String dropLocation) {
		System.out.println("Step 2:" + carType + " "+ pickUpPoint +" "+ dropLocation);

	}

	@Then("Driver starts journey")
	public void driver_starts_journey() {
		System.out.println("Step 3:");

	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4:");

	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5:" + price);

	}

}
