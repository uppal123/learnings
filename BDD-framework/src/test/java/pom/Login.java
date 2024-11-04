package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@CacheLookup
	@FindBy(id= "email")
	WebElement emailElement;
	
	@CacheLookup
	@FindBy(id ="pass")
	WebElement passElement;
	
	@CacheLookup
	@FindBy(partialLinkText = "Forgotten password?")
	WebElement forgotpassElement;
	
	@CacheLookup
	@FindBy(partialLinkText = "Log in")
	WebElement loginElement;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithCredentials(String username, String password) {
		
		emailElement.clear();
		emailElement.sendKeys(username);
		
		passElement.clear();
		passElement.sendKeys(password);
	}
	
	public void loginClick() {
		loginElement.click();
	}

	public void forgotPassword1() {
		forgotpassElement.click();
	}


}
