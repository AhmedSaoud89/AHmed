package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.HomePage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTestDDTwithCSV extends TestBase {

	HomePage homeobj ;
	UserRegistrationPage registerobj;
	Loginpage loginobj;

	CSVReader reader;

	@Test(priority=1,alwaysRun=true)
	public void usercanregistersuccefully() throws IOException
	{
		String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/userdata.csv";

		reader = new CSVReader(new FileReader(CSV_file));
		
		String[] csvcell;
		
		while ((csvcell = reader.readNext()) !=null)
		{
			String firstname = csvcell[0];
			String secondname = csvcell[1];
			String email = csvcell[2];
			String password = csvcell[3];
			

			homeobj = new HomePage(driver);
			homeobj.openregistrationpage();

			registerobj = new UserRegistrationPage(driver);
			registerobj.userregistration(firstname,secondname,email,password);
			Assert.assertTrue(registerobj.successmsg.getText().contains("Your registration completed"));
			registerobj.userlogout();
			homeobj.openloginpage();
			loginobj = new Loginpage(driver);
			loginobj.userlogin(email,password);
			registerobj.userlogout();

		}
		
	}


}
