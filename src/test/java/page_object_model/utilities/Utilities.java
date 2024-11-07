package page_object_model.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Utilities {
    protected WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
