package page_object_model.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@data-action-type='DISMISS']")
    public WebElement dismissWarning;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement selectDropDown;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement button;

    @FindBy(xpath = "//span[text()='Home Decor']")
    public WebElement homeDecor;

    @FindBy(xpath = "//a[text()='Gift Cards']")
    public WebElement giftCards;

    @FindBy(xpath = "//div[@id='nav-cart-text-container']")
    public WebElement cart;

    String visibleText = "";

    public void clickDismiss(){
        try {
            // Wait until the dismissWarning element is visible and clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
            WebElement dismissElement = wait.until(ExpectedConditions.elementToBeClickable(dismissWarning));

            // If element is found and clickable, perform the click
            dismissElement.click();
        } catch (Exception e) {
            System.out.println("Dismiss warning element not found or not clickable: " + e.getMessage());
        }
    }

    public void typeTextToSearchBox(String searchText){
        searchBox.sendKeys(searchText);
    }
    public void selectItem(String visibleText){
        this.visibleText = visibleText;
        new Select(selectDropDown).selectByVisibleText(visibleText);
    }

    public <T> T clickButton(){
        button.click();
        if(visibleText.equals("Computers")){
            return (T) PageFactory.initElements(driver, ComputersPage.class);
        } else if (visibleText.equals("Arts & Crafts")) {
            return (T) PageFactory.initElements(driver, ArtsCraftsPage.class);
        } else if (visibleText.equals("Women's Fashion")) {
            return (T) PageFactory.initElements(driver, FashionPage.class);
        } else{
            return null;
        }
    }

    public HomeDecorPage selectHomeDecor(){
        homeDecor.click();
        return PageFactory.initElements(driver, HomeDecorPage.class);
    }

    public GiftCardPage selectGiftCard(){
        giftCards.click();
        return PageFactory.initElements(driver, GiftCardPage.class);
    }

    public CartPage selectCart(){
        cart.click();
        return PageFactory.initElements(driver, CartPage.class);
    }

}
