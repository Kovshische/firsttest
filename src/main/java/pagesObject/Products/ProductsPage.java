package pagesObject.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/13/2018.
 */
public class ProductsPage {

    public WebDriver driver;

    public ProductsPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // //div[@class='top-buffer']/div/a
    @FindBy(xpath = "//div[@class='top-buffer']/div/a")
    public WebElement createNewProductButton;

    // //form[@name='searchFilter']/input[@name='query']
    @FindBy(xpath = "//form[@name='searchFilter']/input[@name='query']")
    public WebElement searchField;

    // //form[@name='searchFilter']/input[@type='submit']
    @FindBy(xpath = "//form[@name='searchFilter']/input[@type='submit']")
    public WebElement searchButton;
}
