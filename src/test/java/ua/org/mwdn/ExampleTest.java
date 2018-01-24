package ua.org.mwdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void testTest1(){
        System.setProperty("webdriver.chrome.driver","D:\\JavaExamples\\firsttest\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/ithillel.ua/");
        driver.findElement(By.xpath("//div[@class='wrap_cityTabs']//a[@href='https://kharkiv.ithillel.ua/']")).click();
        driver.findElement(By.xpath("//li[@class='active has-sub item_mainMenu name_courses']")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='courseEntities']//a[@href='https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv']"))));
        driver.findElement(By.xpath(("//div[@id='courseEntities']//a[@href='https://kharkiv.ithillel.ua/courses/qa-automation-kharkiv']//div[@class='wrap_info']"))).click();
        driver.findElement(By.xpath("//form[@id='form-subscribe']//input[@type='text']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//form[@id='form-subscribe']")).click();

    }
}
