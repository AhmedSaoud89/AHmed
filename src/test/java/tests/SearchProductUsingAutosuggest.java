package tests;

import org.testng.annotations.Test;

import pages.ProductDetailesPage;
import pages.SearchPage;

public class SearchProductUsingAutosuggest extends TestBase{

	String productname = "Apple MacBook Pro 13-inch";
	SearchPage searchobj;
	ProductDetailesPage proobj;

	@Test
	public void usercansearchwithautosuggest() {
		
			searchobj = new SearchPage(driver);
			searchobj.productsearchusingautosuggest("MacB");
			proobj = new ProductDetailesPage(driver);
		}
	

}
