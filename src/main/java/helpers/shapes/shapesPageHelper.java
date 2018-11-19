package helpers.shapes;

import helpers.Environment;
import helpers.GeneralHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesObject.Shapes.CreateShapePopUp;
import pagesObject.Shapes.ShapesPage;

/**
 * Created by admin on 11/16/2018.
 */
public class ShapesPageHelper extends GeneralHelper implements Environment {

    private static final String SHAPES_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(GeneralHelper.TEST_MANUFACTURER_ID).concat(SHAPES_PAGE);


    public WebDriver driver;
    public ShapesPage shapesPage;
    public CreateShapePopUp createShapePopUp;

    public ShapesPageHelper(WebDriver driver) {
        super(driver);
        this.driver=driver;
        shapesPage = new ShapesPage(driver);
        createShapePopUp = new CreateShapePopUp(driver);
    }

    public void clickCreateNewShapeButton(){
        click(shapesPage.addShapeButton);
    }

    public void setShapeName (String shapeName){
        typeToElement(createShapePopUp.shapeNameField,shapeName);
    }

   public void loadImage (String imageURL){
       sendKeys(createShapePopUp.uploadImageButton, imageURL);
   }

    public void goToTestShapesPage(){
        driver.get(SHAPES_PAGE_ADDRESS);
    }

    public void waitUntilPopupCreateBeVisible(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(createShapePopUp.shapeNameField));
    }
}
