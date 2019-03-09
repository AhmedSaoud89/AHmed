package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTestUsingExcel extends TestBase {

	HomePage homeobj ;
	UserRegistrationPage registerobj;
	Loginpage loginobj;
	
	@DataProvider(name="ExcelData")
	public Object [][] UserRegiterData () throws IOException
	{
		ExcelReader ex = new ExcelReader();
	
			return ex.getExcelData();
	}

	@Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
	public void usercanregistersuccefully(String firstname , String lastname , String email , String password)
	{
		homeobj = new HomePage(driver);
		homeobj.openregistrationpage();

		registerobj = new UserRegistrationPage(driver);
		registerobj.userregistration(firstname,lastname,email,password);
		Assert.assertTrue(registerobj.successmsg.getText().contains("Your registration completed"));
		registerobj.userlogout();

		homeobj.openloginpage();
		loginobj = new Loginpage(driver);
		loginobj.userlogin(email, password);
		registerobj.userlogout();

	}
	
}
