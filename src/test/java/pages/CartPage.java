package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CartPage {

    private AndroidDriver driver;

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By cartTitle = By.xpath("//android.widget.TextView[@text='My Cart']");
    private By checkoutButton = By.id("com.saucelabs.mydemoapp.android:id/cartBt");

    public boolean isCartPageDisplayed() {
        return driver.findElement(cartTitle).isDisplayed();
    }

    public void tapCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
