package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignmember {

    WebDriver driver = null;
    Actions action;
    public Assignmember(WebDriver driver)
    {
        this.driver = driver;
        action = new Actions(driver);
    }

    public WebElement AssignMemberbutton(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/form/div[1]/div[1]/div[2]/a"));
    }
    public WebElement TypeOfassign(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/select"));
    }
    public WebElement Allprivetlesson(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[3]/select"));
    }
    public WebElement StartDateOfAssignMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[1]/input"));
    }
    public WebElement EndDataAssignMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[2]/input"));
    }
    public WebElement CalenderType(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[3]/div[1]/div/select"));
    }
}
