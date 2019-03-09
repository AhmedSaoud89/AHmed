package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends PageBase{

	public ComparePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (css="a.clear-list")
	WebElement ClearListLink;
	
	@FindBy (css="table.compare-products-table")
	WebElement CompreTable;
	
	@FindBy (css="div.no-data")
	WebElement NoDataTable;
	
	@FindBy (tagName="td")
	public List<WebElement> allcol;
	
	@FindBy (tagName="tr")
	public List<WebElement> allrows;
	
	public void clearcomparelist()
	{
		clickbutoon(ClearListLink);
	}
	public void compareproducts()
	{
		// get All Rows
		System.out.println(allrows.size());
		
		// get all data from every row
		for (WebElement row : allrows)
		{
			System.out.println(row.getText() + "\t");
			for (WebElement col : allcol)
			{
				System.out.println(col.getText() + "\t");
			}
		}
	}
}
