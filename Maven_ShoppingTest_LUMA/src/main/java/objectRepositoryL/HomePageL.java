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
private WebElement createAnAccountLink;

@FindBy(partialLinkText ="Sign In")
//@FindBy(xpath = "//li[@class='authorization-link']/a")
private WebElement signInAccountLink;

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

@FindBy(css = "span>button[type='button']" )
private WebElement customerMenuToggleDropdown;

@FindBy(partialLinkText = "Sign Out")
private WebElement signOutOption;

public WebElement getWhatsNewLink() {
	return whatsNewLink;
}

public WebElement getWomenLink() {
	return womenLink;
}

public WebElement getMenLink() {
	return menLink;
}

public WebElement getGearLink() {
	return gearLink;
}

public WebElement getTrainingLink() {
	return trainingLink;
}

public WebElement getSaleLink() {
	return saleLink;
}

public WebElement getCreateAnAccount() {
	return createAnAccountLink;
}

public WebElement getSignInAccount() {
	return signInAccountLink;
}

public WebElement getWomenTopsLink() {
	return womenTopsLink;
}

public WebElement getWomenJacketsLink() {
	return womenJacketsLink;
}

public WebElement getMenTopsLink() {
	return menTopsLink;
}

public WebElement getMenJacketsLink() {
	return menJacketsLink;
}

public WebElement getMenTanksLink() {
	return menTanksLink;
}

public WebElement getCreateAnAccountLink() {
	return createAnAccountLink;
}

public WebElement getSignInAccountLink() {
	return signInAccountLink;
}

public WebElement getCustomerMenuToggleDropdown() {
	return customerMenuToggleDropdown;
}

public WebElement getSignOutOption() {
	return signOutOption;
}


}
