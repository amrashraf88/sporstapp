package StepDefinitions.PromoCode;

import POM.Dashbord.HomePage;
import POM.Login.LoginPage;
import POM.Member.MemberPage;
import POM.PromoCode.PromoCodePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static StepDefinitions.Home.Hooks.driver;

public class PromoCodeStepDefinition {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    MemberPage member = new MemberPage(driver);
    PromoCodePage promo = new PromoCodePage(driver);
    @Given("user login to dashboard")
    public void login_for_promo(String username) throws InterruptedException {
        Thread.sleep(1000);
        login.user_name().click();
        login.user_name().sendKeys(Keys.chord(Keys.END, Keys.SHIFT, Keys.HOME), Keys.DELETE);

        login.user_name().sendKeys(username);
    }
    @Given("user navigate to member page")
    public void promopage() throws IOException, InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", home.sidemenu());

        Thread.sleep(3000);
        promo.PromoPage().click();
    }
    @When("user add new promo")
    public void AddNewpromo() throws InterruptedException {
        Thread.sleep(1000);

       promo.AddNewPromocod().click();
    }

    @And("user enter promo name")
    public void promoName(){
    promo.PromoCodeName().click();
    promo.PromoCodeName().sendKeys(home.fask_name());
    }
    @And("user adding PromoType")
    public void PromoType(){
        Select select = new Select(promo.promocodeType());
        select.selectByVisibleText("percentage");
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
//    @And("user choose his payment")
//    public void paymentMethod(){
//        member.Cash().click();
//    }
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
