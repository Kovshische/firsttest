package ua.org.mwdn;

import configuration.WebDriverFactory;
import configuration.WebDriverFactory_old;
import helpers.LoginPageHelper;
//import helpers.MenuHelper;
import helpers.MenuHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pagesObject.LoginPage;

import java.net.MalformedURLException;

import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {

    public static WebDriver driver;
/*
    public ExampleTest (WebDriver driver){
        this.driver = driver;
    }
*/
    //Pages
    static LoginPage loginPage;
    public static LoginPageHelper loginPageHelper;
    public static MenuHelper menuHelper;


    @BeforeMethod
    public void setDriver() throws MalformedURLException {

        // Without DriverFactory
//        System.setProperty("webdriver.chrome.driver",DRIVER_HOME_DIRECTORY);
//       driver = new ChromeDriver();

//        driver = WebDriverFactory_old.CHROME.create();
//        driver = WebDriverFactory_old.FIREFOX.create();
//        driver = WebDriverFactory_old.IE.create();


        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();


        loginPage = new LoginPage(driver);
        loginPageHelper = new LoginPageHelper(driver);
        menuHelper = new MenuHelper(driver);
    }



/*
    @Test(expectedExceptions = NoSuchElementException.class)
    public void testTest1(){
        driver.get("https:/ithillel.ua/");
        driver.findElement(By.xpath("//div[@class='wrap_cityTabs']//a[@href='https://kharkiv.ithillel.ua/']")).click();
        driver.findElement(By.xpath("//li[@class='active has-sub item_mainMenu name_courses']")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='courseEntities']//a[@href='https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv']"))));
        driver.findElement(By.xpath("//a[contains(@href,'/qa-automation-kharkiv')]//div[@class='text_details' and contains(text(),'Детали курса')]")).click();
        driver.findElement(By.xpath("//form[@id='form-subscribe']//input[@type='text']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@value ='Подписаться']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='wrap_subscribed']"))));

        try {
            driver.wait(10, 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //WebElement explicitWait = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf())

     //   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='wrap_subscribed']")).isDisplayed());
        assertThat("Pop up is NOT present",driver.findElement(By.xpath("//div[@class='wrap_subscribed']")).isDisplayed());

    }
*/


    @Test
    public void loginTest(){
      //  driver.get("http://ec2-34-198-2-13.compute-1.amazonaws.com/");
        loginPageHelper.goToLoginPage();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOf(loginPage.loginField));
        loginPageHelper.typeLogin();
        loginPageHelper.typePass();
        loginPageHelper.clickSubmitButton();
        menuHelper.isDashboardChosen();

    }

    @Test
    public void invalidLoginTest(){
        loginPageHelper.goToLoginPage();
        loginPageHelper.typeLogin();
        loginPageHelper.typeIncorrectPass();
        loginPageHelper.clickSubmitButton();
        loginPageHelper.isIncorrectLoginPopupDisplayed();
    }



    @AfterMethod
    public void closeChrome(){
        driver.quit();
 //       driver.close();

    }

}
