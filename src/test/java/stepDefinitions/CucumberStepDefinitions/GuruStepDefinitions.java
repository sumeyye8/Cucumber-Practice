package stepDefinitions.CucumberStepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CucumberPage.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage=new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi= guruPage.baslikListesi;

        // listemiz webelementlerden olusuyor
        // dolayisiyla bu webelementlerden hangisi
        // istenen sutun basligini tasiyor bilemeyiz

        int istenenBaslikIndexi=-3; // listeden gelen index hicbir zaman eksi olmaz o yuzden -3'u flag gibi kullandik
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if(tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }
        }

        // for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastirdim
        // loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum

        if (istenenBaslikIndexi != -3 ) {    // baslik bulundu
            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//thead//tr//th["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());

            }


        }else {     // baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }
    }
}
