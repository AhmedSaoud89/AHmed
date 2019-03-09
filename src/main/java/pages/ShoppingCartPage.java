package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (name="removefromcart")
	WebElement removeCheck;

	@FindBy (name="updatecart")
	WebElement updatecartBTN;

	@FindBy (id="itemquantity33456")
	WebElement qntytxt;

	@FindBy (css="span.product-subtotal")
	WebElement totallbl;
	
	@FindBy (id="checkout")
	WebElement checkoutBTN;
	
	@FindBy (id="termsofservice")
	WebElement termsBtn;

	public void removeproductfromcart() 
	{
		clickbutoon(removeCheck);
		clickbutoon(updatecartBTN);
	}
	public void updateproductqtyincart(String Quantity )
	{
		ClearTXT(qntytxt);
		setTextelement(qntytxt, Quantity);
		clickbutoon(updatecartBTN);
	}
	public void opencheckoutpage()
	{
		clickbutoon(termsBtn);
		clickbutoon(checkoutBTN);
	}
	
	
}
