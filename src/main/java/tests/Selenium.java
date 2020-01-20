package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Amazonpages;
import utilities.Config;
import utilities.Driver;

public class Selenium {

    static Amazonpages amz = new Amazonpages();

    public static void main(String[] args)  {

        Driver.getDriver().get("https://www.google.com");

        Driver.getDriver().get("https://amazon.com");


//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");
//
//        try {
//            Thread.sleep(1000);
//        }catch (Exception e){
//
//        }
//
//
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
//
//        amz.login.click();
//        amz.username.sendKeys(Config.getProperty("username"));
//        amz.passpassword.sendKeys(Config.getProperty("password"));


    }
}
