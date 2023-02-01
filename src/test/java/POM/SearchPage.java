package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    WebDriver driver = null;

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement appleProduct()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/div/div/div/div[2]/embryo-productgrid/div/div[1]/mat-card/div[1]/mat-card-content/div[1]"));
    }


}
