package POM.GroupClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewGroup {
    WebDriver driver = null;
    public AddNewGroup(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SearchById(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/input"));
    }
    public WebElement ClickOnSearchButton(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/div[2]"));

    }
    public WebElement ImportGroupClass() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div/div/button[1]/span/svg"));
    }
    public WebElement ExportGroupClass() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div/div/button[2]/span/svg"));

    }

    public WebElement AddNewGroup() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }

    public WebElement AddGroupClassName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/input"));
    }
    public WebElement AddMemberPricePerClass() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/input"));
    }
    public WebElement AddNonMemberPricePerClass() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[3]/input"));
    }
    public WebElement SelectWeapon() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[4]/select"));
    }
    public WebElement AddMinNumberOfMembers() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[5]/input"));
    }
    public WebElement AddMaxNumberOfMembers() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[6]/input"));
    }
    public WebElement AddLocation() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[7]/input"));
    }
    public WebElement SelectLevel() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[8]/select"));
    }
    public WebElement SelectStatus() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[9]/select"));
    }
    public WebElement AddDescription() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[10]/textarea"));
    }
    public WebElement SelectStartDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div[1]/input"));
    }
    public WebElement SelectEndDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div[2]/input"));
    }
    public WebElement SelectMainCoach() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/div[1]/select"));
    }
    public WebElement SelectCalendarType() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/div[2]/select"));
    }
    public WebElement ClickSubmit() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]"));
    }
    public WebElement ClickReset() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/button[2]/span"));
    }

}

