package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by wkdu on 16/3/28.
 */
public class AbstractPage {

    protected WebDriver driver;
    public static String baseURL="https://www.amazon.cn/";

    public AbstractPage (WebDriver driver) {

        this.driver = driver;
    }

    public HomePage NavigateToWeb() {

        driver.navigate().to(baseURL);
        return new HomePage(driver);
    }

    public void SwithToNewWindow() {
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void DeleteProduct() {
        driver.findElement(By.id("hlb-view-cart")).click();
        driver.findElement(By.cssSelector("[value='删除']")).click();
    }

    public void DeleteAddress() {
        driver.findElement(By.linkText("删除")).click();
        driver.findElement(By.linkText("确认")).click();
    }
}
