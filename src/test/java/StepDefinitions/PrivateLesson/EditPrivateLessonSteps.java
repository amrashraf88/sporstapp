package StepDefinitions.PrivateLesson;
import POM.Login.LoginPage;
import POM.PrivateLesson.EditePrivateLessonPage;
import POM.PrivateLesson.PrivateLessonPage;
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
public class EditPrivateLessonSteps {

    LoginPage loginPage = new LoginPage(driver);
    EditePrivateLessonPage EditeprivateLessonPage = new EditePrivateLessonPage(driver);
    private WebDriverWait wait;

    @Given("^I am on the view private lesson page to edit it$")
    public void navigateToPrivateLessonPage() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.user_name()));
        loginPage.user_name().click();
        loginPage.password().click();
        loginPage.loginButton().click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(EditeprivateLessonPage.EditePrivateLesson()));
        EditeprivateLessonPage.EditePrivateLesson().click();
    }

    @When("^I edit private lesson$")
    public void addNewPrivateLesson() throws InterruptedException, IOException {
        EditeprivateLessonPage.EditePrivateLesson().click();
        wait.until(ExpectedConditions.visibilityOf(EditeprivateLessonPage.EditPrivateLessonName()));
        EditeprivateLessonPage.EditPrivateLessonName().sendKeys("Test Private Lesson");
        EditeprivateLessonPage.EditClassPricePerMember().sendKeys("50");
        EditeprivateLessonPage.EditClassPricePerNonMember().sendKeys("70");
        EditeprivateLessonPage.EditWeapon().click();
        EditeprivateLessonPage.EditWeapon().sendKeys("Epee");
        EditeprivateLessonPage.EditMemberLimit().sendKeys("10");
        EditeprivateLessonPage.EditStatues().sendKeys("Active");
        EditeprivateLessonPage.EditDiscription().sendKeys("This is a test private lesson.");
        EditeprivateLessonPage.EditStartDate().sendKeys("22-04-2023");
        EditeprivateLessonPage.EditEndDate().sendKeys("12-05-2023");
        EditeprivateLessonPage.EditeCoach().click();
        EditeprivateLessonPage.EditeCoach().sendKeys("Vielka Levy");

        EditeprivateLessonPage.addedsuccfully().click();
    }

    @Then("^the edit private lesson should be edited successfully$")
    public void verifyPrivateLessonAddedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Private lesson added successfully message is not displayed", EditeprivateLessonPage.succefullyadded().isDisplayed());
    }
}