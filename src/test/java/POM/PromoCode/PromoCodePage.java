package POM.PromoCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromoCodePage {
    WebDriver driver = null;

    public PromoCodePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement AddNewPromocod() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[1]/div[2]/a"));
    }

    public WebElement first_promo() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[1]"));
    }

    public WebElement PromoCodeName() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[1]/input"));
    }

    public WebElement promocodeType() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div[2]/select"));
    }

    public WebElement PromocodeDiscountAmount() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/input"));
    }

    public WebElement MaxNumberOfuser() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/input"));
    }

    public WebElement MaxAmountOfDiscount() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/input"));
    }

    public WebElement SelectedPackage() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[2]/select"));
    }

    public WebElement StartData() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div[1]/input"));
    }

    public WebElement EndData() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div[2]/input"));
    }

    public WebElement Statues() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div[1]/select"));
    }

    public WebElement PromocodePerecentage() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/input"));
    }

    public WebElement NewCustomer() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div[2]/input"));
    }

    public WebElement SubmitButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/button"));
    }

    public WebElement RestButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div/button"));
    }

    public WebElement PromoPage() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[14]/a"));
    }

    public WebElement FirstpromoForedit() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[1]"));
    }

    public WebElement editpromo() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/a"));
    }
    public WebElement addedsuccfully(){
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]"));
    }


}
