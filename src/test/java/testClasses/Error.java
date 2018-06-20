package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Error {
	WebDriver driver;
	private String ExpectedURL;
	
	public Error(WebDriver driver) {
		this.driver = driver;
		this.ExpectedURL = "http://10.0.1.86/tatoc/error";
	}
	
	public Boolean validateErrorPage() {
		if(driver.getCurrentUrl().equals(ExpectedURL))
			return true;
		return false;
	}
	
	public String getErrorMessage() {
		if(driver.getCurrentUrl().equals(ExpectedURL))
			return driver.findElement(By.cssSelector("body > div > div.page > span")).getText();
		return "Not at the error page";
	}
}
