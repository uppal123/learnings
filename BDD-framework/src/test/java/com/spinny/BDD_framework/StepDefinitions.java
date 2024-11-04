package com.spinny.BDD_framework;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pom.Login;
import utils.Common;

import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	
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

	@Given("I am on Login page")
	public void navigateToLoginPage() {
		driver.navigate().to(url);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I enter {string} and {string}")
	public void loginWithCredentials(String username, String password) {
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	   
	}
	
	@And("I click on Log in button")
	public void loginButton() {
	    Login login = new Login(driver);
	    login.loginClick();
	   
	}
	
	@Then("I should be successfully logged in")
	public void successfulLogin() {
	    System.out.println("successfully loged in");
	    //throw new io.cucumber.java.PendingException();
	}
	
//	@Then("I should get login error message")
//	public void failureLoginMessage() {
//	   System.out.println("Error message displayed for invalid login credentials");
//	}
	
//	@When("I click on forgotton password button")
//	public void forgottonPasswordButton() {
//		Login login = new Login(driver);
//		login.forgotPassword1();
//	}
//
//	@Then("I should be moved to find your account page")
//	public void findYourAccountPage() {
//	   System.out.println("User is at Find your account page");
//	}
	
}
