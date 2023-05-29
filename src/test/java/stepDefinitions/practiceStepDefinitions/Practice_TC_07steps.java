package stepDefinitions.practiceStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.practicePages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07steps {
    PracticeTC07Page practiceTC07Page = new PracticeTC07Page();

    @Given("Tarayiciyi baslatarak {string} url'ine gidin")
    public void tarayiciyi_baslatarak_url_ine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }
    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {

        String homeUrl="http://automationexercise.com";
        Assert.assertEquals("home url eşit degil", homeUrl, Driver.getDriver().getCurrentUrl());

    }
    @Then("Test Case butonuna tiklayin")
    public void test_case_butonuna_tiklayin() {
        practiceTC07Page.testCaseLink.click();

    }
    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
    }

    @Then("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgili_sayfanin_ekran_goruntusunu_alin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
