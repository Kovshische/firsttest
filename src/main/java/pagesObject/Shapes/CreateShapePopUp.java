package pagesObject.Shapes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/16/2018.
 */
public class CreateShapePopUp {
    public WebDriver driver;

    public CreateShapePopUp(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    // //input[@name='shape_name']
    // "//div[@class='col-md-8']"
    // //div[@class='col-md-12 form-elements-field']//div[@class='col-md-8']//input[@name='shape_name']
    @FindBy(xpath = "//div[@class='col-md-12 form-elements-field']//div[@class='col-md-8']//input[@name='shape_name']")
    public WebElement shapeNameField;

    // //div[@class='image-rectangular']
    @FindBy(xpath = "//div[@class='image-rectangular']")
    public WebElement uploadImageButton;

    // //input[@class='btn btn-primary']
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement saveChangesButton;
}
