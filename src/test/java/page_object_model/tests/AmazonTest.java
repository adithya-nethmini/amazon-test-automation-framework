package page_object_model.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_object_model.pages.*;
import page_object_model.utilities.Utilities;

import java.time.Duration;

public class AmazonTest extends Utilities {
    @Test
    public void searchComputers() throws InterruptedException {
        BasePage basePage = new BasePage(driver);
        HomePage homePage = basePage.loadUrl("https://www.amazon.com");
        homePage.typeTextToSearchBox("Laptops");
        homePage.selectItem("Computers");
        ComputersPage computersPage = homePage.clickButton();
        computersPage.selectAsusCheckBox();
        computersPage.selectAllDiscounts();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    @Test
    public void exploreHomeDecor() throws InterruptedException {
        BasePage basePage = new BasePage(driver);
        HomePage homePage = basePage.loadUrl("https://www.amazon.com");
        homePage.scrollPage(0, 200);
        HomeDecorPage homeDecorPage = homePage.selectHomeDecor();
        homeDecorPage.scrollPage(0, 400);
        homeDecorPage.selectBeigeColor();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void exploreGiftCards() throws InterruptedException {
        BasePage basePage = new BasePage(driver);
        HomePage homePage = basePage.loadUrl("https://www.amazon.com");
//        Thread.sleep(3000);
//        driver.navigate().refresh();
        homePage.clickDismiss();
        GiftCardPage giftCardPage = homePage.selectGiftCard();
        giftCardPage.scrollPage(0, 300);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    @Test
    public void searchFashion(){
        BasePage basePage = new BasePage(driver);
        HomePage homePage = basePage.loadUrl("https://www.amazon.com");
        homePage.selectItem("Women's Fashion");
        homePage.typeTextToSearchBox("frocks");
        FashionPage fashionPage = homePage.clickButton();
        fashionPage.checkTopBrands();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void searchArtsCrafts() throws InterruptedException {
        BasePage basePage = new BasePage(driver);
        HomePage homePage = basePage.loadUrl("https://www.amazon.com");
        homePage.typeTextToSearchBox("gift wrapping papers");
        homePage.selectItem("Arts & Crafts");
        ArtsCraftsPage artsCraftsPage = homePage.clickButton();
        artsCraftsPage.scrollPage(0, 200);
        artsCraftsPage.selectAddToCart();
        Thread.sleep(10000);
        CartPage cartPage = homePage.selectCart();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }
}
