package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase {

	HomePage homeobj ;
	UserRegistrationPage registerobj;
	MyAccountPage myaccountobj;
	Loginpage loginobj;

	String oldpassword = "12345678";
	String newpassword = "654321";
	String firstname = "Ahmed";
	String lastname = "Saoud";
	String email = "ahmedsaoud3331@yahoo.com";
	

	@Test(priority=1,alwaysRun=true)
	public void usercanregistersuccefully()
	{
		homeobj = new HomePage(driver);
		homeobj.openregistrationpage();

		registerobj = new UserRegistrationPage(driver);
		registerobj.userregistration(firstname, lastname, email, oldpassword);
		Assert.assertTrue(registerobj.successmsg.getText().contains("Your registration completed"));
	}
	@Test(priority=2)
	public void registeredusercanchangepassword()
	{
		myaccountobj = new MyAccountPage(driver);
		registerobj.Openmyaccount();
		myaccountobj.openpasswordchangelink();
		myaccountobj.changepassword(oldpassword, newpassword);

	}
	@Test(priority=3)
	public void registeredusercanlogout()
	{
		registerobj.userlogout();
	}
	
	@Test(priority=4)
	public void registereduserlogin()
	{
		homeobj.openloginpage();
		loginobj = new Loginpage(driver);
		loginobj.userlogin(email, newpassword);
	}

}
