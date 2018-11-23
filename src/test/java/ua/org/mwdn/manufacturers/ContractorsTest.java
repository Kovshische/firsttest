package ua.org.mwdn.manufacturers;

import configuration.WebDriverFactory;
import helpers.companies.AddCompanyHelper;
import helpers.companies.CompanyHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ua.org.mwdn.LoginTest;

import java.net.MalformedURLException;

public class ContractorsTest extends CompanyTest {
    private WebDriver driver;


    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();
        LoginTest.login(driver);
        companyHelper = new CompanyHelper(driver);
        addCompanyHelper = new AddCompanyHelper(driver);
    }

    @Test
    public void addContractor(){
        addCompany(CONTRACTORS);
    }

    @AfterMethod
    public void closeChrome() {
        driver.quit();
    }


}
