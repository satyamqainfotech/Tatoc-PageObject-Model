package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GridBox {
	WebDriver driver;
	private String ExpectedURL;

	
	public GridBox(WebDriver driver) {
		this.driver = driver;
	}
	 public Boolean greenBoxIsDisplayed() {
		 if(driver.findElement(By.className("greenbox")).isDisplayed())
			 return true;
		 return false;
	}
	public Boolean onClickOfRedTile() {
		Error errorObject = new Error(driver);
		if(errorObject.validateErrorPage())
			return true;
		return false;
	}
	 public Boolean goToFrameDungeonPage() {
		 driver.navigate().back();
		 driver.findElement(By.className("greenbox")).click();
		 ExpectedURL = "http://10.0.1.86/tatoc/basic/frame/dungeon";
		 if(driver.getCurrentUrl().equals(ExpectedURL))
			 return true;
		 return false;
	}
}
