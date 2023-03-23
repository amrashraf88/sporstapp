package StepDefinitions;

import POM.HomePage;
import POM.LoginPage;
import POM.MemberPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static StepDefinitions.Hooks.driver;

public class MemberStepDefinition {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    MemberPage member = new MemberPage(driver);
    @Given("user login to dashboard")
    public void login_for_member() throws InterruptedException {
        Thread.sleep(2000);
        login.user_name().clear();
        login.user_name().clear();
        login.user_name().sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        login.user_name().sendKeys("");
        login.password().click();
        login.password().clear();
        login.password().sendKeys("");
        login.loginButton().click();
    }
    @Given("user navigate to member page")
    public void memberpage() throws IOException, InterruptedException {
        Thread.sleep(3000);
        member.MemberPag().click();
    }
    @When("user add new member")
    public void AddNewMember() throws InterruptedException {
        Thread.sleep(1000);
        member.AddNewMember().click();
    }
    @And("user choose marketing")
    public void marketing(){
        member.FacebookAds().click();
    }
    @And("user entering name")
    public void FullName(){
        member.FirstName().click();
        member.FirstName().sendKeys(home.fask_name());
        member.LastName().click();
        member.LastName().sendKeys(home.fask_name());
    }
    @And("user adding membership")
    public void Membership(){
        Select select = new Select(member.MemberShipType());
        select.selectByVisibleText("Recurring");
        member.AdultName().click();
        member.AdultName().sendKeys("test");

        Select select1 = new Select(member.RealationShip());
        select1.selectByVisibleText("Mother");
        member.Ismember().click();
    }

    @And("user addning info")
    public void info(){
        // Assume driver is a valid WebDriver instance
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)"); // scrolls down the page by 500 pixels

        member.DOB().sendKeys("22032022");
        Select select = new Select(member.Gender());
        select.selectByVisibleText("Female");
        member.Grade().click();
        member.Grade().sendKeys("10");
        member.School().click();
        member.School().sendKeys("testschool");
    }
    @And("user add contact")
    public void contact() throws InterruptedException {
        member.CellPhoneNumber().sendKeys("0102345634");
        member.Email().sendKeys(home.fask_email());
        Select select = new Select(member.PreferredContactMethod());
        select.selectByVisibleText("Email");
        member.Whatsapp().sendKeys("0102345678");
        member.FBMassenger().click();
        member.FBMassenger().sendKeys(home.fask_name());
        member.GoogleDue().click();
        member.GoogleDue().sendKeys(home.fask_name());
        Thread.sleep(90000);
    }

}
