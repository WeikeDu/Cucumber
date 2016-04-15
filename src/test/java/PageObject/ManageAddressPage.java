package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by wkdu on 16/4/13.
 */
public class ManageAddressPage extends AbstractPage {
    public ManageAddressPage(WebDriver driver) {
        super(driver);
    }

    public ManageAddressPage FillinFullName() {
        driver.findElement(By.id("enterAddressFullName")).sendKeys("杜维克");
        return new ManageAddressPage (driver);
    }

    public ManageAddressPage FillinDetailAddress() {
        driver.findElement(By.id("enterAddressFullName")).sendKeys("杜维克");
        driver.findElement(By.id("stateTrigger")).click();
        WebElement ProvinceButton = (new WebDriverWait(driver,30))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("四川")));
        ProvinceButton.click();
        WebElement CityButton = (new WebDriverWait(driver,30))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("成都市")));
        CityButton.click();
        WebElement BlockButton = (new WebDriverWait(driver,30))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("高新南区")));
        BlockButton.click();
        driver.findElement(By.id("enterAddressAddressLine1")).sendKeys("天府大道中段1268号天府软件园E区1栋7楼");
        driver.findElement(By.id("enterAddressPostalCode")).sendKeys("610041");
        return new ManageAddressPage(driver);
    }

    public ManageAddressPage FillinContacInfot() {
        driver.findElement(By.id("enterAddressPhoneNumber")).sendKeys("15802881436");
        driver.findElement(By.id("enterAddressTaxId")).sendKeys("51010519890104227X");
        return new ManageAddressPage(driver);
    }

    public  ManageAddressPage SaveMyAddress() {
        driver.findElement(By.id("myab_newAddressButton")).click();
        return new ManageAddressPage (driver);
        
    }
}
