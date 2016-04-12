package TestSteps;

import PageObject.ProductPage;
import PageObject.SigninPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.HomePage;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by wkdu on 16/3/25.
 */
public class TestStepsDefs extends WebDriverConfig {

    WebDriver driver = getDriver();
    HomePage homepage = new HomePage(driver);
    SigninPage signinpage = new SigninPage(driver);
    ProductPage productpage = new ProductPage(driver);


    @Given("^I navigate to the certain page$")
    public void iNavigateToTheCertainPage() throws Throwable {
        homepage.NavigateToWeb();
        homepage.HoverOnYouraccount();
        homepage.CheckSignStatus();
    }


    @When("^I click the sign up button$")
    public void iClickTheSignUpButton() throws Throwable {
        homepage.HoverOnYouraccount();
        homepage.NavigateToSignPage();
    }

    @And("^I fill in the account and password$")
    public void iFillInTheAccountAndPassword(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        signinpage.FillinEmail(data.get(1).get(1));
        signinpage.FillinPassword(data.get(2).get(1));
        signinpage.ClickSigninButton();
    }

    @Then("^I go to a welcome page$")
    public void iGoToAWelcomePage() throws Throwable {
        Assert.assertEquals(driver.findElement(By.cssSelector("#nav-tools > .nav-a >.nav-line-2")).getText(),"我的帐户");
    }


    @Given("^I am at homepage$")
    public void iAmAtHomepage() throws Throwable {
        homepage.NavigateToWeb();
    }

    @When("^I search for a certain product \"([^\"]*)\"$")
    public void iSearchForACertainProduct(String Product) throws Throwable {
        homepage.SearchForProduct(Product);
    }

    @And("^I click the product I want to purchase$")
    public void iClickTheProductIWantToPurchase() throws Throwable {
        productpage.SelectFirstMachProduct();
        productpage.SwithToNewWindow();
        productpage.ClickAddToCartButton();
    }

    @Then("^Page shows that the product has been added to your shopping cart$")
    public void pageShowsThatTheProductHasBeenAddedToYourShoppingCart() throws Throwable {
        Assert.assertEquals(driver.findElement(By.cssSelector(".a-size-medium h1")).getText(),"商品已加入购物车");
    }

    @And("^Delete the product in shopping cart$")
    public void deleteTheProductInShoppingCart() throws Throwable {
        driver.findElement(By.id("hlb-view-cart")).click();
        driver.findElement(By.cssSelector("[value='删除']")).click();
    }
}


