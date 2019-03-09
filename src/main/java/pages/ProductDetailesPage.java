package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailesPage extends PageBase{

	public ProductDetailesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Apple MacBook Pro 13-inch")
	public WebElement productnamebreadcrump;
	
	@FindBy (css="span.price-value-4")
	public WebElement price;
	
	@FindBy(id="add-to-wishlist-button-4")
	WebElement addtowishlistbtn;
	
	@FindBy (css ="input.button-2.add-to-compare-list-button valid")
	WebElement addtocopmarebtn;
	
	@FindBy (id="add-to-cart-button-4")
	WebElement addtocartbtn;
	
	public void addproducttowishlist()
	{
		clickbutoon(addtowishlistbtn);
	}
	public void addproducttocompare()
	{
		
		clickbutoon(addtocopmarebtn);
	}
	public void addtocart()
	{
		clickbutoon(addtocartbtn);
	}
}
