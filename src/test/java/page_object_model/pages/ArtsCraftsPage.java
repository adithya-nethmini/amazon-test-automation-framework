package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArtsCraftsPage extends BasePage{
    public ArtsCraftsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]")
    public WebElement firstItem;

    @FindBy(xpath = "//button[@id='a-autoid-1-announce']")
    public WebElement addToCartButton;

    public void selectAddToCart(){
        addToCartButton.click();
    }
}
