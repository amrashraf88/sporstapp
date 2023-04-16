package StepDefinitions.Login;

import POM.HomePage;
import POM.LoginPage;
import StepDefinitions.Register.RegisterStepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.*;

import static StepDefinitions.Home.Hooks.driver;

public class LoginStepDefinition  {

	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);



	@When("user enter valid email\"(.*)\"$")
	public void enterEmail(String username) throws IOException, InterruptedException {
		Thread.sleep(1000);
		login.user_name().click();
		login.user_name().sendKeys(Keys.chord(Keys.END, Keys.SHIFT, Keys.HOME), Keys.DELETE);

		login.user_name().sendKeys(username);
	}



	@And("user enter valid password\"(.*)\"$")
	public void enterPassword(String password) {
        login.password().click();
		login.password().sendKeys(Keys.chord(Keys.END, Keys.SHIFT, Keys.HOME), Keys.DELETE);
		login.password().sendKeys(password);
	}

	@And("user click on login")
	public void clickLoginButton() {
		login.loginButton().click();
	}

	@Then("user could login successfully and redirected to home page")
	public void successLogin() throws InterruptedException {

		Thread.sleep(2000);
		String expectedResult = "http://3.75.100.91/dashboard";
		String actualResult = home.getURL();
		Assert.assertTrue(actualResult.contains(expectedResult));

	}

}
