package helpers.companies;

import helpers.GeneralHelper;
import org.openqa.selenium.WebDriver;
import pagesObject.Company.CompanyPage;

/**
 * Created by admin on 11/23/2018.
 */
public class CompanyHelper extends GeneralHelper {

    public static final String CONTRACTORS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(CONTRACTORS_PAGE);
    public static final String DISTRIBUTORS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(DISTRIBUTOR_PAGE);
    public static final String MANUFACTURERS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(MANUFACTURER_PAGE);

    public WebDriver driver;
    public CompanyPage companyPage;

    public CompanyHelper(WebDriver driver) {
        super(driver);
        this.driver=driver;
        companyPage = new CompanyPage(driver);
    }

    public void goToPage (String companyPageAddress) {
        driver.get(companyPageAddress);

    }

    public void clickAddNewCompany(){
        click(companyPage.addCompanyButton);
    }
}
