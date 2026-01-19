package testcases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void userCanCheckoutProduct() {

        CartPage cartPage = new CartPage(driver);

        cartPage.tapCheckout();

    }
}
