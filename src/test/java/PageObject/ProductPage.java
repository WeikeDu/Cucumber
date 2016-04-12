package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by wkdu on 16/3/30.
 */
public class ProductPage extends AbstractPage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage SelectFirstMachProduct() {
        driver.findElement(By.xpath("//li[@id='result_0']/div/div[3]/div/a/h2")).click();
        return new ProductPage(driver);
    }

    public ProductPage ClickAddToCartButton() {
        driver.findElement(By.id("add-to-cart-button")).click();
        return new ProductPage(driver);
    }
}
