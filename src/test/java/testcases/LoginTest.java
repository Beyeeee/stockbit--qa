package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLoginSuccessfully() {

        // Arrange
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        // Act
        loginPage.login("bod@example.com", "10203040");

        // Assert
        Assert.assertTrue(
                productPage.isProductsPageDisplayed(),
                "Login failed: Products page is not displayed"
        );
    }
}
