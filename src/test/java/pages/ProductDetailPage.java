package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductDetailPage {

    private AndroidDriver driver;

    public ProductDetailPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.id("com.saucelabs.mydemoapp.android:id/cartBt");

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}
