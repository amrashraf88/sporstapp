package StepDefinitions;

import io.cucumber.java.en.Given;

abstract class RegisterStepDefinitionInterface {
	  @Given("user navigate to registration page")
	    abstract void  openRegistrationPage();
}
