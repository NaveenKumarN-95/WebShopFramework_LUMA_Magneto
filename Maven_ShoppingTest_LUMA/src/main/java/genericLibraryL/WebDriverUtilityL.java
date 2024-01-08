package genericLibraryL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilityL {

	public static WebDriver driver;
	public static Actions action;
	
	public static void mouseHover(WebDriver driver,WebElement element) {
		action.moveToElement(element).perform();
	}
	public static void mouseClick(WebDriver driver,WebElement element) {
		action.click(element).perform();
	}
	
	public static void mouseScrollByAmount(WebDriver driver, int x,int y) {
		action.scrollByAmount(x, y);
	}
	public static void scrollingToElement(WebDriver driver,WebElement element) {
		action.scrollToElement(element).perform();
	}
	
/*	public static void scrollFromOrigin(WebDriver driver,WebElement element) {
		action.scrollFromOrigin(null, 0, 0);
	}
*/
	public static void initObjects(WebDriver driver) {
		action=new Actions(driver);
		//je=(JavascriptExecutor) driver;
		
	}
}
