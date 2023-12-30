package objectRepositoryL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageL {
public HomePageL(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

@FindBy(linkText = "What's New")
private WebElement whatsNewLink;

@FindBy(linkText = "Women")
private WebElement womenLink;

@FindBy(linkText = "Men")
private WebElement menLink;

@FindBy(linkText = "Gear")
private WebElement gearLink;

@FindBy(linkText = "Training")
private WebElement trainingLink;

@FindBy(linkText = "Sale")
private WebElement saleLink;

@FindBy(linkText = "Create an Account")
private WebElement createAnAccount;

@FindBy(linkText = " Sign In ")
private WebElement signInAccount;

@FindBy(id = "ui-id-9")
private WebElement womenTopsLink;

@FindBy(id = "ui-id-11")
private WebElement womenJacketsLink;

@FindBy(id = "ui-id-17")
private WebElement menTopsLink;

@FindBy(id="ui-id-19")
private WebElement menJacketsLink;

@FindBy(id = "ui-id-22")
private WebElement menTanksLink;

}
