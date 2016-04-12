package PageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by wkdu on 16/3/28.
 */
public class AbstractPage {

    protected WebDriver driver;

    public AbstractPage (WebDriver driver) {

        this.driver = driver;
    }

    public HomePage NavigateToWeb() {

        driver.navigate().to("https://www.amazon.cn/");
        return new HomePage(driver);
    }

    public void CloseAllBrowser() {
        driver.quit();
    }
    public void CloseBrowser() {
        driver.close();
    }

    public void SwithToNewWindow() {
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
}
