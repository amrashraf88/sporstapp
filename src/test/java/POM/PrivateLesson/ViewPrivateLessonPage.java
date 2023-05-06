package POM.PrivateLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewPrivateLessonPage {
    WebDriver driver = null;

    public ViewPrivateLessonPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement AddNewPrivateLesson() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }

    public WebElement PrivateLesson() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[6]/a"));
    }

    public WebElement ViewPrivateLessonName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/h4/div/div[1]"));
    }

    public WebElement ViewClassPricePerMember() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[3]/input"));
    }

    public WebElement ClassPricePerNonMember() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[3]/input"));
    }

    public WebElement ViewWeapon() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[2]/input"));
    }

    public WebElement ViewMemberLimit() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[6]/input"));
    }

    public WebElement ViewStatues() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[7]/select"));
    }

    public WebElement ViewDiscription() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[8]/textarea"));
    }

    public WebElement ViewStartDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[4]/input"));
    }

    public WebElement ViewEndDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[5]/input"));
    }

    public WebElement ViewCoach() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[1]/input"));
    }

    public WebElement CalenderTaype() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/div[2]/select"));
    }

    public WebElement addedsuccfully(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/button[1]"));
    }
    public WebElement choosecalender(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div[2]/div[2]/div[8]/div[25]"));
    }
    public WebElement overlapbutton(){
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button[1]"));
    }
    public WebElement succefullyadded(){
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]"));
    }
}


