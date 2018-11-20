package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.Environment;
import helpers.products.CreateProductPageHelper;
import helpers.products.ProductsPageHelper;
import helpers.shapes.ShapesPageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by admin on 11/16/2018.
 */
public class ShapeTest implements Environment {
    public static WebDriver driver;
    public static ShapesPageHelper shapesPageHelper;
    public static ProductsPageHelper productsPageHelper;


    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();
        shapesPageHelper = new ShapesPageHelper(driver);
        productsPageHelper = new ProductsPageHelper(driver);
    }


    @Test
    public void addNewProduct() throws MalformedURLException, InterruptedException {
        LoginTest.login(driver);
        shapesPageHelper.goToTestShapesPage();
        shapesPageHelper.clickCreateNewShapeButton();
        shapesPageHelper.waitUntilPopupCreateBeVisible();
        shapesPageHelper.setShapeName(TEST_SHAPE_NAME);
        shapesPageHelper.loadImage(IMAGE_URL);
        shapesPageHelper.clickSaveChangesButton();
        shapesPageHelper.isTestShapePresent();

    }

    @AfterMethod
    public void closeChrome() {
        driver.quit();
    }

}
