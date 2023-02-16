package StepDefinitions;

import POM.HomePage;
import POM.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static StepDefinitions.Hooks.driver;

public class InventoryStepDefinition {
    HomePage home = new HomePage(driver);
    InventoryPage inventory = new InventoryPage(driver);


    @Given("user select pickup")
    public void Select_store(){
        inventory.SelectStore().click();
    }
    @And("user select store")
    public void  select_from_stores() throws InterruptedException {
        Thread.sleep(2000);
        inventory.StoreInventory().click();
    }
    @And("user save store")
    public void  save_store(){
        inventory.storeSave().click();
    }
    @And("user click in inventory")
    public void click_on_inventory() throws InterruptedException {
        Thread.sleep(1000);
        inventory.invventory_icon().click();
    }
    @And("user choose map")
    public void choose_map(){
        inventory.MapInventory().click();
    }
    @And("user choose current locaion")
    public void current_location(){
        inventory.currentLocation().click();
    }
    @Then("user save his current location")
    public void save_map() throws InterruptedException {
        Thread.sleep(1000);
        inventory.mapSave().click();
    }
}
