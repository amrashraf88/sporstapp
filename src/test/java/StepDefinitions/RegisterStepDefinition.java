package StepDefinitions;

import POM.HomePage;
import POM.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.github.javafaker.Faker;

import static StepDefinitions.Hooks.driver;


public class RegisterStepDefinition {
	
	Faker faker = new Faker();
   String nPhone;


    HomePage home = new HomePage(driver);
    String phone = home.fask_phone();
    
    RegistrationPage register = new RegistrationPage(driver);

    @Given("user navigate to registration page")
    public void openRegistrationPag() {
    	//home.login().click();
        home.register().click();
    	try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }


  

    @When("user enter first name")
    public void enterFirstName()
    {
    	String name = home.fask_name();
        register.firstName().sendKeys(name);
        String Name_f=  name;
    }

    @And("user enter last name")
    public void enterLastName()
    {
        register.lastName().sendKeys("ashraf");
    }

    @And("user enter email")
    public void enterEmail()
    {
        register.email().sendKeys("amrhra.f8850@gmail.com");
    }
    public static String globalVariable;
    
    @And("user enter phone")
    public String phone() {
    	globalVariable = phone;
    	
    	register.phone().sendKeys(phone);
    	register.phone().getAttribute(phone);
        globalVariable = phone;
    	return phone;
    	
    }

    @And("user enter password")
    public void enterPassword()
    {
        register.password().sendKeys("12345678");
    }

    @And("user confirm password")
    public void confirmPassword()
    {
        register.confirmPassword().sendKeys("12345678");
    }

    @Then("user could register successfully")
    public void clickOnRegisterBtn()
    {
        register.registerButton().click();
    }




//	@Override
//	void openRegistrationPage() {
//		// TODO Auto-generated method stub	home.login().click();
//    	try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        home.register().click();
//	}



}
