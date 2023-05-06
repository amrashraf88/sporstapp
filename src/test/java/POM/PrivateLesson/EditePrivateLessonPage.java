package POM.PrivateLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditePrivateLessonPage {
    WebDriver driver = null;

    public EditePrivateLessonPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement EditePrivateLesson() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/a"));
    }



    public WebElement EditPrivateLessonName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/input"));
    }

    public WebElement EditClassPricePerMember() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[3]/input"));
    }

    public WebElement EditClassPricePerNonMember() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[3]/input"));
    }

    public WebElement EditWeapon() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[4]/select"));
    }

    public WebElement EditMemberLimit() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[5]/input"));
    }

    public WebElement EditStatues() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[8]/select"));
    }

    public WebElement EditDiscription() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[9]/textarea"));
    }

    public WebElement EditStartDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[6]/input"));
    }

    public WebElement EditEndDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[7]/input"));
    }

    public WebElement EditeCoach() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/select"));
    }


    public WebElement addedsuccfully(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/button[1]"));
    }


    public WebElement succefullyadded(){
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]"));
    }
}


