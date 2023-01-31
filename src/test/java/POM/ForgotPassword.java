package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
    WebDriver driver = null;

    public ForgotPassword(WebDriver driver)
    {
        this.driver = driver;
    }
   
    public WebElement emailAddress()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/form/div[1]/mat-form-field/div/div[1]/div/input"));
    }

    public WebElement recoverButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/form/button"));
    }

    public WebElement getRecoverMessage()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/div"));
    }
}
