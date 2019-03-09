package tests;

import org.testng.annotations.Test;

import pages.ProductDetailesPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AddToShoppingCartTest extends TestBase{
	SearchPage search;
	ProductDetailesPage proobj;
	ShoppingCartPage shopcart;
	String productname = "Apple MacBook Pro 13-inch";

	@Test (priority=1)
	public void usercansearchforproductwithautosuggest()
	{
		search = new SearchPage(driver);
		search.productsearchusingautosuggest("MacB");

	}
	@Test (priority = 2)
	public void usercanaddproducttoshopcart() throws InterruptedException
	{
		proobj = new ProductDetailesPage(driver);
		proobj.addtocart();
		Thread.sleep(3000);
		driver.navigate().to("http://demo.nopcommerce.com" + "/cart");

	}
	@Test (priority = 3)
	public void usercanremove()
	{
		shopcart = new ShoppingCartPage(driver);
		shopcart.removeproductfromcart();
	}
}
