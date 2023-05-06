package StepDefinitions.PrivateLesson;

import POM.Login.LoginPage;
import POM.PrivateLesson.PrivateLessonPage;
import POM.PrivateLesson.ViewPrivateLessonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static StepDefinitions.Home.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class ViewPrivateLessonSteps {

    LoginPage loginPage = new LoginPage(driver);
    ViewPrivateLessonPage viewprivateLessonPage = new ViewPrivateLessonPage(driver);
    private WebDriverWait wait;

    @Given("^I am on the View  private lesson page$")
    public void navigateToViewPrivateLessonPage() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.user_name()));
        loginPage.user_name().click();
        loginPage.password().click();
        loginPage.loginButton().click();
        Thread.sleep(2000);
        driver.navigate().to("http://3.75.100.91/privatelessons/lesson-details/36");
    }

    @When("^I view private lesson$")
    public void ViewPrivateLesson() throws InterruptedException, IOException {
        Thread.sleep(3000);
        viewprivateLessonPage.ViewPrivateLessonName().isDisplayed();
       String name= viewprivateLessonPage.ViewPrivateLessonName().getText();
        System.out.println(name);
        viewprivateLessonPage.ViewCoach().isDisplayed();
        String Coash = viewprivateLessonPage.ViewCoach().getText();
        System.out.println(Coash);
        String Weapon=viewprivateLessonPage.ViewWeapon().getText();
        System.out.println(Weapon);
        String PricePermember = viewprivateLessonPage.ViewClassPricePerMember().getText();
        System.out.println(PricePermember);
        String StartDate= viewprivateLessonPage.ViewStartDate().getText();
        System.out.println(StartDate);
        String Enddate= viewprivateLessonPage.ViewEndDate().getText();
        System.out.println(Enddate);
        String Statues = viewprivateLessonPage.ViewStatues().getText();
        System.out.println(Statues);
        String Discription = viewprivateLessonPage.ViewDiscription().getText();
        System.out.println(Discription);

    }


}