package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
    /*
        POM'de Driver icin TestBase class'ina extends etmek yerine
        Driver class'indan static method'lar kullanarak
        driver olusturup,ilgili ayarlarin yapilmasi
        ve en son da driver'in kapatilmasi tercih edilmistir

        POM (page object model)'de Driver class'indaki getDriver() methodunun obje olusturularak kullanilmasini
        engellemek icin
        Singleton pattern kullanimi benimsenmistir

        Singleton Pattern : tekli kullanim, bir class'in farkli class'lardan
        obje olusturularak kullanimini engellemek icin kullanilir


        Bunu saglamak icin yapmamiz gereken sey oldukca basit
        obje olusturmak icin kullanilan constructor'i private yaptigimizda
        baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ



     */

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;


                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }



        }
        return driver;
    }

    public static void closeDriver(){

        if (driver!=null) {     // driver'a deger atanmamissa driver'i kapat
            driver.close();     // sonra tekrar driver acarken sorun olmamasi icin

        }
        driver = null;      // null degerini ata

    }

    public static void quitDriver() {
    }
}
