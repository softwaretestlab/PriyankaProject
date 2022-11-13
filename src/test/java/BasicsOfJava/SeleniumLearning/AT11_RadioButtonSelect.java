package BasicsOfJava.SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT11_RadioButtonSelect {

    @Test
    public void NavHn() throws InterruptedException {
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
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> RadioButtonsList=driver.findElements(By.cssSelector("input[name^='radio1']"));
        int RadioSize= RadioButtonsList.size();
        System.out.println("RadioSize : "+RadioSize); //3
        // here we are implementing selenium concepts isDisplayed,isSelected and also clicking on
        //first radio button
//       for(int i=0; i<RadioSize;i++){
//           //isDisplayed();
//           boolean RadiBtnDisplayed=RadioButtonsList.get(i).isDisplayed(); //true
//           System.out.println("RadiBtnDisplayed : "+RadiBtnDisplayed);
//           //isSelected
//           boolean RadioBtnSelect=RadioButtonsList.get(i).isSelected(); //false
//           System.out.println("Is RadioBtnSelect selected ? : "+RadioBtnSelect);
//           if(RadioBtnSelect==false){
//               RadioButtonsList.get(i).click();
//           }
//           break;
//       }
// here we are getting attribute value and also clicking on first radio button
        for(int i=0; i<RadioSize;i++){
            String AttVal =   RadioButtonsList.get(i).getAttribute("type"); //op-- radio
            System.out.println("AttVal :"+AttVal);
            if(AttVal.equalsIgnoreCase("radio")){
                RadioButtonsList.get(i).click();

            }
            break;
        }

    }
}