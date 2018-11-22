package pagesObject.Shapes;

import helpers.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.Environment.AUTO_TEST_MODIFIED_SHAPE_NAME;

/**
 * Created by admin on 11/15/2018.
 */
public class ShapesPage implements Environment {
    public WebDriver driver;

    public static final String TEXT_IN_ALERT_SHAPE_CREATED = "Shape was successfully created";
    public static final String TEXT_IN_ALERT_SHAPE_UPDATED ="Shape was successfully updated";
    public static final String TEXT_IN_ALERT_SHAPE_DELETED = "1 Record(s) was successfully deleted";

    public ShapesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    // //i[@class='btn-add-new fa icon-medical-symbol-fill']
    @FindBy(xpath = "//i[@class='btn-add-new fa icon-medical-symbol-fill']")
    public WebElement addShapeButton;

    // //li[@data-original-title='AutoTestShape']
    @FindBy(xpath = "//li[@title='" + AUTO_TEST_SHAPE_NAME + "']")
    public WebElement autoTestShape;

    @FindBy(xpath = "//li[@title='" + AUTO_TEST_MODIFIED_SHAPE_NAME + "']")
    public WebElement autoTestModifiedShape;

    // //li[@title='AutoTestModifiedShape']//i[@class='glyphicons icon-circle-delete']
    @FindBy(xpath = "//li[@title='" + AUTO_TEST_MODIFIED_SHAPE_NAME + "']//i[@class='glyphicons icon-circle-delete']")
    public WebElement deleteModifiedShapeButton;

    // //div[@id='save-sortable']
    @FindBy(xpath = "//div[@id='save-sortable']")
    public WebElement saveSortableButton;

    // //*[contains(text(),'Shape was successfully created')]
    // example: //*[contains(text(), 'My Button')]"
    @FindBy(xpath = "//*[contains(text(),'" + TEXT_IN_ALERT_SHAPE_CREATED + "')]")
    public WebElement alertShapeWasSuccessfullyCreated;

    @FindBy(xpath = "//*[contains(text(),'" + TEXT_IN_ALERT_SHAPE_UPDATED + "')]")
    public WebElement alertShapeWasSuccessfullyUpdated;

    @FindBy(xpath = "//*[contains(text(),'" +TEXT_IN_ALERT_SHAPE_DELETED + "')]")
    public WebElement alertShapeWasSuccessfullyDeleted;

    // //div[@class='flash-messages-container']
    @FindBy(xpath = "//div[@class='flash-messages-container']")
    public WebElement alert;

    // //ul[@class='row gallery list-unstyled']
    @FindBy (xpath = "//ul[@class='row gallery list-unstyled']")
    public WebElement shapesList;
}