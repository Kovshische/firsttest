package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.LoginPageHelper;
import helpers.MenuHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pagesObject.LoginPage;

import java.net.MalformedURLException;



public class BaseTest {
    //jenkins Log - admin;Pass - admin

    public static WebDriver driver;


    //Pages
    static LoginPage loginPage;
    public static LoginPageHelper loginPageHelper;
    public static MenuHelper menuHelper;



    @BeforeMethod
    public void setDriver() throws MalformedURLException {

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
