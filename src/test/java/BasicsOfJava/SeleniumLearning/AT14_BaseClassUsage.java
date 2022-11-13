package BasicsOfJava.SeleniumLearning;
import BaseClass.openBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

public class AT14_BaseClassUsage {

    @Test
    public void ExcelUsage() throws IOException, InterruptedException {
//        //setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        //we create an object of WebDriver
//        WebDriver driver = new ChromeDriver();
//        //At this point browser will be opened
//        //maximize browser
//        driver.manage().window().maximize();
//        driver.get("https://echoecho.com/htmlforms01.htm");
       // openBrowser.NavToWeb("https://echoecho.com/htmlforms01.htm");
        openBrowser.NavToWeb(ReadPropertiesFile.PropFile("echoWebsite"));
        openBrowser.CloseBrowser();
        //openBrowser.NavToWeb("https://www.google.com/");
        openBrowser.NavToWeb(ReadPropertiesFile.PropFile("googleWebsite"));
        openBrowser.QuitDriver();


    }
}