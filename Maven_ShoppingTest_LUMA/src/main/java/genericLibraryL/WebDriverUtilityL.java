package genericLibraryL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilityL {

	public static WebDriver driver;
	public static Actions action;
	
	public static void mouseHover(WebDriver driver,WebElement element) {
		action.moveToElement(element).perform();
	}
}
