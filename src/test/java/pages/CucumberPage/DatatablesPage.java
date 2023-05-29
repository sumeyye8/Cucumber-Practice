package pages.CucumberPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {

    public DatatablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[contains(text(),'New')]")
    public static WebElement newButton;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public static WebElement firstName;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public static WebElement lastName;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public static WebElement position;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public static WebElement office;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public static WebElement extn;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public static WebElement startDate;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public static WebElement salary;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public static WebElement create;

    @FindBy(xpath = "//input[@type='search']")
    public static WebElement search;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public static WebElement aramaSonucIlkElement;

}
