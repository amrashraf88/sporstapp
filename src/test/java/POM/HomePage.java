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
    InventoryPage inventory = new InventoryPage(driver);
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
    	 String phone1 = faker.phoneNumber().phoneNumber();
    	 globalVariable = phone1;
    	 return phone1;
    	
    }
    //locate Register button
    public WebElement register(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[1]/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/p/a"));

    }

    //locate Login Button
    public WebElement login()
    {
        return driver.findElement(By.xpath("//*[@id=\"signIn\"]/button/span[1]/mat-icon"));
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

    public void hoverOnCategory()
    {
        WebElement mainMenu;
        WebElement subMenu;
        //driver.navigate().to("https://demo.nopcommerce.com/");
        //Thread.sleep(2000);
        mainMenu = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[3]/div/div/embryo-menu/div/nav/ul/li[2]/div[1]/a/span"));
        action.moveToElement(mainMenu).perform();
        subMenu = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[3]/div/div/embryo-menu/div/nav/ul/li[2]/div[2]/div[1]/ul/li[1]/div/div/ul/li[1]"));
        action.moveToElement(subMenu).perform();
        action.click().build().perform();
    }

    public WebElement selectproduct()
    {

        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-hometwo/div/div/app-home-sections/div/div[5]/div[2]/div/div/div[2]/div/div/swiper/div[3]/div[3]/app-updated-product-card/mat-card/mat-card-content/div[4]/p"));
    }

    public WebElement cartPageButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"headerCart\"]/span[1]/mat-icon"));
    }

        public WebElement faverote(){
                return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[2]/div/div/div[4]/div/embryo-wishlist/button/span[1]/mat-icon"));
        }
        public WebElement compare(){
                return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[2]/div/div/div[4]/div/app-compare-list-menu/button/span[1]/mat-icon"));
        }
        public WebElement wallet(){
                return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[2]/div/div/div[4]/div/app-wallet-list-menu/button/span[1]/mat-icon"));
        }
        public WebElement point(){
                return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[2]/div/div/div[4]/div/app-stars-list-menu/button/span[1]/mat-icon"));
        }
        public WebElement notifacation(){
                return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/headertwo/mat-toolbar/mat-toolbar-row[2]/div/div/div[4]/div/app-notification-list-menu/button/span[1]/mat-icon"));
        }
    public void c() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        try {
            // Wait for up to 10 seconds for the element to be present and visible
            WebElement element = new WebDriverWait(driver, Duration.ofMillis(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div[2]/div/div[2]/div[2]")));

            // If the element is present and visible, check if it's enabled and enter some text
            if (element.isEnabled()) {
                inventory.SelectStore().click();
                Thread.sleep(2000);
                inventory.StoreInventory().click();
                Thread.sleep(3000);
                inventory.storeSave().click();
            } else {
                System.out.println("Element is not enabled");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            System.out.println("Element not found or timed out");
        }

    }
}
