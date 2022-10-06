package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {
    @Test
    public void LocLearn() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
// opens chrome browser
        // driver object created
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        // enter url and navigate to website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
    // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //by id
        driver.findElement(By.id("regAddForm_firstName")).sendKeys("FristName");
        //by name
        driver.findElement(By.name("lastName")).sendKeys("lastName");
        //by link text
        driver.findElement(By.linkText("Catalogues")).click();

    }

}
