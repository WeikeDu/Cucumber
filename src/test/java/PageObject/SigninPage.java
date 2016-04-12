package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by wkdu on 16/3/28.
 */
public class SigninPage extends AbstractPage {
    public SigninPage(WebDriver driver) {
        super(driver);
    }

    public SigninPage FillinEmail(String value) {
        driver.findElement(By.id("ap_email")).sendKeys(value);
        return new SigninPage(driver);
    }

    public SigninPage FillinPassword(String value) {
        driver.findElement(By.id("ap_password")).sendKeys(value);
        return new SigninPage(driver);
    }

    public SigninPage ClickSigninButton() {
        driver.findElement(By.id("signInSubmit")).click();
        return new SigninPage(driver);
    }
}
