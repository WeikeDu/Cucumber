package TestSteps;

import PageObject.AbstractPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by wkdu on 16/3/25.
 */
public class WebDriverConfig {
    protected static WebDriver driver;
    protected WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver","/Users/wkdu/Cucumber/Tools/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        }
        return driver;
    }

    private static  class BrowserCleanup implements Runnable {
        public  void run() {
            close();
        }

        private static void close() {
            try {
                if (driver != null) {
                    driver.quit();
                    driver = null;
                }
            } catch (Exception e) {

            }
        }
    }
}
