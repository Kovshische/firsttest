package helpers.companies;

import helpers.GeneralHelper;
import org.openqa.selenium.WebDriver;
import pagesObject.Company.AddCompanyPage;

/**
 * Created by admin on 11/22/2018.
 */
public class AddCompanyHelper extends GeneralHelper {

    private static final String ADD_CONTRACTORS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(ADD_CONTRACTORS_PAGE);
    private static final String ADD_DISTRIBUTORS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(ADD_DISTRIBUTOR_PAGE);
    private static final String ADD_MANUFACTURERS_PAGE_ADDRESS = GeneralHelper.DOMAIN.concat(ADD_MANUFACTURER_PAGE);

    public WebDriver driver;
    private AddCompanyPage addCompanyPage;

    public AddCompanyHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        addCompanyPage = new AddCompanyPage(driver);
    }

    // Pages
    public void goToAddContractorsPage () {
        driver.get(ADD_CONTRACTORS_PAGE_ADDRESS);
    }
    public void goToAddDistributorsPage () {
        driver.get(ADD_DISTRIBUTORS_PAGE_ADDRESS);
    }
    public void goToAddManufacturersPage () {
        driver.get(ADD_MANUFACTURERS_PAGE_ADDRESS);
    }

    //Text fields
    public void setCompanyName(String name){
        typeToElement(addCompanyPage.companyTextField, name);
    }

    //Upload image
    public void uploadCompanyLogo (String imageURL) {
        sendKeys(addCompanyPage.uploadCompanyLogoButton, imageURL);
    }

    //Click buttons
    public void clickSaveChangesButton(){
        moveAndClick(addCompanyPage.saveChangesButton);
    }

}
