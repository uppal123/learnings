package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	WebDriver driver;
	
	public void setupBrowser(String browser, String url) {

		String currdir = System.getProperty("user.dir");
		System.out.println(currdir);
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", currdir +"/driver/chromedriver");
			driver= new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", currdir +"/driver/geckodriver");
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("valid browser was not provided");
			System.exit(0);

		}
		driver.get(url);
		
		driver.manage().window().maximize();

		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public WebDriver getDriver() {
		return driver;
		
	}
	
	public void closeTab() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
		
	}

}
