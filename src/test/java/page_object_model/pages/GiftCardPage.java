package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage extends BasePage{
    public GiftCardPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Amazon Gift Cards']")
    public WebElement amazonGiftCards;

    public AmazonGiftCards selectAmazonGiftCards(){
        amazonGiftCards.click();
        return PageFactory.initElements(driver, AmazonGiftCards.class);
    }
}
