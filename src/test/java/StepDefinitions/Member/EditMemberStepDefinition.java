package StepDefinitions.Member;

import POM.HomePage;
import POM.LoginPage;
import POM.MemberPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static StepDefinitions.Home.Hooks.driver;

public class EditMemberStepDefinition {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    MemberPage member = new MemberPage(driver);
    @Given("user login to Edit member to  dashboard")
    public void login_for_editmember() throws InterruptedException {
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
    @Given("user navigate to edit member")
    public void editmemberpage() throws IOException, InterruptedException {
        Thread.sleep(3000);
        member.MemberPag().click();
    }
    @When("user Edit new member")
    public void EditNewMember() throws InterruptedException {
        Thread.sleep(1000);
        member.MemberDetails().click();
        member.EditMember().click();

    }
    @And("user Edit marketing")
    public void Editmarketing(){
        member.FacebookAds().click();
    }
    @And("user Edit name")
    public void EditFullName(){
        member.FirstName().click();
        member.FirstName().sendKeys(home.fask_name());
        member.LastName().click();
        member.LastName().sendKeys(home.fask_name());
    }
    @And("user Edit membership")
    public void EditMembership(){
        Select select = new Select(member.MemberShipType());
        select.selectByVisibleText("Recurring");
        member.AdultName().click();
        member.AdultName().sendKeys("test");

        Select select1 = new Select(member.RealationShip());
        select1.selectByVisibleText("Mother");
        member.Ismember().click();
    }

    @And("user Edit info")
    public void Editinfo() throws InterruptedException {
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
        select.selectByVisibleText("M");
        member.Grade().click();
        member.Grade().sendKeys("10");
        member.School().click();
        member.School().sendKeys("testschool");
    }
    @And("user Edit contact")
    public void Editcontact() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        member.CellPhoneNumber().sendKeys("0102345634");
        member.Email().sendKeys(home.fask_email());
        Select select = new Select(member.PreferredContactMethod());
        select.selectByVisibleText("Email");
        member.Whatsapp().sendKeys("0102345678");
        member.FBMassenger().click();
        member.FBMassenger().sendKeys(home.fask_name());
        member.GoogleDue().click();
        member.GoogleDue().sendKeys(home.fask_name());

    }
    @And("user Edit his address")
    public void EditAddressMember() throws InterruptedException {
        Thread.sleep(1000);
        member.City().click();
        member.City().sendKeys(home.fask_name());
        member.State().click();
        member.State().sendKeys(home.fask_name());
        member.StreetAddress().click();
        member.StreetAddress().sendKeys(home.fask_name());
        member.ZipCode().click();
        member.ZipCode().sendKeys("12345");

    }
    @And("user Edit his Health")
    public void EditHealthMember() throws InterruptedException {
        Thread.sleep(2000);
        member.MemberhealthHistory().click();
        member.MemberhealthHistory().sendKeys(home.fask_name());
        member.Carriedmedications().click();
        member.Carriedmedications().sendKeys(home.fask_name());
        member.Allergies().click();
        member.Allergies().sendKeys(home.fask_name());
    }
    @And("user Edit his activity")
    public void Editactivity() throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Select select = new Select(member.Weapon());
        select.selectByVisibleText("Epee");
        Select select1 = new Select(member.Statues());
        select1.selectByVisibleText("Inactive");
    }
    @And("user Edit his payment")
    public void EditpaymentMethod(){
        member.Cash().click();
    }
    @Then("user save data of Editmember")
    public void EditSaveData(){
        member.SaveButton().click();
    }

}
