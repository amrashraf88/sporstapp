package StepDefinitions;

import POM.HomePage;
import POM.LoginPage;
import POM.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefinitions.Hooks.driver;

public class LoginStepDefinition {
    
	
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	
	String nphone;
	@Given("user to login page")
	public void openLoginPage() throws InterruptedException {
		Thread.sleep(3000);
		home.login().click();
		
	}
	@And ("user accept cookies")
    public void accept_cookie() throws InterruptedException {
		Thread.sleep(3000);
		login.accept_cookie().click();
	}
	
	@When("user enter valid email")
	public void enterEmail() {
		
	 String phone = RegisterStepDefinition.globalVariable;
	    
		login.userName().sendKeys(phone);
	}

	@And("user enter valid password")
	public void enterPassword() {
		login.password().sendKeys("12345678");
	}

	@And("user click on login")
	public void clickLoginButton() {
		login.loginButton().click();
	}
	@And ("user click on profile")
public void clickaccountbutton() throws InterruptedException {
		Thread.sleep(2000);
	home.profile().click();
} 
	@Then("user could login successfully and redirected to home page")
	public void successLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		
		Assert.assertEquals("https://hotfix.el-dokan.com/en/account/profile", home.getURL());
	}

}
