package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailesPage;
import pages.SearchPage;

public class SearchproductTest extends TestBase{

	String productname = "Apple MacBook Pro 13-inch";
	SearchPage searchobj;
	ProductDetailesPage proobj;

	@Test
	public void usercanserch()
	{
		searchobj = new SearchPage(driver);
		proobj = new ProductDetailesPage(driver);
		searchobj.Producsearch(productname);
		Assert.assertTrue(proobj.productnamebreadcrump.getText().equalsIgnoreCase(productname));
	}

}
