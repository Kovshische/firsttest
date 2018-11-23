package helpers.shapes;

import helpers.Environment;
import helpers.GeneralHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pagesObject.Shapes.CreateShapePopUp;
import pagesObject.Shapes.DeleteShapePopUp;
import pagesObject.Shapes.ShapesPage;

/**
 * Created by admin on 11/16/2018.
 */
public class ShapesPageHelper extends GeneralHelper implements Environment {

    private static final String SHAPES_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(GeneralHelper.DEFAULT_TEST_MANUFACTURER_ID).concat(SHAPES_PAGE);


    public WebDriver driver;
    public ShapesPage shapesPage;
    public CreateShapePopUp createShapePopUp;
    public DeleteShapePopUp deleteShapePopUp;

    public ShapesPageHelper(WebDriver driver) {
        super(driver);
        this.driver=driver;
        shapesPage = new ShapesPage(driver);
        createShapePopUp = new CreateShapePopUp(driver);
        deleteShapePopUp = new DeleteShapePopUp(driver);

    }

    public void clickCreateNewShapeButton(){
        click(shapesPage.addShapeButton);
    }
    public void goToTestShapesPage(){
        driver.get(SHAPES_PAGE_ADDRESS);
    }
    public void waitUntilPopupCreateBeVisible(){
        waitUntilElementPresent(createShapePopUp.shapeNameField);
    }


    // is shape present
    public void isTestShapePresent(){
        isElementPresent(shapesPage.autoTestShape);
    }
    public void isTestShapeModifiedPresent(){
        isElementPresent(shapesPage.autoTestModifiedShape);
    }
    public void isShapePresent(String shapeName){
        final String myShapeName = shapeName;
          driver.findElement(By.xpath("//li[@title='" + myShapeName + "']//i[@class='glyphicons icon-circle-delete']")).click();
    }

    public void isShapeNotPresent(String shapeName){
 //       Assert.assertFalse(driver.findElement(By.xpath("//li[@title='" + shapeName + "']//i[@class='glyphicons icon-circle-delete']")).isEnabled());
        Boolean elementPresent;
        try {
            driver.findElement(By.xpath("//li[@title='" + shapeName + "']//i[@class='glyphicons icon-circle-delete']"));
            elementPresent = true;
        } catch (NoSuchElementException e){
            elementPresent = false;
        }
        Assert.assertFalse(elementPresent);
    }



    // Alerts
    public void isAlertShapeWasSuccessfullyUpdated(){
        isElementPresent(shapesPage.alertShapeWasSuccessfullyUpdated);
    }
    public void isAlertShapeWasSuccessfullyCreated(){
        isElementPresent(shapesPage.alertShapeWasSuccessfullyCreated);
    }
    public void isAlertShapeWasSuccessfullyDeleted(){
        isElementPresent(shapesPage.alertShapeWasSuccessfullyDeleted);
    }


    //Waiters alerts
    public void waitUntilAlertPresent(){
        waitUntilElementPresent(shapesPage.alert);
    }

    // Waiters shapes
    public void waitUntilTestShapePresent(){
        waitUntilElementPresent(shapesPage.autoTestShape);
    }
    public void waitUntilTestModifiedShapePresent(){
        waitUntilElementPresent(shapesPage.autoTestModifiedShape);
    }
    public void waitUntilAllShapesDisplayed(){
        waitUntilElementPresent(shapesPage.shapesList);
    }



    public void clickAutoTestShape(){
        click(shapesPage.autoTestShape);
    }

    public void deleteShape(String shapeName){
        Actions action = new Actions(driver);
        action.moveToElement(shapesPage.autoTestModifiedShape);
        action.perform();
        driver.findElement(By.xpath("//li[@data-original-title='" + shapeName + "']//i[@class='glyphicons icon-circle-delete']")).click();
    }

    // Delete Shape Popup
    public void waitUntilConfirmationDeletePopupPresent(){
        waitUntilElementPresent(deleteShapePopUp.okButton);
    }
    public void clickOkInConfirmationPopup(){
        click(deleteShapePopUp.okButton);
    }

    //Create Shape Popup
    public void setShapeName (String shapeName){
        typeToElement(createShapePopUp.shapeNameField,shapeName);
    }
    public void loadImage (String imageURL){
        sendKeys(createShapePopUp.uploadImageButton, imageURL);
    }
    public void clickSaveChangesButton (){
        click(createShapePopUp.saveChangesButton);
    }
}
