package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

   
	@FindBy(xpath = "//div[@class='productinfo text-center']/p")
    WebElement productResult;
	
    public SearchResultsPage(WebDriver driver) {
        super(driver);  
    }

    public boolean isProductDisplayed(String productName) {
        return productResult.getText().toLowerCase().contains(productName.toLowerCase());
    }
}
