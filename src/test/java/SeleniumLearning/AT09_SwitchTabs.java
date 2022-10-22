package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class AT09_SwitchTabs {
    @Test
    public void SwitchTabLearn() throws InterruptedException {
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
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        //click on CustomiseMe, new tab will open
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'CustomiseMe')]")).click();
        Thread.sleep(10000);
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        int tabsize=tabs.size(); //2
        System.out.println("tabsize : "+ tabsize);
        //1st method -- right way
        for(int i=0;i<tabsize;i++){
            driver.switchTo().window(tabs.get(i)); //it will swith to main tab
            break;
        }
    }
}