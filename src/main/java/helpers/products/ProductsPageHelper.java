package helpers.products;

import helpers.Environment;
import helpers.GeneralHelper;
import org.openqa.selenium.WebDriver;
import pagesObject.Products.ProductsPage;

/**
 * Created by admin on 11/13/2018.
 */
public class ProductsPageHelper extends GeneralHelper implements Environment{


    private static final String PRODUCTS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(GeneralHelper.TEST_MANUFACTURER_ID).concat(PRODUCTS_PAGE);

    public WebDriver driver;
    private ProductsPage productsPage;

    public ProductsPageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        productsPage = new ProductsPage(driver);
    }


    public void goToProductsPage (){
        driver.get(PRODUCTS_PAGE_ADDRESS);
//        driver.get("http://ec2-34-235-10-165.compute-1.amazonaws.com/10051/Products");

    }

    public void clickCreateNewProductButton(){
        click(productsPage.createNewProductButton);
    }
}
