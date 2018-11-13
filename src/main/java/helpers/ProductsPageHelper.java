package helpers;

import org.openqa.selenium.WebDriver;
import pagesObject.LoginPage;
import pagesObject.ProductsPage;

/**
 * Created by admin on 11/13/2018.
 */
public class ProductsPageHelper extends GeneralHelper {

    private static final String PRODUCTS_PAGE = "/Products";
    private static final String PRODUCTS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(GeneralHelper.MANUFACTURER).concat(PRODUCTS_PAGE);

    public WebDriver driver;
    private ProductsPage productsPage;

    public ProductsPageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        productsPage = new ProductsPage(driver);
    }

    public void goToProductsPage (){
        driver.get(PRODUCTS_PAGE_ADDRESS);
    }

    public void clickCreateNewProductButton(){
        click(productsPage.createNewProductButton);
    }
}
