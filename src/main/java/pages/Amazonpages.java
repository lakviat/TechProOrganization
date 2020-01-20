package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpages {

    public static WebDriver driver;

    public Amazonpages(){

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"nav-signin-tooltip\"]/a/span")
    public WebElement login;

    @FindBy(xpath = "")
    public WebElement username;

    @FindBy(xpath = "")
    public WebElement clicksubmitusername;

    @FindBy(xpath =  "")
    public WebElement passpassword;

    @FindBy(xpath = "")
    public WebElement clickcontinuepassword;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonSearchBox;

    @FindBy(xpath = "//a[@id='bcKwText']/span")
    public WebElement amazonSearchResult;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement amazonSearchButton;

}


