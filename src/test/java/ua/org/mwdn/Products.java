package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.LoginPageHelper;
import helpers.ProductsPageHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesObject.ProductsPage;

import java.net.MalformedURLException;

/**
 * Created by admin on 11/13/2018.
 */
public class Products {


    public static WebDriver driver;

    public static ProductsPageHelper productsPageHelper;
//    public static LoginPageHelper loginPageHelper;
//    public static ExampleTest exampleTest;

    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();
        productsPageHelper = new ProductsPageHelper(driver);
//        loginPageHelper = new LoginPageHelper(driver);
//        exampleTest = new ExampleTest(driver);
    }

    @Test
    public void addNewProduct() throws MalformedURLException {

        ExampleTest.login(driver);
        productsPageHelper.goToProductsPage();
        productsPageHelper.clickCreateNewProductButton();
    }

    @AfterMethod
    public void closeChrome() {
        driver.quit();
    }

}
