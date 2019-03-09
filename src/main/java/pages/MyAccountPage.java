package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (linkText="Change password")
	WebElement changepassword;
	
	@FindBy (id="OldPassword")
	WebElement oldpasswordtxt;
	
	@FindBy (id="NewPassword")
	WebElement newpasswordtxt;
	
	@FindBy (id="ConfirmNewPassword")
	WebElement confirmasswordtxt;
	
	@FindBy (css="input.button-1.change-password-button")
	WebElement changepasswordbtn;
	
	@FindBy (css="div.result")
	public WebElement resultlbl;
	
	public void openpasswordchangelink() {
		clickbutoon(changepassword);
	}
	public void changepassword(String oldpassword , String newpassword)
	{
		setTextelement(oldpasswordtxt, oldpassword);
		setTextelement(newpasswordtxt, newpassword);
		setTextelement(confirmasswordtxt, newpassword);
		clickbutoon(changepasswordbtn);
	}

}
