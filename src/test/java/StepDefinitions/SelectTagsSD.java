package StepDefinitions;

import POM.CategoryPage;
import POM.HomePage;
import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static StepDefinitions.Hooks.driver;


public class SelectTagsSD {

    HomePage home = new HomePage(driver);
    CategoryPage category = new CategoryPage(driver);
    LoginPage login = new LoginPage(driver);

    @Given("user login")
    public void loginToWebsite()
    {
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

      //  login.userName().sendKeys(dataString);
    }

    @And("user choose specific category")
    public void selectCategory()
    {
        home.selectproduct().click();
    }

    @And("user select any tag")
    public void selectTag()
    {
        category.computerTag().click();
    }

    @Then("this tag page should be opened successfully")
    public void validateSuccessTag() throws InterruptedException {
        Thread.sleep(2000);
        String expectedResult = "Products tagged with \'computer\'";
        String actualResult = category.getMessageOfTag().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
