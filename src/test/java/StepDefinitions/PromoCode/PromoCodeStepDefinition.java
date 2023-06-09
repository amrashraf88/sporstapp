package StepDefinitions.PromoCode;

import POM.Dashbord.HomePage;
import POM.Login.LoginPage;
import StepDefinitions.Home.HomeStepDefinition;
import StepDefinitions.Home.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import POM.PromoCode.PromoCodePage;

import java.time.Duration;

public class PromoCodeStepDefinition {

    WebDriver driver = null;
    HomePage home = null;
    PromoCodePage promoCodePage = null;
    LoginPage login = null;
    public PromoCodeStepDefinition() {
        this.driver = Hooks.driver;
        this.promoCodePage = new PromoCodePage(driver);
        this.home = new HomePage(driver);
        this.login =new LoginPage(driver);
    }

    @Given("I am on the promo code page")
    public void iAmOnThePromoCodePage() throws InterruptedException {
        Thread.sleep(2000);
        login.user_name().click();
        login.password().click();
        login.loginButton().click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sideMenu = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the side menu element into view using JavaScript
        js.executeScript("arguments[0].scrollBy(0, 500)", sideMenu);
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.PromoPage()));


        promoCodePage.PromoPage().click();
    }

    @When("I click on the add new promo code button")
    public void iClickOnTheAddNewPromoCodeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.AddNewPromocod()));
        promoCodePage.AddNewPromocod().click();
    }

    @And("I enter the promo code details")
    public void iEnterThePromoCodeDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.PromoCodeName()));
        promoCodePage.PromoCodeName().sendKeys(home.fask_name());
        promoCodePage.promocodeType().sendKeys("Amount");
        promoCodePage.PromocodePerecentage().sendKeys("50");
        promoCodePage.MaxAmountOfDiscount().sendKeys("100");
        promoCodePage.SelectedPackage().sendKeys("gold");
        promoCodePage.MaxNumberOfuser().sendKeys("10");
        promoCodePage.NewCustomer().click();
        promoCodePage.StartData().click();
        promoCodePage.StartData().sendKeys("01-05-2023");
        promoCodePage.EndData().click();
        promoCodePage.EndData().sendKeys("31-05-2023");
        promoCodePage.Statues().click();
        promoCodePage.Statues().sendKeys("active");
    }

    @And("I submit the promo code")
    public void iSubmitThePromoCode() {
        promoCodePage.SubmitButton().click();
    }

    @Then("I should see the promo code added successfully")
    public void iShouldSeeThePromoCodeInTheList() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(promoCodePage.addedsuccfully()));
    }
}
