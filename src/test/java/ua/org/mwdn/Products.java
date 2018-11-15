package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.products.CreateProductPageHelper;
import helpers.products.ProductsPageHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by admin on 11/13/2018.
 */
public class Products {


    public static WebDriver driver;

    public static ProductsPageHelper productsPageHelper;
    public static CreateProductPageHelper createProductPageHelper;

    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();
        productsPageHelper = new ProductsPageHelper(driver);
        createProductPageHelper = new CreateProductPageHelper(driver);

    }

    @Test
    public void addNewProduct() throws MalformedURLException {
        LoginTest.login(driver);
        productsPageHelper.goToProductsPage();
        productsPageHelper.clickCreateNewProductButton();
        createProductPageHelper.setName();
        createProductPageHelper.setShape();
    }

    @AfterMethod
    public void closeChrome() {
        driver.quit();
    }

}
