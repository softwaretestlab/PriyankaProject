package pages;

import BaseClass.openBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg extends openBrowser {

    @FindBy(id="firstname")
    static
    WebElement FName;
    @FindBy(id="lastname")
    static
    WebElement LName;


    public Reg(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public static void EnterFirstNameClear(){
        FName.clear();
    }
        public static void EnterFirstName(String fname){
            FName.sendKeys(fname);
        }

    public static void EnterLastNameClear(){
        LName.clear();
    }
    public static void EnterLastName(String lname){
        LName.sendKeys(lname);
    }

    }

