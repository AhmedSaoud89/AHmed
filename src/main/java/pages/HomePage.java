package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	
		
	}
	@FindBy (linkText="Register")
	WebElement registerlink;
	

	@FindBy (linkText ="Log in")
	WebElement loginlink;
	
	@FindBy (linkText="Contact us")
	WebElement contactusbtn;
	
	@FindBy (id="customerCurrency")
	WebElement currencydrop;
	
	@FindBy (linkText ="Computers")
	WebElement Computermenu;
	
	@FindBy (linkText="Notebooks")
	WebElement nootbookMenu;
	
	public void openregistrationpage() {
		
		clickbutoon(registerlink);
		
	}
	public void openloginpage() {
		clickbutoon(loginlink);
	}
	
	public void opencontactuspage()
	{
		scrolltoBottom();
		clickbutoon(contactusbtn);
	}
	public void changecurrency()
	{
		select = new Select(currencydrop);
		select.selectByVisibleText("Euro");
	}
	public void SelectNoteBooksMenu()
	{
		action.moveToElement(Computermenu).moveToElement(nootbookMenu).click().build().perform();
	}
}
