package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Amazonpages;
import utilities.Driver;

public class Selenium {

    Amazonpages amz = new Amazonpages();


    public static void main(String[] args) {
      Driver.getDriver().get("www.azmaon.com");

      Driver.getDriver().findElement(By.xpath("amz.amazonSearchBox")).sendKeys();




    }
}
