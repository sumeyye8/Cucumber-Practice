package stepDefinitions.CucumberStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CucumberPage.HerOkuAppPage;
import utilities.Driver;

import java.time.Duration;

public class HerOkuAppStepDefinitions {
    HerOkuAppPage herOkuAppPage=new HerOkuAppPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herOkuAppPage.addButonu.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herOkuAppPage.deleteButonu));

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herOkuAppPage.deleteButonu.isDisplayed());

    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herOkuAppPage.deleteButonu.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        Assert.assertTrue(herOkuAppPage.deleteListesi.isEmpty());

    }
}