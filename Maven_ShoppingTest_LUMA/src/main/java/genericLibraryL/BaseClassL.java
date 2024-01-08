package genericLibraryL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objectRepositoryL.HomePageL;
import objectRepositoryL.SigninPage;
// https://magento.softwaretestingboard.com/
public class BaseClassL extends WebDriverUtilityL{
	public WebDriver driver;
@BeforeSuite
public void beforeSuite() {
Reporter.log("connection to database",true);	
}

@AfterSuite
public void afterSuite() {
	// driver.quit();
	Reporter.log("connection closed",true);
}

@BeforeTest
public void beforeTest() {
	Reporter.log("Before test",true);
}

@AfterTest
public void afterTest() {
	Reporter.log("After test",true);
}

@BeforeClass
public void beforeClass() {
	Reporter.log("Before Class",true);
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://magento.softwaretestingboard.com/");
	initObjects(driver);
}

@AfterClass
public void afterClass() {
	Reporter.log("After Class",true);	
}

@BeforeMethod
public void beforeMethod() throws InterruptedException {
	Reporter.log("Before Method",true);
	Reporter.log("Sign in",true);
	/*
	HomePageL homePage = new HomePageL(driver);
	SigninPage signInPage = new SigninPage(driver);
	Thread.sleep(2000);
	homePage.getSignInAccount().click();
	Thread.sleep(2000);
	signInPage.getEmailTextField().sendKeys(FileUtilityL.getProperty("email"));
	Thread.sleep(2000);
	signInPage.getPasswordTextField().sendKeys(FileUtilityL.getProperty("password"));
	Thread.sleep(2000);
	signInPage.getSignInButton().click();
	Thread.sleep(4000);
	
	*/
	//signInPage.signin(driver);
}

@AfterMethod
public void afterMethod() throws InterruptedException {
	Reporter.log("After Method",true);
	Reporter.log("Log out",true);
	
 /* HomePageL homePage = new HomePageL(driver);
	homePage.getCustomerMenuToggleDropdown().click();
	Thread.sleep(2000);
	homePage.getSignOutOption().click(); 
	*/
}

}
