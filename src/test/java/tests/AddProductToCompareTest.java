package tests;

import org.testng.annotations.Test;

import pages.ComparePage;
import pages.HomePage;
import pages.ProductDetailesPage;
import pages.SearchPage;

public class AddProductToCompareTest extends TestBase{
	
	String firstProductname = "Apple MacBook Pro 13-inch";
	String secondProductname = "Asus N551JK-XO076H Laptop";
	
	// Search for product no:1
	// Search for product no:2
	// Add to compare list
	// Clear compare list
	
	HomePage homeopb;
	ProductDetailesPage productobj;
	SearchPage searchobj;
	ComparePage compareobj;
	
	@Test(priority=1)
	public void Usercancompare ()
	{
		productobj = new ProductDetailesPage(driver);
		searchobj = new SearchPage(driver);
		compareobj = new ComparePage(driver);
		
		searchobj.productsearchusingautosuggest("MacB");
		productobj.addproducttocompare();
		

		searchobj.productsearchusingautosuggest("Asus");
		productobj.addproducttocompare();
		
		driver.navigate().to("http://demo.nopcommerce.com" + "/compareproducts");
		compareobj.compareproducts();
	}
	@Test (priority=2)
	public void UserCancomparelist() {
		compareobj.clearcomparelist();
	}

}
