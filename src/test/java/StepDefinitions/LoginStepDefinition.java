package StepDefinitions;

import POM.HomePage;
import POM.LoginPage;
import POM.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.scanner.Scanner;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import java.time.Duration;
import java.util.List;

import static StepDefinitions.Hooks.driver;

public class LoginStepDefinition  {

	String phone = RegisterStepDefinition.globalVariable;
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);

	String nphone;


	@When("user enter valid email")
	public void enterEmail() throws IOException, InterruptedException {
		Thread.sleep(3000);
		login.user_name().clear();
		login.user_name().clear();
		login.user_name().sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		login.user_name().sendKeys("");
	}



	@And("user enter valid password")
	public void enterPassword() {
        login.password().click();
		login.password().clear();
		login.password().sendKeys("");
	}

	@And("user click on login")
	public void clickLoginButton() {
		login.loginButton().click();
	}
//	@And ("user click on profile")
//public void clickaccountbutton() throws InterruptedException {
//		Thread.sleep(2000);
//	home.profile().click();
//}
	@Then("user could login successfully and redirected to home page")
	public void successLogin() throws InterruptedException {

		Thread.sleep(2000);
		String expectedResult = "http://3.75.100.91/dashboard";
		String actualResult = home.getURL();
		Assert.assertTrue(actualResult.contains(expectedResult));

	}

}
