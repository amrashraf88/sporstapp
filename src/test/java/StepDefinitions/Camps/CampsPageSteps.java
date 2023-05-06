package StepDefinitions.Camps;

import POM.Login.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import POM.Camps.*;
import org.openqa.selenium.support.ui.Select;

import static StepDefinitions.Home.Hooks.driver;
import static org.junit.Assert.assertEquals;

public class CampsPageSteps {
	private CampsPage campsPage;
	LoginPage login = new LoginPage(driver);
	public CampsPageSteps() {
		// Initialize the driver and CampsPage object
		this.campsPage = new CampsPage(driver);
	}

	@Given("I am on the Camps page")
	public void iAmOnTheCampsPage() throws InterruptedException {
		// Navigate to the Camps page
		Thread.sleep(2000);
		login.user_name().clear();
		login.user_name().clear();
		login.user_name().sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		login.user_name().sendKeys("");
		login.password().click();
		login.password().clear();
		login.password().sendKeys("");
		login.loginButton().click();
		Thread.sleep(2000);
		driver.get("http://3.75.100.91/camps");
	}

	@When("I click on the Add New Camp button")
	public void iClickOnTheAddNewCampButton() {
		// Click on the Add New Camp button
		campsPage.AddNewCamps().click();
	}

	@And("I enter the Camp Name {string}")
	public void iEnterTheCampName(String campName) {
		// Enter the Camp Name
		campsPage.CampsName().sendKeys(campName);
	}

	@And("I enter the Camp Location {string}")
	public void iEnterTheCampLocation(String campLocation) {
		// Enter the Camp Location
		campsPage.CampsLocation().sendKeys(campLocation);
	}

	@And("I enter the Price Per Day {string}")
	public void iEnterThePricePerDay(String pricePerDay) {
		// Enter the Price Per Day
		campsPage.PricePerDay().sendKeys(pricePerDay);
	}

	@And("I select the Weapon {string}")
	public void iSelectTheWeapon(String weapon) throws InterruptedException {
		// Select the Weapon
		Thread.sleep(2000);
		campsPage.Weapon().click();
		Select dropdown = new Select(campsPage.Weapon());
		dropdown.selectByVisibleText(weapon);
	}

	@And("I enter the Camp Description {string}")
	public void iEnterTheCampDescription(String campDescription) {
		// Enter the Camp Description
		campsPage.CampDescription().sendKeys(campDescription);
	}

	@And("I enter the Camp Start Date {string}")
	public void iEnterTheCampStartDate(String campStartDate) {
		// Enter the Camp Start Date
		campsPage.CampStartDate().sendKeys(campStartDate);
	}

	@And("I enter the Camp End Date {string}")
	public void iEnterTheCampEndDate(String campEndDate) {
		// Enter the Camp End Date
		campsPage.CampEndDate().sendKeys(campEndDate);
	}

	@And("I enter the Camp Min Member {string}")
	public void iEnterTheCampMinMember(String campMinMember) {
		// Enter the Camp Min Member
		campsPage.CampMinMember().sendKeys(campMinMember);
	}

	@And("I enter the Camp Max Member {string}")
	public void iEnterTheCampMaxMember(String campMaxMember) {
		// Enter the Camp Max Member
		campsPage.CampMaxMember().sendKeys(campMaxMember);
	}

	@And("I select the Camp Level {string}")
	public void iSelectTheCampLevel(String campLevel) {
		// Select the Camp Level
		Select dropdown = new Select(campsPage.CampLevel());
		dropdown.selectByVisibleText(campLevel);
	}

	@And("I select the Statues {string}")
	public void iSelectTheStatues(String statues) {
		// Select the Statues
		Select dropdown = new Select(campsPage.Statues());
		dropdown.selectByVisibleText(statues);
	}

	@And("I select the Main Coach {string}")
	public void iSelectTheMainCoach(String mainCoach) {
		// Select the Main Coach
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		Select dropdown = new Select(campsPage.MainCoach());
		dropdown.selectByVisibleText(mainCoach);
	}

	@And("I enter the Duration {string}")
	public void iEnterTheDuration(String duration) throws InterruptedException {
		// Enter the Duration
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,700)");
		Thread.sleep(1000);
		campsPage.Duration().sendKeys("10");
	}

	@And("I select the Calender Type {string}")
	public void iSelectTheCalenderType(String calenderType) {
		// Select the Calender Type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		campsPage.CalenderType().click();
		Select dropdown = new Select(campsPage.CalenderType());
		dropdown.selectByVisibleText(calenderType);

	}
	@And("I choose from Calender")
	public void iChooseTheCalender() throws InterruptedException {
		// Select the Calender Type
		Thread.sleep(2000);
	campsPage.CalenderSlots().click();
	}
	@And("I click on the Submit Camp button")
	public void iClickOnTheSubmitCampButton() {
		// Click on the Submit Camp button
		campsPage.SubmitCamp().click();
	}

	@Then("I should see the success message {string}")
	public void iShouldSeeTheSuccessMessage(String expectedMessage) {
		// Verify the success message is displayed
		WebElement successMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]"));
		String actualMessage = successMessage.getText();
		assertEquals(expectedMessage, actualMessage);
	}
}