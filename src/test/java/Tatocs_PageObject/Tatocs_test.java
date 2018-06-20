package Tatocs_PageObject;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import testClasses.BasicPage;
import testClasses.GridBox;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Tatocs_test {
	
	WebDriver driver;
	BasicPage firstPage;
	GridBox secondPage;
	public Tatocs_test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://10.0.1.86/tatoc/");
	    firstPage = new BasicPage(driver);
	    secondPage = new GridBox(driver);	
	}
//First Page
	
  @Test
  public void clickOnAdvanceCourse(){
      Assert.assertTrue(firstPage.clickOnAdvanceCourseLink());
  }
  
  @Test(dependsOnMethods = "clickOnAdvanceCourse")
  public void clickOnBasicCourse(){
      Assert.assertTrue(firstPage.clickOnBasicCourseLink());
  }
  
  //Second Page
  
  @Test(dependsOnMethods = "clickOnBasicCourse")
  public void greenBoxIsDisplayed(){
      Assert.assertTrue(secondPage.greenBoxIsDisplayed());
  }
  @Test
  public void clickOnRedBox() {
	  Assert.assertTrue(secondPage.onClickOfRedTile());
  }
  @Test
  public void clickOnGreenBox() {
	  Assert.assertTrue(secondPage.goToFrameDungeonPage());;
  }

 
  
 
  
 
  public Boolean goToErrorPage() {
		 driver.findElement(By.className("redbox")).click();
		 String expectedURL = "http://10.0.1.86/tatoc/error";
		 if(driver.getCurrentUrl().equals(expectedURL))
			 return true;
		 return false;
	 }
 
      


//  @BeforeClass
//  public void launchBrowser(){
//      driver = new ChromeDriver();
//      driver.get("http://10.0.1.86/tatoc/");
//  }

//  @AfterClass
//  public void closeBrowser(){
//      driver.quit();
//  }

}
