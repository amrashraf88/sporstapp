package StepDefinitions.Register;

import POM.HomePage;
import POM.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static StepDefinitions.Home.Hooks.driver;


public class RegisterStepDefinition {
	
	Faker faker = new Faker();
   String nPhone;


    HomePage home = new HomePage(driver);
    String phone = home.fask_phone();

    RegistrationPage register = new RegistrationPage(driver);

    @Given("user navigate to registration page")
    public void openRegistrationPag() throws InterruptedException {
        Thread.sleep(3000);

        home.register().click();
    }

@When("user add club name")
public void ClubName() throws InterruptedException {
        Thread.sleep(1000);
        register.ClubName().click();
        register.ClubName().sendKeys(home.fask_name());
}
  
@And("user add club domin")
public void ClubDomain(){
        register.DominName().click();
        register.DominName().sendKeys("test@domain.com");
}
    @And("user enter first name")
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
    public void enterEmail() throws IOException {
        try {
            FileWriter fw = new FileWriter("/home/amr/Downloads/hotfix_final/fileName2.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String email = home.fask_email();
        register.email().sendKeys(email);
        File file = new File("fileName2.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("");
        fr.write(email);
        fr.close();
    }
    public static String globalVariable;

    
    @And("user enter phone")
    public String phone() throws IOException {
        try {
            FileWriter fw = new FileWriter("/home/amr/Downloads/hotfix_final/fileName.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	globalVariable = phone;
    	
    	register.phone().sendKeys(phone);
    	register.phone().getAttribute(phone);
        globalVariable = phone;

        File file = new File("fileName.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("");
        fr.write(phone);
        fr.close();
    	return globalVariable;
    	
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
        register.phone().click();
    }

    @Then("user could register successfully")
    public void clickOnRegisterBtn() throws InterruptedException {Thread.sleep(5000);
        register.registerButton().click();
    }





}
