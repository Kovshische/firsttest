package ua.org.mwdn.manufacturers;

import configuration.WebDriverFactory;
import helpers.Environment;
import helpers.companies.AddCompanyHelper;
import helpers.companies.CompanyHelper;
import org.openqa.selenium.WebDriver;
import ua.org.mwdn.BaseTest;

import java.net.MalformedURLException;

/**
 * Created by admin on 11/23/2018.
 */
public class CompanyTest extends BaseTest implements Environment {

    public static final String CONTRACTORS = "contractors";
    public static final String DISTRIBUTORS = "distributors";
    public static final String MANUFACTURERS = "manufacturers";


    //    private WebDriver driver;
    protected CompanyHelper companyHelper;
    protected AddCompanyHelper addCompanyHelper;


//    companyHelper = new CompanyHelper(driver)
/*
    private void setWebDriver() throws MalformedURLException {
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();
        companyHelper = new CompanyHelper(driver);
        addCompanyHelper = new AddCompanyHelper(driver);
    }
*/

    public void addCompany(String companyType) {
        goToCompanyPage(companyType);
        companyHelper.clickAddNewCompany();
        setCompanyName(companyType);
        addCompanyHelper.uploadCompanyLogo(IMAGE_URL);
        addCompanyHelper.clickSaveChangesButton();
    }

    public void editCompany (String companyType){
        goToCompanyPage(companyType);
        setCompanyNameInSearchField(companyType);
    }


    //help methods
    private void goToCompanyPage(String companyType){
        switch (companyType) {
            case CONTRACTORS:
                companyHelper.goToPage(companyHelper.CONTRACTORS_PAGE_ADDRESS);
                break;
            case DISTRIBUTORS:
                companyHelper.goToPage(companyHelper.DISTRIBUTORS_PAGE_ADDRESS);
                break;
            case MANUFACTURERS:
                companyHelper.goToPage(companyHelper.MANUFACTURERS_PAGE_ADDRESS);
                break;
        }
    }

    private void setCompanyName(String companyType){
        switch (companyType) {
            case CONTRACTORS:
                addCompanyHelper.setCompanyName(CONTRACTOR_TEST_NAME);
                break;
            case DISTRIBUTORS:
                addCompanyHelper.setCompanyName(DISTRIBUTOR_TEST_NAME);
                break;
            case MANUFACTURERS:
                addCompanyHelper.setCompanyName(MANUFACTURER_TEST_NAME);
                break;
        }
    }


    private void setCompanyNameInSearchField(String companyType){
        switch (companyType) {
            case CONTRACTORS:
                companyHelper.setTextInSearchField(CONTRACTOR_TEST_NAME);
                break;
            case DISTRIBUTORS:
                companyHelper.setTextInSearchField(DISTRIBUTOR_TEST_NAME);
                break;
            case MANUFACTURERS:
                companyHelper.setTextInSearchField(MANUFACTURER_TEST_NAME);
                break;
        }
    }


}
