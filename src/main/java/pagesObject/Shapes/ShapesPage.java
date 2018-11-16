package pagesObject.Shapes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/15/2018.
 */
public class ShapesPage {
    public WebDriver driver;

    public ShapesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    // //i[@class='btn-add-new fa icon-medical-symbol-fill']
    @FindBy (xpath = "//i[@class='btn-add-new fa icon-medical-symbol-fill']")
    public WebElement addShapeButton;


}
