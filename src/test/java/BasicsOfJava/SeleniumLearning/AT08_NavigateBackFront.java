package BasicsOfJava.SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


    public class AT08_NavigateBackFront {
        @Test
        public void NavToFro() throws InterruptedException {
            //setting up chromedriver
            WebDriverManager.chromedriver().setup();
            //options
            ChromeOptions chromeOptions = new ChromeOptions();
            //we create an object of WebDriver
            WebDriver driver = new ChromeDriver(chromeOptions);
            //At this point browser will be opened
            //maximize browser
            driver.manage().window().maximize();
            //Navigate to HN website
            driver.get("https://echoecho.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //click on tutorials link on homepage
            driver.findElement(By.xpath("//big/a[contains(text(),'Tutorials') and @href='school.htm']")).click();
            Thread.sleep(10000);
            driver.navigate().back();
            Thread.sleep(10000);
            driver.navigate().forward();

        }
}
