package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperities;
import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTandproperities extends TestBase {

	HomePage homeobj ;
	UserRegistrationPage registerobj;
	Loginpage loginobj;
	String fn = LoadProperities.userdata.getProperty("firstname");
	String ln = LoadProperities.userdata.getProperty("Lastname");
	String mil = LoadProperities.userdata.getProperty("email");
	String psswrd = LoadProperities.userdata.getProperty("password");




	@Test(priority=1,alwaysRun=true)
	public void usercanregistersuccefully()
	{
		homeobj = new HomePage(driver);
		homeobj.openregistrationpage();

		registerobj = new UserRegistrationPage(driver);
		registerobj.userregistration(fn,ln,mil,psswrd);
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
		loginobj.userlogin(mil,psswrd);
	}
}
