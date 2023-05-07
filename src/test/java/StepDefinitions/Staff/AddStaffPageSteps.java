package StepDefinitions.Staff;

import POM.Login.LoginPage;
import POM.Staff.AddStaffPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import static StepDefinitions.Home.Hooks.driver;
import static org.junit.Assert.assertEquals;
public class AddStaffPageSteps {
    private AddStaffPage addStaffPage;
    LoginPage login = new LoginPage(driver);
    public AddStaffPageSteps() {
        this.addStaffPage = new AddStaffPage(driver);
    }

    @Given("I am on the Add Staff page")
    public void iAmOnTheAddStaffPage() throws InterruptedException {
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
        driver.get("http://3.75.100.91/staff/add-staff");
    }

    @When("I enter the first name {string}")
    public void iEnterTheFirstName(String firstName) {
        addStaffPage.FirstStaffName().sendKeys(firstName);
    }

    @And("I enter the last name {string}")
    public void iEnterTheLastName(String lastName) {
        addStaffPage.LastStaffName().sendKeys(lastName);
    }

    @And("I select the Job Title {string}")
    public void iSelectTheJobTitle(String jobTitle) {
        Select selectJobTitle = new Select(addStaffPage.JobTittal());
        selectJobTitle.selectByVisibleText(jobTitle);
    }

    @And("I select the Role {string}")
    public void iSelectTheRole(String role) throws InterruptedException {
        Thread.sleep(1000);
        addStaffPage.Role().click();
        Select selectRole = new Select(addStaffPage.Role());
        selectRole.selectByVisibleText(role);
    }

    @And("I enter the date of birth {string}")
    public void iEnterTheDateOfBirth(String dob) {
        addStaffPage.DOBStaff().sendKeys(dob);
    }

    @And("I select the gender {string}")
    public void iSelectTheGender(String gender) {
        Select selectGender = new Select(addStaffPage.GenderStaff());
        selectGender.selectByVisibleText(gender);
    }

    @And("I enter the SSN {string}")
    public void iEnterTheSSN(String ssn) {
        addStaffPage.SsnStaff().sendKeys(ssn);
    }

    @And("I select the Education {string}")
    public void iSelectTheEducation(String education) {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Select selectEducation = new Select(addStaffPage.EducationForStaff());
        selectEducation.selectByVisibleText(education);
    }

    @And("I enter the institution {string}")
    public void iEnterTheInstitution(String institution) {
        addStaffPage.InstitionStaff().sendKeys(institution);
    }

    @And("I enter the phone number {string}")
    public void iEnterThePhoneNumber(String phoneNumber) {
        addStaffPage.PhoneStaff().sendKeys(phoneNumber);
    }

    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String emailAddress) {
        addStaffPage.EmailStaff().sendKeys(emailAddress);
    }

    @And("I select the preferred contact method {string}")
    public void iSelectThePreferredContactMethod(String preferredContactMethod) {
        Select selectPreferredContactMethod = new Select(addStaffPage.Preferredcontactmethod());
        selectPreferredContactMethod.selectByVisibleText(preferredContactMethod);
    }
    @And("I enter Street address {string}")
    public void iEnterStreetAddress(String StreetAddress) {
       addStaffPage.StreetAddress().sendKeys(StreetAddress);

    }
    @And("I select state {string}")
    public void iSelectState(String state) {
        addStaffPage.State().sendKeys(state);

    }
    @And("I select city {string}")
    public void iSelectcity(String city) {
        addStaffPage.City().sendKeys(city);

    }
    @And("I enter ZipCode {string}")
    public void iEnterZipCode(String ZipCode) {
        addStaffPage.ZipCode().sendKeys(ZipCode);
    }

    @And("I enter Monday work hours")
    public void iEnterMondayWorkHours() {
        try {
            WebElement mondayStart = addStaffPage.MondayStart();
            WebElement mondayEnd = addStaffPage.MondayEndtime();
            mondayStart.sendKeys("10:00");
            mondayEnd.sendKeys("18:00");
        } catch (NoSuchElementException e) {
            // Handle case where the elements are not present on the page
            throw new RuntimeException("Monday start or end time element not found", e);
        } catch (Exception e) {
            // Handle any other exceptions that may occur during the sendKeys() method
            throw new RuntimeException("Error entering Monday work hours", e);
        }
    }
    @And("I enter Coaches' health history {string}")
    public void iEnterCoashHealh(String CoashHealh) {
        addStaffPage.Coaches_health_history().sendKeys(CoashHealh);
    }
    @And("I enter Allergies {string}")
    public void iEnterCAllergies(String Allergies) {
        addStaffPage.Allergies().sendKeys(Allergies);
    }
    @And("I enter Carried medications {string}")
    public void iEnterCarriedmedications(String Carriedmedications) {
        addStaffPage.Carried().sendKeys(Carriedmedications);
    }
    @And("I enter Employment status {string}")
    public void iEnterEmploymentstatus(String Employmentstatus) {
        addStaffPage.EmployStatues().sendKeys(Employmentstatus);
    }
    @And("I Choose payment")
    public void ichoosePayment() {
        addStaffPage.PaymentMethod().click();
    }

    @And("I click on the Add Staff button")
    public void iClickOnTheAddStaffButton() {
            addStaffPage.AddStaffButton().click();
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//span[contains(text(),'" + expectedMessage + "')]")).getText();
        assertEquals(expectedMessage, actualMessage);
    }
}