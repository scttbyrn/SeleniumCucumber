package stepDefinition;

import org.testng.Assert;

import baseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.SignUpPage;

public class StepDefinition extends BaseTest {
	
	public SignUpPage signuppage;
	
	@Given("Open Browser")
	public void Open_Browser() {
		
		launchBrowser();
		
	}
	
	@Given("I am on GitHub Website")
	public void I_am_on_GitHub_Website() {
		
		landingpage.openBrowser("https://github.com");
		
	}
	
	@When("Validate the Headers")
	public void Validate_the_Headers() {
		
		Assert.assertTrue(landingpage.validateHeaders());
		
	}
	
	@And("Click the Header")
	public void Click_the_Header() {
		
		signuppage = landingpage.clickHeaders();
		
	}
	
	@Then("^Go to Sign up page and input the (.+) and (.+)$")
	public void Go_to_Sign_up_page_and_input_the_name_and_password(String name, String password) {
		
		signuppage.signUpAccount(name, password);
		
		
	}
	
	
	@And("validate {string}")
	public void validatePage(String string) {
		
		String text = "I am Sign Up page";
		
		System.out.println("Page Name is: "+text);
		
		Assert.assertEquals(text, string);
		
		driver.quit();
	}
	
	
	
	

	
	
	


}
