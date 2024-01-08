package testScriptsL;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.testng.annotations.Test;

import genericLibraryL.BaseClassL;
import objectRepositoryL.HomePageL;
import objectRepositoryL.MenJacketsPage;

public class MenJacketsTest extends BaseClassL{

	@Test
	public void jacketTest() throws InterruptedException {
		HomePageL homePage = new HomePageL(driver);
		Thread.sleep(2000);
		mouseHover(driver, homePage.getMenLink());
//		homePage.getMenLink().click();
		//action.click(homePage.getMenLink());
		Thread.sleep(2000);
		mouseHover(driver, homePage.getMenTopsLink());
		Thread.sleep(2000);
		mouseClick(driver, homePage.getMenJacketsLink());
		
		MenJacketsPage menJackPage = new MenJacketsPage();
		mouseScrollByAmount(driver, 0, 1000);
		
//		scrollingToElement(driver, menJackPage.getProteusFitnessJacketLink());
		Thread.sleep(2000);
		
		menJackPage.getSizeXS_Option().click();
		Thread.sleep(2000);
		
		menJackPage.getBlueColor_Option().click();
		Thread.sleep(2000);
		
		menJackPage.getAddToCartButton().click();
		Thread.sleep(2000);
		
		menJackPage.getAddToCartIcon().click();
		Thread.sleep(2000);
		
	}
//HI
}
