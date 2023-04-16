package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;




public class HomePage {
	String globalVariable = null;
    WebDriver driver = null;
    Actions action;
	Faker faker = new Faker();

String nphone;
    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        action = new Actions(driver);
    }
//fake name generation 
    
    public String fask_name() {
    	String name = faker.name().firstName();

        return name ;
    }
    public String fask_email() {
        String email = faker.internet().emailAddress();

        return email ;
    }
    
    // fake phone genartion
    public String fask_phone() {

        String phone1 = faker.numerify("##########");
    	 globalVariable = phone1;
    	 return phone1;
    	
    }
    //locate Register button
    public WebElement register(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[7]/a"));

    }

    //locate Login Button
    public WebElement login()
    {
        return driver.findElement(By.id("kt_sign_in_submit"));
    }
    public WebElement accept_coocks()
    {
        return driver.findElement(By.xpath("//*[@id=\"signIn\"]/button/span[1]/mat-icon"));
    }
    public String getURL()
    {
        String url = driver.getCurrentUrl();
        return url;
    }
    public WebElement profile_name(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/div/div[2]/div[2]/div/app-profile/mat-card/h4"));
    }

    public WebElement searchBox()
    {
        return driver.findElement(By.xpath("//*[@id=\"searchBar\"]"));
    }
//
    public WebElement profile()
    {
        return driver.findElement(By.xpath("//*[@id=\"userName\"]/button"));
    }
    public WebElement searchButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    }

    public void hoverOnCategory() throws InterruptedException {
        WebElement mainMenu;
        WebElement subMenu;
        //driver.navigate().to("https://demo.nopcommerce.com/");
        //Thread.sleep(2000);
        mainMenu = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[3]/div/div/embryo-menu/div/nav[2]/ul/li[2]/div[1]"));
        action.moveToElement(mainMenu).perform();

    }

    public WebElement select_category(){
        return driver.findElement(By.xpath("//*[@id=\"app-nav-list-menu2\"]/li[2]"));
    }




    }
