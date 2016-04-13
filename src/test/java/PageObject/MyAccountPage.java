package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by wkdu on 16/4/13.
 */
public class MyAccountPage extends AbstractPage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage ClickAddAddress() {
        driver.findElement(By.linkText("添加新地址")).click();
        return new MyAccountPage (driver);
    }
}
