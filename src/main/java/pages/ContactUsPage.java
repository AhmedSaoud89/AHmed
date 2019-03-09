package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="FullName")
	WebElement fullnametxt;
	
	@FindBy (id="Email")
	WebElement emailtxt;
	
	@FindBy (id="Enquiry")
	WebElement enquirytxt;
	
	@FindBy (name ="send-email")
	WebElement submitbtn;
	
	@FindBy (css ="div.result")
	public static WebElement resultmessage;
	
	public void contactus (String fullname , String Email , String Message)
	{
		setTextelement(fullnametxt, fullname);
		setTextelement(emailtxt, Email);
		setTextelement(enquirytxt, Message);
		clickbutoon(submitbtn);
		
	}
	
}
