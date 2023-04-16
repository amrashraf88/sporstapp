package StepDefinitions.Login;

import POM.HomePage;
import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static StepDefinitions.Home.Hooks.driver;

public class InvalidLogin {
    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    @When("user enter Invalid user\"(.*)\"$")
    public void enterInvalidEmail(String username) throws IOException, InterruptedException {
        Thread.sleep(3000);
        WebElement userNameField = login.user_name();
        userNameField.click();
        userNameField.sendKeys(Keys.chord(Keys.END, Keys.SHIFT, Keys.HOME), Keys.DELETE);
        userNameField.sendKeys(username);
    }
    @And("user enter Invalid password\"(.*)\"$")
    public void enterInvalidPassword(String password) {
        WebElement passwordField = login.password();
        passwordField.click();
        passwordField.sendKeys(Keys.chord(Keys.END, Keys.SHIFT, Keys.HOME), Keys.DELETE);
        passwordField.sendKeys(password);
    }
    @And("user Invalid click on login")
    public void InvaidclickLoginButton() {
        login.loginButton().click();
    }
    @Then("user couldn't login successfully and redirected to home page")
    public void CannotLogin() throws InterruptedException {

        Thread.sleep(2000);
        String expectedResult = "http://3.75.100.91/dashboard";
        String actualResult = home.getURL();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Then("user cannot login")
    public void wrongdata(){
        if (login.tostor()!=null){
            login.tostor().isDisplayed();
        }else {
            System.out.println("error");
        }
    }
}
