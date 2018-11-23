package pagesObject.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/23/2018.
 */
public class CompanyPage {

    public WebDriver driver;

    public CompanyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//i[@class='btn-add-new fa icon-medical-symbol-fill']")
    public WebElement addCompanyButton;
}
