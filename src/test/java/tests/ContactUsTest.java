package tests;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{
	HomePage home;
	ContactUsPage contactus;
	
	String fullname = "Ahmed";
	String email = "ahmedtest13@test.com";
	String enquiry = "1234kdkvd";
	
	@Test
	public void UserCanUseContactUs()
	{
		home = new HomePage(driver);
		home.opencontactuspage();
		contactus = new ContactUsPage(driver);
		contactus.contactus(fullname, email, enquiry);
	
	}
	
	


}
