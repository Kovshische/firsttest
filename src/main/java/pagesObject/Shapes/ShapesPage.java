package pagesObject.Shapes;

import helpers.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.Environment.TEST_SHAPE_NAME;

/**
 * Created by admin on 11/15/2018.
 */
public class ShapesPage implements Environment {
    public WebDriver driver;

    public ShapesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



    // //i[@class='btn-add-new fa icon-medical-symbol-fill']
    @FindBy (xpath = "//i[@class='btn-add-new fa icon-medical-symbol-fill']")
    public WebElement addShapeButton;

    // //li[@data-original-title='AutoTestShape']
    @FindBy (xpath = "//li[@data-original-title='"+ TEST_SHAPE_NAME + "']")
    public WebElement testShape;

}
