package stepDefinitions.CucumberStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CucumberPage.DatatablesPage;

public class dataTableStepDefinitions {

    DatatablesPage datatablesPage=new DatatablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        DatatablesPage.newButton.click();

    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {

        DatatablesPage.firstName.sendKeys(firstname);
    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {

        DatatablesPage.lastName.sendKeys(lastname);
    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        DatatablesPage.position.sendKeys(position);

    }
    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String office) {
        DatatablesPage.office.sendKeys(office);

    }
    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {

        DatatablesPage.extn.sendKeys(extension);

    }
    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        DatatablesPage.startDate.sendKeys(startDate);

    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {

        DatatablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

        DatatablesPage.create.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
        DatatablesPage.search.sendKeys(firstname);

    }
    @Then("isim bolumunde {string} oldugunu test eder")
    public void isim_bolumunde_oldugunu_test_eder(String firstname) {
        Assert.assertTrue(DatatablesPage.aramaSonucIlkElement.getText().contains(firstname));

    }

}
