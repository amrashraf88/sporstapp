package POM.Staff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditStaffPage {
    WebDriver driver = null;

    public EditStaffPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement AddStaffButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }

    public WebElement FirstStaffName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/div[1]/input"));
    }

    public WebElement LastStaffName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/div[2]/input"));
    }

    public WebElement JobTittal() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/div[3]/select"));
    }

    public WebElement Role() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/select"));
    }

    public WebElement DOBStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/input"));
    }

    public WebElement GenderStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[2]/select"));
    }

    public WebElement SsnStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[3]/input"));
    }

    public WebElement EducationForStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[4]/select"));
    }

    public WebElement InstitionStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[5]/input"));
    }

    public WebElement PhoneStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[1]/div/div[2]/input"));
    }

    public WebElement EmailStaff() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[2]/input"));
    }

    public WebElement StreetAddress() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[1]/input"));
    }

    public WebElement State() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[2]/select"));
    }

    public WebElement City() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[3]/select"));
    }

    public WebElement ZipCode() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[4]/input"));
    }

    public WebElement MondayStart() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div[2]/div[2]/input"));
    }

    public WebElement MondayEndtime() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div[2]/div[3]/input"));
    }

    public WebElement TuesdayStart() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div[3]/div[2]/input"));
    }

    public WebElement TuesdayEndtime() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div[3]/div[3]/input"));
    }

    public WebElement Coaches_health_history() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[1]/input"));
    }

    public WebElement Carried() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[2]/input"));
    }

    public WebElement Allergies() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[3]/input"));
    }

    public WebElement EmployStatues() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/div/select"));
    }

    public WebElement PaymentMethod(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[9]/div[1]/div[2]/div/input"));
    }
    public WebElement Preferredcontactmethod() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[3]/select"));
    }

}
