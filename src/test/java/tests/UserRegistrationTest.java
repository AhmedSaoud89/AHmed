package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {

	HomePage homeobj ;
	UserRegistrationPage registerobj;
	Loginpage loginobj;

	@Test(priority=1,alwaysRun=true)
	public void usercanregistersuccefully()
	{
		homeobj = new HomePage(driver);
		homeobj.openregistrationpage();

		registerobj = new UserRegistrationPage(driver);
		registerobj.userregistration("Ahmed", "Saoud", "ahmedsaoud79781@yahoo.com", "12345678");
		Assert.assertTrue(registerobj.successmsg.getText().contains("Your registration completed"));
	}
	
	@Test(dependsOnMethods={"usercanregistersuccefully"})
	public void registeredusercanlogout()
	{
		registerobj.userlogout();
	}
	
	@Test(dependsOnMethods= {"registeredusercanlogout"})
	public void registereduserlogin()
	{
		homeobj.openloginpage();
		loginobj = new Loginpage(driver);
		loginobj.userlogin("ahmedsaoud79781@yahoo.com", "12345678");
	}
}
