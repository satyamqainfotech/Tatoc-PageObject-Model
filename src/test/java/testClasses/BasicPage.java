package testClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPage {
	
	WebDriver driver;
	
	public BasicPage(WebDriver driver){
		this.driver = driver;
	}
	
	public Boolean clickOnBasicCourseLink() {
		driver.findElement(By.cssSelector("a")).click();
		String ExpectedURL = "http://10.0.1.86/tatoc/basic/grid/gate";
		if(driver.getCurrentUrl().equals(ExpectedURL))
			return true;
		return false;
	}
	public Boolean clickOnAdvanceCourseLink() {
		System.out.println(this.driver.getCurrentUrl());
		this.driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(6)")).click();
		String ExpectedURL = "http://10.0.1.86/tatoc/advanced/hover/menu";
		if(driver.getCurrentUrl().equals(ExpectedURL)) {
			driver.navigate().back();
			return true;
		}
		return false;
	}
	
	
	
}
