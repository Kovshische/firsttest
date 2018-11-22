package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.Environment;
import helpers.products.ProductsPageHelper;
import helpers.shapes.ShapesPageHelper;
import org.openqa.selenium.WebDriver;
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
        LoginTest.login(driver);
    }


    @Test
    public void addNewShape() throws MalformedURLException, InterruptedException {
//        LoginTest.login(driver);
        shapesPageHelper.goToTestShapesPage();
        shapesPageHelper.clickCreateNewShapeButton();
        shapesPageHelper.waitUntilPopupCreateBeVisible();
        shapesPageHelper.setShapeName(AUTO_TEST_SHAPE_NAME);
        shapesPageHelper.loadImage(IMAGE_URL);
        shapesPageHelper.clickSaveChangesButton();
        shapesPageHelper.waitUntilAlertPresent();
        shapesPageHelper.isAlertShapeWasSuccessfullyCreated();
        shapesPageHelper.waitUntilTestShapePresent();
        shapesPageHelper.isTestShapePresent();
    }

    @Test (dependsOnMethods = {"addNewShape"})
    public void editShape() throws MalformedURLException {
//        LoginTest.login(driver);
        shapesPageHelper.goToTestShapesPage();
        shapesPageHelper.waitUntilTestShapePresent();
        shapesPageHelper.clickAutoTestShape();
        shapesPageHelper.waitUntilPopupCreateBeVisible();
        shapesPageHelper.setShapeName(AUTO_TEST_MODIFIED_SHAPE_NAME);
        shapesPageHelper.clickSaveChangesButton();
        shapesPageHelper.waitUntilAlertPresent();
        shapesPageHelper.isAlertShapeWasSuccessfullyUpdated();
        shapesPageHelper.waitUntilTestModifiedShapePresent();
        shapesPageHelper.isTestShapeModifiedPresent();
    }

    @Test (dependsOnMethods = {"editShape"})
    public void deleteShape () throws MalformedURLException {
//        LoginTest.login(driver);
        shapesPageHelper.goToTestShapesPage();
        shapesPageHelper.waitUntilTestModifiedShapePresent();
        shapesPageHelper.deleteShape(AUTO_TEST_MODIFIED_SHAPE_NAME);
        shapesPageHelper.waitUntilConfirmationDeletePopupPresent();
        shapesPageHelper.clickOkInConfirmationPopup();
        shapesPageHelper.waitUntilAlertPresent();
        shapesPageHelper.isAlertShapeWasSuccessfullyDeleted();
        shapesPageHelper.waitUntilAllShapesDisplayed();
        shapesPageHelper.isShapeNotPresent(AUTO_TEST_MODIFIED_SHAPE_NAME);

    }

    @AfterMethod
    public void closeChrome() {
        driver.quit();
    }

}
