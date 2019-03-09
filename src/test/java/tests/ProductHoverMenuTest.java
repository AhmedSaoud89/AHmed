package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class ProductHoverMenuTest extends TestBase {
	HomePage homeobj;
	
	@Test
	public void UserCanSelectByHoover ()
	{
		homeobj = new HomePage(driver);
		homeobj.SelectNoteBooksMenu();
	}

}
