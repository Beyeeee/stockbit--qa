package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.ProductDetailPage;
import pages.CartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void userCanAddProductToCart() {

        ProductPage productPage = new ProductPage(driver);
        ProductDetailPage detailPage = new ProductDetailPage(driver);
        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(productPage.isProductsPageDisplayed());

        productPage.selectFirstProduct();
        detailPage.addToCart();

        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }
}
