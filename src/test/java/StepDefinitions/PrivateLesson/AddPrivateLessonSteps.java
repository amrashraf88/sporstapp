package StepDefinitions.PrivateLesson;

import POM.Login.LoginPage;
import POM.PrivateLesson.PrivateLessonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static StepDefinitions.Home.Hooks.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class AddPrivateLessonSteps {

    LoginPage loginPage = new LoginPage(driver);
    PrivateLessonPage privateLessonPage = new PrivateLessonPage(driver);
    private WebDriverWait wait;

    @Given("^I am on the private lesson page$")
    public void navigateToPrivateLessonPage() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.user_name()));
        loginPage.user_name().click();
        loginPage.password().click();
        loginPage.loginButton().click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(privateLessonPage.PrivateLesson()));
        privateLessonPage.PrivateLesson().click();
    }

    @When("^I add a new private lesson$")
    public void addNewPrivateLesson() throws InterruptedException, IOException {
        privateLessonPage.AddNewPrivateLesson().click();
        wait.until(ExpectedConditions.visibilityOf(privateLessonPage.PrivateLessonName()));
        privateLessonPage.PrivateLessonName().sendKeys("Test Private Lesson");
        privateLessonPage.ClassPricePerMember().sendKeys("50");
        privateLessonPage.ClassPricePerNonMember().sendKeys("70");
        privateLessonPage.Weapon().click();
        privateLessonPage.Weapon().sendKeys("Epee");
        privateLessonPage.MemberLimit().sendKeys("10");
        privateLessonPage.Statues().sendKeys("Active");
        privateLessonPage.Discription().sendKeys("This is a test private lesson.");
        privateLessonPage.StartDate().sendKeys("22-04-2023");
        privateLessonPage.EndDate().sendKeys("12-05-2023");
        privateLessonPage.SelectCoach().click();
        privateLessonPage.SelectCoach().sendKeys("Vielka Levy");

        privateLessonPage.CalenderTaype().sendKeys("Recurring");


        Thread.sleep(3000);
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

// Scroll down by 500 pixelsThread.sleep(3000);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement( privateLessonPage.choosecalender()).click().perform();
        Thread.sleep(2000);
        // Submit the form



        privateLessonPage.overlapbutton().click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,500)");
        privateLessonPage.addedsuccfully().click();
    }

    @Then("^the new private lesson should be added successfully$")
    public void verifyPrivateLessonAddedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Private lesson added successfully message is not displayed", privateLessonPage.succefullyadded().isDisplayed());
    }
}