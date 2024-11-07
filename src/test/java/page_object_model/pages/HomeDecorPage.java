package page_object_model.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomeDecorPage extends BasePage{
    public HomeDecorPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='p_36/range-slider_slider-item_upper-bound-slider']")
    public WebElement upperBoundSlider;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement goButton;

    @FindBy(xpath = "//li[@id='p_n_feature_twenty_browse-bin/3254102011']")
    public WebElement beigeColor;

    public void setUpperSliderValue(String value) {
        // Execute JavaScript to set the value directly
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + value + "';", upperBoundSlider);

        // Trigger the change event manually after setting the value
        js.executeScript("arguments[0].dispatchEvent(new Event('change'));", upperBoundSlider);
    }

    public void clickGoButton(){
        goButton.click();
    }

    public void selectBeigeColor(){
        beigeColor.click();
    }
}
