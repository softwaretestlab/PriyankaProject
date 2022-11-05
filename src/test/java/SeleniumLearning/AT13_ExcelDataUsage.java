package SeleniumLearning;
import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.Xls_Reader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AT13_ExcelDataUsage {

    @Test
    public void ExcelUsage() throws IOException, InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        driver.get("https://echoecho.com/htmlforms01.htm");
        //location of the excel workbook
//        Xls_Reader reader = new Xls_Reader("C:\\Users\\softw\\IdeaProjects\\PriyankaProject01\\src\\main\\java\\Resources\\EchoEcho.xlsx");
        Xls_Reader reader = new Xls_Reader(ReadPropertiesFile.PropFile("ExcelDataReader"));
        //count of rows in the excel sheet
        int rowcount=reader.getRowCount("RegTestData");
        System.out.println("rowcount :"+rowcount);
        for(int i=2;i<=rowcount;i++) {
            String UserName = reader.getCellData("RegTestData","UserName",i);
            System.out.println("UserName : "+UserName);
            String Pass = reader.getCellData("RegTestData","Password",i);
            System.out.println("password : "+Pass);

            //username
            driver.findElement(By.xpath("//input[@name='un']")).clear();
            driver.findElement(By.xpath("//input[@name='un']")).sendKeys(UserName);
            //password
            driver.findElement(By.xpath("//input[@name='pw']")).clear();
            driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(Pass);
            //Click on submit button
            driver.findElement(By.xpath("//input[@name='submit']")).click();

            //confirmation message for sucessfull account creation
            String ConfirmationMessage = driver.findElement(By.xpath("//*[@id='main-message']/h1")).getText();
            System.out.println("ConfirmationMessage : " + ConfirmationMessage);
            reader.setCellData("RegTestData","Result",i,ConfirmationMessage);


            Thread.sleep(10000);
            driver.navigate().back();
            Thread.sleep(10000);
        }

    }
}