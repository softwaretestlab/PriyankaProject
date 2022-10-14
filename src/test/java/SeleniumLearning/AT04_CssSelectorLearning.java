package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT04_CssSelectorLearning {

    @Test
    public void css() {

        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
       // verify if i am on right page
        String PageName_Actual=driver.findElement(By.xpath("//h1[contains(text(),' Create an Account')]")).getText();
        Assert.assertTrue(PageName_Actual.contains("Create an Account"));
        //enter data into firstname field
        driver.findElement(By.cssSelector("input[name^='fir']")).sendKeys("test");

    }
}