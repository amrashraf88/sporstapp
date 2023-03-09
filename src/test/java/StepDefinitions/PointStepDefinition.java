//package StepDefinitions;
//
//import POM.HomePage;
//import POM.InventoryPage;
//import POM.PointPage;
//import POM.RegistrationPage;
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import static StepDefinitions.Hooks.driver;
//
//
//public class PointStepDefinition {
//
//	Faker faker = new Faker();
//   String nPhone;
//
//  InventoryPage inventory = new InventoryPage(driver);
//    HomePage home = new HomePage(driver);
//    String phone = home.fask_phone();
//
//    PointPage point = new PointPage(driver);
//
//    @Given("user navigate to registration page")
//    public void openRegistrationPag() throws InterruptedException {
//        //home.c();
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
////        try {
////            // Wait for up to 10 seconds for the element to be present and visible
////            WebElement element = new WebDriverWait(driver, Duration.ofMillis(10))
////                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div[2]/div/div[2]/div[2]")));
////
////            // If the element is present and visible, check if it's enabled and enter some text
////            if (element.isEnabled()) {
////                inventory.SelectStore().click();
////          Thread.sleep(2000);
////          inventory.StoreInventory().click();
////          Thread.sleep(3000);
////          inventory.storeSave().click();
////            } else {
////                System.out.println("Element is not enabled");
////            }
////        } catch (NoSuchElementException | TimeoutException e) {
////            System.out.println("Element not found or timed out");
////        }
////         WebElement eleinvetort_pagement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div[2]/div/div[2]/div[2]")));
////      if(invetort_page.isDisplayed()){
////          inventory.SelectStore().click();
////          Thread.sleep(2000);
////          inventory.StoreInventory().click();
////          Thread.sleep(3000);
////          inventory.storeSave().click();
////        }
////      else {
////          System.out.println("no");
////      }
//        Thread.sleep(3000);
//    	home.login().click();
//
//    	try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        home.register().click();
//    }
//
//
//
//
//    @When("user navigate to point ")
//    public void pintpage()
//    {
//        home.point().click();
//    }
//
//    @And("user check voucher")
//    public void voucher_point()
//    {
//        point.yourvoucher().click();
//    }
//
//    @And("user enter email")
//    public void enterEmail() throws IOException {
//
//    }
//
//
//
//    @And("user enter phone")
//    public String phone() throws IOException {
//
//    }
//
//
//
//
////	@Override
////	void openRegistrationPage() {
////		// TODO Auto-generated method stub	home.login().click();
////    	try {
////			Thread.sleep(9000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////        home.register().click();
////	}
//
//
//
//}
