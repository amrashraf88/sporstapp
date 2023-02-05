package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutpage {
    WebDriver driver = null;

    public checkoutpage(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement  Continue_as_guest ()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-payment/div/div/div/div/div/div[1]/div/div[1]/div/button[2]"));
    }
    public WebElement   Register  ()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-payment/div/div/div/div/div/div[1]/div/div[1]/div/button[1]"));
    }
    public WebElement   login_from_checkout  ()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-payment/div/div/div/div/div/div[1]/div/div[2]/div/button"));
    }
    public WebElement first_name_guest(){
        return driver.findElement(By.xpath("//*[@id=\"mat-input-24\"]"));

    }
    public  WebElement last_name_guest()
    {
        return driver.findElement(By.xpath("//*[@id=\"mat-input-45\"]"));

    }
    public WebElement phone_guest(){
        return driver.findElement(By.xpath("//*[@id=\"mat-input-47\"]"));
    }
    public  WebElement containue_to_store_details(){
        return driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-7\"]/div/div/div[2]/button"));
    }
    public WebElement crest_address(){
        return driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-10\"]/div/div[1]/div/div/div/div[2]/span"));
    }
    public WebElement address_street(){
        return driver.findElement(By.xpath("//*[@id=\"mat-input-18\"]"));
    }
    public WebElement building(){
        return driver.findElement(By.xpath("//*[@id=\"mat-input-19\"]"));
    }
    public WebElement save_address(){
        return driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/app-add-address/div[2]/form/div/div[9]/button"));
    }
}
