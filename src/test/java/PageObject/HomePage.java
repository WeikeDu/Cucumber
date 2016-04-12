package PageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by wkdu on 16/3/28.
 */
public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage HoverOnYouraccount() {
        Actions actions = new Actions(driver);
        WebElement menuHoverLink = driver.findElement(By.id("nav-link-yourAccount"));
        actions.moveToElement(menuHoverLink).perform();
        return new HomePage(driver);
    }

    public void CheckSignStatus() {
        try {
            driver.findElement(By.cssSelector("#nav-item-signout > span.nav-text")).click();
            System.out.print("Signed out");
            this.NavigateToWeb();
        }
        catch (NoSuchElementException e){
            System.out.print("Sign status checking is completed");
        }
    }

    public HomePage NavigateToSignPage() {
        driver.findElement(By.className("nav-action-inner")).click();
        return new HomePage(driver);
    }

    public HomePage SearchForProduct(String Product) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Product);
        driver.findElement(By.cssSelector("input.nav-input")).click();
        return new HomePage(driver);
    }
}
