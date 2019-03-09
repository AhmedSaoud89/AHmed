package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (id="gender-male")
	WebElement genderrdobtn;

	@FindBy (id="FirstName")
	WebElement firstnametxt;

	@FindBy (id="LastName")
	WebElement lastnametxt;

	@FindBy (id="Email")
	WebElement emailtxt;

	@FindBy (id="Password")
	WebElement psswordtxt;

	@FindBy (id="ConfirmPassword")
	WebElement confirmpssword;

	@FindBy (id="register-button")
	WebElement registerbtn;
	
	@FindBy (css="div.result")
	public WebElement successmsg;
	
	@FindBy (linkText="Log out")
	WebElement logoutlink;
	
	@FindBy (linkText="My account")
	WebElement myaccountlink;

	public void userregistration(String firstname , String lastname , String email , String Password) {

		clickbutoon(genderrdobtn);
		setTextelement(firstnametxt, firstname);
		setTextelement(lastnametxt,lastname);
		setTextelement(emailtxt,email);
		setTextelement(psswordtxt, Password);
		setTextelement(confirmpssword, Password);
		clickbutoon(registerbtn);
	}
	public void userlogout ()
	{
		clickbutoon(logoutlink);
	}
	public void Openmyaccount()
	{
		clickbutoon(myaccountlink);
	}
}
