package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.*;
import java.util.Scanner;

public class LoginPage {

    WebDriver driver = null;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
//
    public WebElement accept_cookie()
    {
        return driver.findElement(By.xpath("//*[@id=\"cookieNotice\"]/div[3]/div/div/button"));
    }

    public WebElement password()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[2]/mat-form-field/div/div[1]/div[1]/input"));
    }

    public WebElement loginButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/button"));
    }

    public WebElement forgotPassword()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[3]/a"));
    }



}
