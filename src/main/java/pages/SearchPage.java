package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (id="small-searchterms")
	WebElement searchtxtbox;

	@FindBy (css="input.button-1.search-box-button")
	WebElement searchbtn;

	@FindBy (id="ui-id-1")
	List<WebElement> productlist;

	public void Producsearch(String productname)

	{
		setTextelement(searchtxtbox, productname);
		clickbutoon(searchbtn);
	}
	public void productsearchusingautosuggest(String searchtxt) 
	{

		setTextelement(searchtxtbox, searchtxt);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		productlist.get(0).click();
		
	}

}
