package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MorganSteps {

	WebDriver driver = new ChromeDriver();

	@Given("User Navigates to the morgan Stanely URL")
	public void user_navigates_to_the_morgan_stanely_url() {
		driver.get("https://www.morganstanley.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='header-navbartop']//child::li/a[contains(text(), 'Client Login')]"))
				.click();
	}

	@Then("user clicks on client login")
	public void user_clicks_on_client_login() {
		
		driver.findElement(By.xpath("(//li/a[contains(text(), 'Morgan Stanley Online')])[2]")).click();
	}

	@Then("User keys in username")
	public void user_keys_in_username() {
	
	}
	@Then("the Password")
	public void the_password() {
		
	}

	@Then("user clicks on Log in")
	public void user_clicks_on_log_in() {
	
	}

}
