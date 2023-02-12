package StepDefinitions;

import POM.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinitions.Hooks.driver;

public class CreateOrderSD {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    CategoryPage category = new CategoryPage(driver);
    checkoutpage checkout = new checkoutpage(driver);
    CartPage cart = new CartPage(driver);



    @And("user choose any category")
    public void selectproduct() throws InterruptedException {
        Thread.sleep(6000);
        home.selectproduct().click();
    }

    @And("user add any product to cart")
    public void addToCart()
    {
        category.addToCartButton().click();
    }

    @And("user open cart page")
    public void openCartPage()
    {
        home.cartPageButton().click();
    }


    @And("user click on checkout")
    public void clickOnCheckout() throws InterruptedException {
        Thread.sleep(3000);
        cart.checkoutButton().click();
    }

    @And("user choose which way he went to checkout")
    public void choose_way() throws InterruptedException {
        Thread.sleep(2000);
        checkout.Continue_as_guest().click();
    }
    @And("user add data")
    public void add_data_guest() throws InterruptedException {
        Thread.sleep(2000);
        checkout.first_name_guest().click();
        checkout.first_name_guest().sendKeys("as");
        checkout.last_name_guest().click();
        checkout.last_name_guest().sendKeys("sa");
        checkout.phone_guest().click();
        checkout.phone_guest().sendKeys("251215325");
        checkout.containue_to_store_details().click();
    }
    @And("user edit billing address")
    public void addBillingAddress() throws InterruptedException {
        Thread.sleep(3000);
        checkout.crest_address().click();
    }
    @And("user add address")
    public void add_address_guest() throws InterruptedException {
        Thread.sleep(3000);
        checkout.address_street().click();
        checkout.address_street().sendKeys("test");
        checkout.building().click();
        checkout.building().sendKeys("test");
        checkout.save_address().click();
    }




    @And("user choose payment method")
    public void selectPaymentMethod()
    {
        checkout.continue_pyment().click();
    }

    @And("user check payment information")
    public void checkPaymentInformation()
    {
        checkout.choose_payment().click();
    }

    @And("user agree terms and conditions")
    public void agreeTermsANDConditions()
    {
        checkout.agree_team_condetion().click();
    }

    @And("user confirm order")
    public void clickConfirmOrder()
    {
        checkout.place_order().click();
    }

//    @Then("order should be placed successfully")
//    public void checkOrderIsPlaced() throws InterruptedException {
//        Thread.sleep(2000);
//        String expectedResult = "Your order has been successfully processed!";
//        String actualResult = checkout.getOrderMessage().getText();
//        Assert.assertTrue(actualResult.contains(expectedResult));
//    }

}
