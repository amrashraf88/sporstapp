package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;

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
    
    // fake phone genartion
    public String fask_phone() {
    	 String phone1 = faker.phoneNumber().phoneNumber();
    	 globalVariable = phone1;
    	 return phone1;
    	
    }
    //locate Register button
    public WebElement register(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/p/a"));

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
        mainMenu = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));
        action.moveToElement(mainMenu);
        subMenu = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        action.moveToElement(subMenu);
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

    public void selectEuroCurrency()
    {
        Select currency = new Select(driver.findElement(By.name("customerCurrency")));
        currency.selectByIndex(1);
    }

    public WebElement validateCurrency()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
    }
}
