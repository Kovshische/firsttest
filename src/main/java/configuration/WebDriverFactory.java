package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum WebDriverFactory {


    CHROME {
        public WebDriver create(){
          System.setProperty("webdriver.chrome.driver",Constant.CHROME_DRIVER_HOME_DIRECTORY);
          return new ChromeDriver();
        }
    },
    IE {
        public WebDriver create (){
            System.setProperty("webdriver.ie.driver",Constant.IE_DRIVER_HOME_DIRECTORY);
            return new InternetExplorerDriver();
        }
    },
    FIREFOX{
        public WebDriver create (){
            System.setProperty("webdriver.firefox.marionatte",Constant.FIREFOX_DRIVER_HOME_DIRECTORY);
            return new FirefoxDriver();
        }
    };

    public WebDriver create (){
        return null;
    }
}
