package SeleniumCode;

import BaseClass.openBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateNassert {

    @Test
    public static void NavHn() throws IOException {
        openBrowser.NavToWeb(ReadPropertiesFile.PropFile("HomePageUrl"));
        // implicit wait
        openBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public static void AsserTitle(){
        //get title
        String ActualTitle = openBrowser.driver.getTitle();
        System.out.println("HNTitle : "+ActualTitle);
        String ExpectedTitle = "Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }
}
