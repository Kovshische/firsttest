package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pagesObject.LoginPage;
import pagesObject.Menu;

public class LoginPageHelper extends GeneralHelper {

    private WebDriver driver;
    private LoginPage loginPage;

    //Loin credentials:
    public static final String EMAIL = "admin@iroofing.org";
    public static final String PASSWORD = "AppliCASA1999iRoofing2012";
    private static final String INCORRECT_PASSWORD = "777";
    private static final String LOGIN_PAGE_ADDRESS = "http://ec2-34-235-10-165.compute-1.amazonaws.com/";

    public LoginPageHelper(WebDriver driver){
        super(driver);
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }


    public void goToLoginPage (){
        driver.get(LOGIN_PAGE_ADDRESS);
    }
/*
    public static void typeToElement (WebElement element, String message) {
        element.sendKeys(message);
    }

    public static void click (WebElement element){
        element.click();
    }
*/
    public  void typeLogin (){
        typeToElement(loginPage.loginField, EMAIL);
    }

    public void typePass (){
        typeToElement(loginPage.passField, PASSWORD);
    }
    public void typeIncorrectPass(){
        typeToElement(loginPage.passField, INCORRECT_PASSWORD);
    }
    public void clickSubmitButton(){
        click(loginPage.submitButton);
    }

    public void isIncorrectLoginPopupDisplayed(){
        Assert.assertTrue(loginPage.incorrectLoginOrPassPopup.isDisplayed());
    }

    public void login(){
        goToLoginPage();
        typeLogin();
        typePass();
        clickSubmitButton();
    }

}
