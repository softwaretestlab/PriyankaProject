package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void NavHn() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
// opens chrome browser
        // driver object created
        WebDriver driver = new ChromeDriver();
        //maximize browser
         driver.manage().window().maximize();
         // enter url and navigate to website
        driver.get("https://www.thegoodguys.com.au/");
        //get title
        String ActualTitle = driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        //Assertion-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion-2
        Assert.assertTrue(ActualTitle.contains("Electrical"));

        //Screenshot -- please give ur path here
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.png"));
    }
}

