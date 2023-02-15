package StepDefinitions;

import POM.CategoryPage;
import POM.HomePage;
import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static StepDefinitions.Hooks.driver;


public class CategoryStepDefinition {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    CategoryPage category = new CategoryPage(driver);


    @Given("user is logged in to filter")
    public void loggedUser(){
        home.login().click();
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/amr/Downloads/hotfix_final/fileName.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dataString = data.toString();
        System.out.println(dataString);

        login.userName().sendKeys(dataString);
    }

    @When("user select category")
    public void selectCategory()
    {
        home.hoverOnCategory();
    }

    @And("user filter by color")
    public void filterByColor()
    {
        category.redColorFilter().click();
    }

    @Then("products with this attribute should be displayed")
    public void checkFiltration() throws InterruptedException {
        Thread.sleep(2000);
        boolean actualResult = category.filteredCategory().isDisplayed();
        Assert.assertEquals(true, actualResult);
    }


}
