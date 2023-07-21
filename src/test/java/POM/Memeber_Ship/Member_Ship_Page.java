package POM.Memeber_Ship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Member_Ship_Page {
    WebDriver driver = null;
    public Member_Ship_Page(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement Add_New_Member_ship(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }
    public WebElement search_button(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/div[2]/button"));
    }
    public WebElement Advanced_search(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/a"));
    }
    public WebElement search_field(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement id_search_ad(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/input"));
    }

}
