package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT03_XpathLearning {
    @Test
    public void xpath() throws InterruptedException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.harveynorman.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //xpath version-1
        driver.findElement(By.xpath("//a[@href='https://www.harveynorman.com.au/gift-cards']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//span[contains(text(),'Store finder')]")).click();

      //  driver.findElement(By.xpath("//a[@ href='https://www.harveynorman.com.au/customer/account/login' and @class='hidden-xs']"))

    }
}
