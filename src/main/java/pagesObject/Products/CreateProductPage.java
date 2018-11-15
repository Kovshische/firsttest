package pagesObject.Products;

import helpers.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/15/2018.
 */
public class CreateProductPage implements Environment {

    public WebDriver driver;

    public CreateProductPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    ////div[@class='col-md-11']/input[@name='name']
    @FindBy(xpath = "//div[@class='col-md-11']/input[@name='name']")
    public WebElement nameField;

    // //div[@class='col-md-8']/div[@class='chosen-container chosen-container-single']
    @FindBy(xpath = "//div[@class='col-md-8']/div[@class='chosen-container chosen-container-single']")
    public WebElement shapeDropdownList;

    // //div[@class='col-md-8']//div[@class='chosen-search']
    @FindBy(xpath = "//div[@class='col-md-8']//div[@class='chosen-search']/input")
    public WebElement shapeSearchField;

    //Test Shape
    // //div[@class='col-md-8']/select[@class='form-control chosen-select']/option[@value='1534']
    @FindBy(xpath = "//div[@class='col-md-8']/select[@class='form-control chosen-select']/option[@value='" + SHAPE_ID + "']")
    public WebElement shapeTest;


}
