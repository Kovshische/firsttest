package ua.org.mwdn;

import helpers.LoginPageHelper;
import helpers.MenuHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pagesObject.LoginPage;
import pagesObject.Menu;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {

    static WebDriver driver;

    //Pages
    static LoginPage loginPage;
    static LoginPageHelper loginPageHelper;
    static MenuHelper menuHelper;

    private static final String DRIVER_HOME_DIRECTORY = "D:\\JavaExamples\\firsttest\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe";
    //private static final String DRIVER_HOME_DIRECTORY = "C:\\qaAutomation\\firsttest\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe";

    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver",DRIVER_HOME_DIRECTORY);
        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
        loginPageHelper = new LoginPageHelper(driver);
        menuHelper = new MenuHelper(driver);
    }




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
/*
        try {
            driver.wait(10, 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //WebElement explicitWait = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf())

     //   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='wrap_subscribed']")).isDisplayed());
        assertThat("Pop up is NOT present",driver.findElement(By.xpath("//div[@class='wrap_subscribed']")).isDisplayed());

    }

    @Test
    public void loginTest(){
        driver.get("http://ec2-34-198-2-13.compute-1.amazonaws.com/");
        loginPageHelper.typeToElement(loginPage.loginField,loginPageHelper.RIGHT_EMAIL);
        loginPageHelper.typeToElement(loginPage.passField,loginPageHelper.PASSWORD);
        loginPageHelper.click(loginPage.submitButton);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        menuHelper.isDashboardDisplayed();
        menuHelper.isDashboardChosen();

    }

    @AfterTest
    public void closeChrome(){
        driver.close();
        driver.quit();
    }

}
