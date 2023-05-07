package StepDefinitions.Staff;

import POM.Login.LoginPage;
import POM.Staff.AddStaffPage;
import POM.Staff.EditStaffPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import static StepDefinitions.Home.Hooks.driver;
import static org.junit.Assert.assertEquals;
public class EditStaffPageSteps {
    private EditStaffPage editStaffPage;
    private LoginPage loginPage;
    LoginPage login = new LoginPage(driver);
    public EditStaffPageSteps() {
        this.editStaffPage = new EditStaffPage(driver);
        this.loginPage = new LoginPage(driver);
    }

    @Given("I am on the Edit Staff page")
    public void iAmOnTheEditStaffPage() throws InterruptedException {
        Thread.sleep(2000);
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
        driver.get("http://3.75.100.91/staff/profile/1/edit");
    }

    @When("I select the staff member to edit")
    public void iSelectTheStaffMemberToEdit() {
        // implementation goes here
    }

    @And("I update the first name to {string}")
    public void iUpdateTheFirstName(String firstName) {
        editStaffPage.FirstStaffName().sendKeys(firstName);
    }

    @And("I update the last name to {string}")
    public void iUpdateTheLastName(String lastName) {
        editStaffPage.LastStaffName().sendKeys(lastName);;
    }

    @And("I update the Job Title to {string}")
    public void iUpdateTheJobTitle(String jobTitle) {
        Select selectJobTitle = new Select(editStaffPage.JobTittal());
        selectJobTitle.selectByVisibleText(jobTitle);
    }

    @And("I update the Role to {string}")
    public void iUpdateTheRole(String role) {
        Select selectRole = new Select(editStaffPage.Role());
        selectRole.selectByVisibleText(role);
    }

    @And("I update the date of birth to {string}")
    public void iUpdateTheDateOfBirth(String dob) {
        editStaffPage.DOBStaff().sendKeys(dob);
    }

    @And("I update the gender to {string}")
    public void iUpdateTheGender(String gender) {
        Select selectGender = new Select(editStaffPage.GenderStaff());
        selectGender.selectByVisibleText(gender);
    }

    @And("I update the SSN to {string}")
    public void iUpdateTheSSN(String ssn) {
        editStaffPage.SsnStaff().sendKeys(ssn);
    }

    @And("I update the Education to {string}")
    public void iUpdateTheEducation(String education) {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Select selectEducation = new Select(editStaffPage.EducationForStaff());
        selectEducation.selectByVisibleText(education);
    }

    @And("I update the institution to {string}")
    public void iUpdateTheInstitution(String institution) {
        editStaffPage.InstitionStaff().sendKeys(institution);
    }

    @And("I update the phone number to {string}")
    public void iUpdateThePhoneNumber(String phoneNumber) {
        editStaffPage.PhoneStaff().sendKeys(phoneNumber);
    }

    @And("I update the email address to {string}")
    public void iUpdateTheEmailAddress(String emailAddress) {
        editStaffPage.EmailStaff().sendKeys(emailAddress);
    }

    @And("I update the preferred contact method to {string}")
    public void iUpdateThePreferredContactMethod(String preferredContactMethod) {
        Select selectPreferredContactMethod = new Select(editStaffPage.Preferredcontactmethod());
        selectPreferredContactMethod.selectByVisibleText(preferredContactMethod);
    }

    @And("I update the street address to {string}")
    public void iUpdateTheStreetAddress(String streetAddress) {
        editStaffPage.StreetAddress().sendKeys(streetAddress);
    }

    @And("I update the state to {string}")
    public void iUpdateTheState(String state) {
        editStaffPage.State().sendKeys(state);
    }

    @And("I update the city to {string}")
    public void iUpdateTheCity(String city) {
        editStaffPage.City().sendKeys(city);
    }

    @And("I update the zip code to {string}")
    public void iUpdateTheZipCode(String zipCode) {
        editStaffPage.ZipCode().sendKeys(zipCode);
    }

    @And("I update the work hours for Monday")
    public void iUpdateTheWorkHoursForMonday() {
        try{
        WebElement mondayStart = editStaffPage.MondayStart();
        WebElement mondayEnd = editStaffPage.MondayEndtime();
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

    @And("I update the coaches' health history to {string}")
    public void iUpdateTheCoachesHealthHistory(String coachesHealthHistory) {
        editStaffPage.Coaches_health_history().sendKeys(coachesHealthHistory);
    }

    @And("I update the allergies to {string}")
    public void iUpdateTheAllergies(String allergies) {
        editStaffPage.Allergies().sendKeys(allergies);
    }

    @And("I update the carried medications to {string}")
    public void iUpdateTheCarriedMedications(String carriedMedications) {
        editStaffPage.Carried().sendKeys(carriedMedications);
    }

    @And("I update the employment status to {string}")
    public void iUpdateTheEmploymentStatus(String employmentStatus) {
        editStaffPage.EmployStatues().sendKeys(employmentStatus);
    }

    @And("I update the payment method")
    public void iUpdateThePaymentMethod() {
        editStaffPage.PaymentMethod().click();
    }

    @And("I click on the Update Staff button")
    public void iClickOnTheUpdateStaffButton() {
        editStaffPage.AddStaffButton().click();
    }

//    @Then("I should see the success message {string}")
//    public void iShouldSeeTheSuccessMessage(String expectedMessage) {
//        String actualMessage = editStaffPage
//        assertEquals(expectedMessage, actualMessage);
//    }
}