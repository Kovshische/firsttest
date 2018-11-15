package helpers.products;

import helpers.Environment;
import helpers.GeneralHelper;
import org.openqa.selenium.WebDriver;
import pagesObject.Products.CreateProductPage;

/**
 * Created by admin on 11/15/2018.
 */
public class CreateProductPageHelper extends GeneralHelper implements Environment {

    private static final String NAME = "Auto Test Product";

    public WebDriver driver;
    private CreateProductPage createProductPage;

    public CreateProductPageHelper (WebDriver driver){
        super(driver);
        this.driver=driver;
        createProductPage = new CreateProductPage(driver);
    }

    public void setName (){
        typeToElement(createProductPage.nameField, NAME);
    }
    public void setShape(){
        click(createProductPage.shapeDropdownList);
        typeToElement(createProductPage.shapeSearchField, SHAPE_NAME);
    }
}
