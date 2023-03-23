package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class RegistrationPage {
	WebDriver driver = null;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement ClubName(){
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[1]/div/input"));
	}
	public WebElement DominName(){
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[2]/div/input"));
	}
	public WebElement firstName() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[3]/div/input"));
	}

	public WebElement lastName() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[4]/div/input"));
	}

	public WebElement email() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[5]/div/input"));
	}

	public WebElement phone() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[6]/div/div/div[2]/input"));
		
	}

	public WebElement password() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[7]/div/div[1]/div[1]/input"));
	}

	public WebElement confirmPassword() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/div[8]/div/input"));
	}


	public WebElement registerButton() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[5]/button"));
	}

}
