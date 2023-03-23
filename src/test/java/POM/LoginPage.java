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
    public WebElement user_name(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/input"));
    }
    public WebElement password()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[4]/input"));
    }

    public WebElement loginButton()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[6]/button"));
    }

    public WebElement forgotPassword()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[5]/a"));
    }


}
