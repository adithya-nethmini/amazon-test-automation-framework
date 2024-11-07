package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FashionPage extends BasePage {
    public FashionPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Top Brands']")
    public WebElement topBrands;

    public void checkTopBrands(){
        topBrands.click();
    }
}
