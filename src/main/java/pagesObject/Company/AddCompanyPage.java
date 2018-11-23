package pagesObject.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 11/22/2018.
 */
public class AddCompanyPage {

    public static final String TEXT_IN_NAME_REQUIRED = "The company name field is required.";

    public WebDriver driver;

    public AddCompanyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // input text fields
    @FindBy(xpath = "//input[@name='company_name']")
    public WebElement companyTextField;


    // buttons
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement saveChangesButton;
    @FindBy(xpath = "//input[@id='companyLogoInput']")
    public WebElement uploadCompanyLogoButton;



    // Alerts
    @FindBy(xpath = "//li[@class='error']")
    public WebElement alert;



}
