package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum WebDriverFactory {


    CHROME {
        public WebDriver create(){
          System.setProperty("webdriver.chrome.driver",Constant.DRIVER_HOME_DIRECTORY);
          return new ChromeDriver();
        }
    },
    IE {
        public WebDriver create (){
            System.setProperty("webdriver.ie.driver",Constant.DRIVER_HOME_DIRECTORY);
            return new InternetExplorerDriver();
        }
    },
    FIREFOX{
        public WebDriver create (){
            System.setProperty("webdriver.firefox.driver",Constant.DRIVER_HOME_DIRECTORY);
            return new FirefoxDriver();
        }
    }
}
