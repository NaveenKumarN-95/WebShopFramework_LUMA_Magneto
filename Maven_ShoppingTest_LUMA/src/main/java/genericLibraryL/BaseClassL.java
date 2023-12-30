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

public class BaseClassL {
	public WebDriver driver;
@BeforeSuite
public void beforeSuite() {
Reporter.log("connection to database",true);	
}
@AfterSuite
public void afterSuite() {
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
}
@AfterClass
public void afterClass() {
	Reporter.log("After Class",true);
	
}
@BeforeMethod
public void beforeMethod() {
	Reporter.log("Before Method",true);
}
@AfterMethod
public void afterMethod() {
	Reporter.log("After Method",true);
}

}
