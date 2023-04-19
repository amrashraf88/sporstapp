package POM.Member;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberPage {
    WebDriver driver = null;

    public MemberPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement MemberPag(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[4]"));
    }
    public WebElement AddNewMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div/div[2]/a"));
    }
    public WebElement ExportMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div[1]/div/button[2]/span/svg"));
    }
    public WebElement importMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div[1]/div/button[1]/span/svg"));
    }
    public WebElement MemberDetails(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[1]"));
    }
    public WebElement EditMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/a"));
    }
    public WebElement searchMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/div[1]/input"));
    }
    public WebElement SeachButton(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/div[2]"));
    }
    public WebElement AdvancedButton(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div/a"));
    }
    public WebElement MemberIDSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/input"));
    }
    public WebElement firstnamesearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div/input"));
    }
    public WebElement LastnameSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[2]/div/input"));
    }
    public WebElement MemberShipTypeSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[3]/div/select"));
    }
    public WebElement phoneNumberSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[4]/div/input"));
    }
    public WebElement EmailSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[5]/div/input"));
    }
    public WebElement SubscriptionSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[6]/div/select"));
    }
    public WebElement WeaponSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[7]/div/select"));
    }
    public WebElement CoachesSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[8]/div/div/div"));
    }
   public WebElement StatusSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[9]/div/select"));
   }
   public WebElement SearchButtonAdvanced(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[10]/button[1]"));
   }
   public WebElement BackFromSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div[10]/button[2]"));
   }
   public WebElement Facebookpost(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div/div[1]/div/input"));
   }
   public WebElement FacebookAds(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div/div[2]/div/input"));
   }
   public WebElement GoogleSearch(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div/div[3]/div/input"));
   }
   public WebElement GoogleAds(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div/div[4]/div/input"));
   }
   public WebElement Friends(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div/div[5]/div/input"));
   }
   public WebElement Other(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div/div[6]/div/input"));
   }
   public WebElement FirstName(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/input"));
   }
   public WebElement LastName(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[2]/input"));
   }
   public WebElement MemberShipType(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/div[1]/select"));
   }
   public WebElement AdultName(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/div[2]/input"));
   }
   public WebElement RealationShip(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/div[3]/select"));
   }
   public WebElement DOB(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[1]/input"));
   }
   public WebElement Gender(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[2]/select"));
   }
   public WebElement Grade(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[3]/input"));
   }
   public WebElement School(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[4]/input"));
   }
   public WebElement CellPhoneNumber(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[1]/div/div[2]/input"));
   }
   public WebElement Email(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[2]/input"));
   }
   public WebElement PreferredContactMethod(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[3]/select"));
   }
   public WebElement Whatsapp(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[4]/div/div[2]/input"));
   }
   public WebElement FBMassenger(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[5]/input"));
   }
    public WebElement GoogleDue(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[6]/input"));
    }
    public WebElement StreetAddress(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[1]/input"));
    }
    public WebElement City(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[3]/select"));
    }
    public WebElement State(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[2]/select"));
    }
    public WebElement ZipCode(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[6]/div/div[4]/input"));
    }
    public WebElement MemberhealthHistory(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div/div[1]/input"));
    }
    public WebElement Carriedmedications(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div/div[2]/input"));
    }
    public WebElement Allergies(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[7]/div/div[3]/input"));
    }
    public WebElement CreditCard(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[9]/div/div[1]/div/input"));
    }
    public WebElement Check(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[9]/div/div[1]/div/input"));
    }
    public WebElement Cash(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[9]/div/div[3]/div/input"));
    }
    public WebElement SubmitSaveMember(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[10]/buttonÏ"));
    }
    public WebElement Ismember(){
        try {
            return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[2]/div/div/div/div"));
        }catch (Exception e){
            return null;
        }
    }
    public WebElement Weapon(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/div[1]/select"));
    }
    public WebElement editweapon(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/div[2]/select"));
    }
    public WebElement Statues(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/div[2]/select"));
    }
    public WebElement editstatues(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/div[3]/select"));
    }
    public WebElement package_id(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[8]/div/div[3]/select"));
    }
    public WebElement SaveButton(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[10]/button"));
    }
    public WebElement successfull(){
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h2"));
    }
//======================================== element of validation message ===========================================================
    public WebElement ValiadtionFirstName(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/div/span"));
    }
    public WebElement ValidationLastName(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[2]/div/div[2]/div"));
    }

    public WebElement ValidationAdultName(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/div[2]/div"));
    }
    public WebElement ValidationRelationship(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[3]/div[1]/div[3]/div"));
    }
    public WebElement ValidationDOB(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[1]/div"));
    }
    public WebElement validationGrad(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[3]/div"));
    }
    public WebElement ValidationSchool(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[4]/div/div[4]/div"));
    }
    public WebElement ValidationCellPhone(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[1]/div[2]"));
    }
    public WebElement ValidationEmail(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/div[2]/div"));
    }


}
