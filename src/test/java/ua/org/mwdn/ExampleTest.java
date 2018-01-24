package ua.org.mwdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.org.mwdn.pages.LoginPage;

public class ExampleTest {

    public static WebDriver driver;

    //Pages
    public static LoginPage loginPage;

    //private static final String DRIVER_HOME_DIRECTORY = "D:\\JavaExamples\\firsttest\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe";
    private static final String DRIVER_HOME_DIRECTORY = "C:\\qaAutomation\\firsttest\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe";

    //Loin credentials:
    private static final String RIGHT_EMAIL = "admin@iroofing.org";
    private static final String PASSWORD = "aPPlicasa1981aPPlosophy";
    private static final String INCORRECT_PASSWORD = "777";

    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver",DRIVER_HOME_DIRECTORY);
        driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
    }



/*
    @Test
    public void testTest1(){
        driver.get("https:/ithillel.ua/");
        driver.findElement(By.xpath("//div[@class='wrap_cityTabs']//a[@href='https://kharkiv.ithillel.ua/']")).click();
        driver.findElement(By.xpath("//li[@class='active has-sub item_mainMenu name_courses']")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='courseEntities']//a[@href='https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv']"))));
        driver.findElement(By.xpath(("//div[@id='courseEntities']//a[@href='https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv']//div[@class='wrap_info']"))).click();
        driver.findElement(By.xpath("//form[@id='form-subscribe']//input[@type='text']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//form[@id='form-subscribe']")).click();
    }
*/
    @Test
    public void loginTest(){
       // driver.get("http://google.com");
        driver.get("http://ec2-34-198-2-13.compute-1.amazonaws.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginField));
        loginPage.loginField.sendKeys(RIGHT_EMAIL);
    }

}
