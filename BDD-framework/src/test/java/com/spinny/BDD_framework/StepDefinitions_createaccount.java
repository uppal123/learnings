package com.spinny.BDD_framework;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Login;
import utils.Common;

public class StepDefinitions_createaccount {
	WebDriver driver;
	Common common;
	
	String browser = "firefox";
	String url = "https://www.facebook.com/";
	
	@Before
	public void setup() {
		common = new Common();
		common.setupBrowser(browser, url);
		driver= common.getDriver();
	}
	
	@After
	public void tearDown() {
		common.quitBrowser();	
	}
	
	@Given("I am on Facebook page")
	public void i_am_on_facebook_page() {
		driver.navigate().to(url);
	}

	@And("I click on {string} button")
	public void i_click_on_button(String string) {
		Login login = new Login(driver);

	}

	@When("I enter all necessary user details")
	public void i_enter_all_necessary_user_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("I click on Sign Up button")
	public void i_click_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I will be successfully created an account on Facebook")
	public void i_will_be_successfully_created_an_account_on_facebook() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
