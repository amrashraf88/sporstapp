package POM.Camps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CampsPage {
    WebDriver driver = null;

    public CampsPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public WebElement CampsPage()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[7]"));
    }

    public WebElement AddNewCamps()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }
    public WebElement CampsName(){
        return driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div[2]/form/div[1]/div[1]/input"));
    }
    public WebElement CampsLocation(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/input"));
    }
    public WebElement  PricePerDay(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/input"));
    }
    public WebElement  Weapon(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/select"));
    }

    public WebElement CampDescription(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/textarea"));
    }

    public WebElement CampStartDate(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div[1]/div[1]/input"));
    }
    public WebElement CampEndDate(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div[1]/div[2]/input"));
    }

    public WebElement CampMinMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/input"));
    }
    public WebElement CampMaxMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/input"));
    }
    public WebElement CampLevel(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/select"));
    }
    public WebElement Statues(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/select"));
    }
    public WebElement MainCoach(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div[2]/div[1]/select"));
    }
    public WebElement Duration(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div[2]/div[2]/input"));
    }
    public WebElement CalenderType(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div[3]/div[1]/div/select"));
    }
    public WebElement CalenderSlots(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div[3]/div[2]/div[2]/div[2]/div[4]/div[25]"));
    }
    public WebElement SubmitCamp(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/button"));
    }

}
