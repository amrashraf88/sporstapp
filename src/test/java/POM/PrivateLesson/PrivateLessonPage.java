package POM.PrivateLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class PrivateLessonPage {
    WebDriver driver = null;

    public PrivateLessonPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement AddNewPrivateLesson() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }

    public WebElement PrivateLesson() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[6]/a"));
    }

    public WebElement PrivateLessonName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/input"));
    }

    public WebElement ClassPricePerMember() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/input"));
    }

    public WebElement ClassPricePerNonMember() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[3]/input"));
    }

    public WebElement Weapon() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[4]/select"));
    }

    public WebElement MemberLimit() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[5]/input"));
    }

    public WebElement Statues() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[6]/select"));
    }

    public WebElement Discription() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[7]/textarea"));
    }

    public WebElement StartDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div[1]/input"));
    }

    public WebElement EndDate() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div[2]/input"));
    }

    public WebElement SelectCoach() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/div[1]/select"));
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


