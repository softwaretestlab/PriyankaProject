package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static WebDriver driver;

    public static void NavToWeb(String url) {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // driver.get("https://echoecho.com/htmlforms01.htm");
        driver.get(url);
    }

    public static void CloseBrowser() {
        driver.close();
    }

    public static void QuitDriver() {
        driver.quit();
    }
}
