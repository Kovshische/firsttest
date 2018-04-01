package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.ColorHelper;
import helpers.LoginPageHelper;
import helpers.MenuHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pagesObject.LoginPage;

import java.net.MalformedURLException;
import java.util.logging.Logger;


public class BaseTest {
    //jenkins Log - admin;Pass - admin

    private static Logger log = Logger.getLogger(BaseTest.class.getName());


    public static WebDriver driver;


    //Pages
    static LoginPage loginPage;
    public static LoginPageHelper loginPageHelper;
    public static MenuHelper menuHelper;



    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        log.info("Test");
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();

        loginPage = new LoginPage(driver);
        loginPageHelper = new LoginPageHelper(driver);
        menuHelper = new MenuHelper(driver);
    }


    @AfterMethod
    public void closeChrome(){
        driver.quit();
    }

}
