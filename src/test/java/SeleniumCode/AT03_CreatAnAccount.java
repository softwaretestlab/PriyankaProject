package SeleniumCode;

import BaseClass.openBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.Reg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT03_CreatAnAccount {

    @Test
    public static void NavToAcc() throws IOException {
        openBrowser.NavToWeb(ReadPropertiesFile.PropFile("CreateAccount"));
        //implicit wait
        openBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static void EnterAccData(String FirstName,String LastName,String EmailAddress){
       // openBrowser.driver.findElement(By.id("firstname")).clear();
        //openBrowser.driver.findElement(By.id("firstname")).sendKeys(FirstName);
        Reg.EnterFirstNameClear();
        Reg.EnterFirstName(FirstName);
        //Here we enter lastname
        //openBrowser.driver.findElement(By.id("lastname")).clear();
        //openBrowser.driver.findElement(By.id("lastname")).sendKeys(LastName);
        Reg.EnterLastNameClear();
        Reg.EnterLastName(LastName);
        //Here we enter email_address
        openBrowser.driver.findElement(By.id("email_address")).clear();
        openBrowser.driver.findElement(By.id("email_address")).sendKeys(EmailAddress);
    }
}
