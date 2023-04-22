package StepDefinitions.PromoCode;

import POM.Dashbord.HomePage;
import POM.Login.LoginPage;
import POM.PromoCode.PromoCodePage;
import StepDefinitions.Home.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditPromoCodeStepDefinition {

    WebDriver driver = null;
    HomePage home = null;
    PromoCodePage promoCodePage = null;
    LoginPage login = null;
    public EditPromoCodeStepDefinition() {
        this.driver = Hooks.driver;
        this.promoCodePage = new PromoCodePage(driver);
        this.home = new HomePage(driver);
        this.login=new LoginPage(driver);
    }

    @Given("I am on the promo code page for edit")
    public void iAmOnThePromoCodePageforEdit() throws InterruptedException {
        Thread.sleep(2000);
        login.user_name().click();
        login.password().click();
        login.loginButton().click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement sideMenu = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div"));
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        // Scroll the side menu element into view using JavaScript
        jss.executeScript("arguments[0].scrollBy(0, 500)", sideMenu);
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.PromoPage()));


        promoCodePage.PromoPage().click();
    }

    @When("I click on the add edit promo code button")
    public void iClickOnTheEditPromoCodeButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.first_promo()));
        promoCodePage.first_promo().click();
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.editpromo()));
        promoCodePage.editpromo().click();
    }

    @And("I change the promo code details")
    public void ichangeThePromoCodeDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.PromoCodeName()));
        promoCodePage.PromoCodeName().clear();
        promoCodePage.PromoCodeName().sendKeys(home.fask_name());
        promoCodePage.promocodeType().click();
        promoCodePage.promocodeType().sendKeys("Amount");
        promoCodePage.PromocodePerecentage().clear();
        promoCodePage.PromocodePerecentage().sendKeys("50");
        promoCodePage.MaxAmountOfDiscount().clear();
        promoCodePage.MaxAmountOfDiscount().sendKeys("100");
        promoCodePage.SelectedPackage().click();
        promoCodePage.SelectedPackage().sendKeys("gold");
        promoCodePage.MaxNumberOfuser().clear();
        promoCodePage.MaxNumberOfuser().sendKeys("10");
        promoCodePage.NewCustomer().click();
        promoCodePage.StartData().clear();
        promoCodePage.StartData().click();
        promoCodePage.StartData().sendKeys("01-05-2023");
        promoCodePage.EndData().click();
        promoCodePage.EndData().sendKeys("31-05-2023");
        promoCodePage.Statues().click();
        promoCodePage.Statues().sendKeys("active");
    }

    @And("I submit the changed of promo code")
    public void iSubmitTheChangePromoCode() {
        promoCodePage.SubmitButton().click();
    }

    @Then("I should see the promo code edited successfully")
    public void iShouldSeeThePromoCodechange() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.addedsuccfully()));
    }
}
