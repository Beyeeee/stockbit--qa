package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage {

    private AndroidDriver driver;

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By productTitle = By.xpath("//android.widget.TextView[@text='Products']");
    private By firstProduct = By.xpath("(//android.view.ViewGroup[@content-desc='store item'])[1]");

    public boolean isProductsPageDisplayed() {
        return driver.findElement(productTitle).isDisplayed();
    }

    public void selectFirstProduct() {
        driver.findElement(firstProduct).click();
    }
}
