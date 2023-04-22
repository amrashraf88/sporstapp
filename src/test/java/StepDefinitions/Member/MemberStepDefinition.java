package StepDefinitions.Member;

import POM.Dashbord.HomePage;
import POM.Login.LoginPage;
import POM.Member.MemberPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;

import static StepDefinitions.Home.Hooks.driver;

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
    //    member.MemberDetails().click();
    //    member.EditMember().click();
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
    public void info() throws InterruptedException {
        // Assume driver is a valid WebDriver instance
        member.DOB().sendKeys("22032022");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
         // scrolls down the page by 500 pixels
        member.DOB().sendKeys("22032022");
        try {
            if (member.DOB().isDisplayed()) {
                js.executeScript("window.scrollBy(0,500)");
            }else {
                System.out.println("error");
            }
        }catch (Exception e){
            System.out.println("hi");
        }


        Select select = new Select(member.Gender());
        select.selectByVisibleText("Male");
        member.Grade().click();
        member.Grade().sendKeys("10");
        member.School().click();
        member.School().sendKeys("testschool");
    }
    @And("user add contact")
    public void contact() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        member.CellPhoneNumber().sendKeys(home.fask_phone());
        member.Email().sendKeys(home.fask_email());
        Select select = new Select(member.PreferredContactMethod());
        select.selectByVisibleText("Email");
        member.Whatsapp().sendKeys(home.fask_phone());
        member.FBMassenger().click();
        member.FBMassenger().sendKeys(home.fask_name());
        member.GoogleDue().click();
        member.GoogleDue().sendKeys(home.fask_name());

    }
    @And("user add his address")
    public void AddressMember() throws InterruptedException {
        Thread.sleep(1000);

        Select state = new Select(member.State());
        state.selectByVisibleText("New York");
        member.City().click();
        Select city = new Select(member.City());
        city.selectByVisibleText("New York");
        member.StreetAddress().click();
        member.StreetAddress().sendKeys(home.fask_name());
        member.ZipCode().click();
        member.ZipCode().sendKeys("12345");

    }
    @And("user add his Health")
    public void HealthMember() throws InterruptedException {
        Thread.sleep(2000);
        member.MemberhealthHistory().click();
        member.MemberhealthHistory().sendKeys(home.fask_name());
        member.Carriedmedications().click();
        member.Carriedmedications().sendKeys(home.fask_name());
        member.Allergies().click();
        member.Allergies().sendKeys(home.fask_name());
    }
    @And("user add his activity")
    public void activity() throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Select select = new Select(member.Weapon());
        select.selectByVisibleText("Epee");
        Select select1 = new Select(member.Statues());
        select1.selectByVisibleText("Inactive");

    }
    @And("user choose his payment")
    public void paymentMethod(){
        member.Cash().click();
    }
    @And("user save data of member")
    public void SaveData(){
        member.SaveButton().click();
    }

    @Then("member added succesfully")
    public void createsuccesfully() throws InterruptedException {
        Thread.sleep(3000);
        String Acualy = member.successfull().getText();
        assert Acualy.equals("Member added successfully");

    }
}
