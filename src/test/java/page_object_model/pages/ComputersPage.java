package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage{
    public ComputersPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[text()='ASUS']")
    public WebElement checkBoxAsus;

    @FindBy(xpath = "//span[text()='All Discounts']")
    public WebElement linkToAllDiscounts;

    public void selectAsusCheckBox(){
        checkBoxAsus.click();
    }

    public void selectAllDiscounts(){
        linkToAllDiscounts.click();
    }
}
