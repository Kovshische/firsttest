package pagesObject.Shapes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/21/2018.
 */
public class DeleteShapePopUp {
    public WebDriver driver;

    public DeleteShapePopUp(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    // //button[@class='btn btn-primary']
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButton;
}
