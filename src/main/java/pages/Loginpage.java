package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends PageBase {

	public Loginpage(WebDriver driver) {
		super(driver);

	}

	@FindBy (id="Email")
	WebElement emailtxtbox;

	@FindBy (id="Password")
	WebElement passwordtxtbox;

	@FindBy (css="input.button-1.login-button")
	WebElement loginbtn;

	public void userlogin(String Email , String password)

	{
		setTextelement(emailtxtbox, Email);
		setTextelement(passwordtxtbox,password);
		clickbutoon(loginbtn);
	}
}
