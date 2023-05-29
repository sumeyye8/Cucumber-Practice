package stepDefinitions.practiceStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.practicePages.PracticeAmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDef {


    PracticeAmazonPage practiceAmazonPage = new PracticeAmazonPage();

    // Faker faker = new Faker();   -> **asagida instance olusturdugumuz icin buna gerek kalmadi. Faker'i instance'tan cektik cunku
    @Given("Kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        practiceAmazonPage.signinButton.click();

    }
    @When("Faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
        // uzun yol -> // practiceAmazonPage.emailBox.sendKeys(faker.internet().emailAddress());

        // **
        practiceAmazonPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @When("Gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshotWebElement("FakeEmail",practiceAmazonPage.emailBox);
    }
    @When("Continiue'a tiklar")
    public void continiue_a_tiklar() {
        practiceAmazonPage.continiueButton.click();
    }
    @Then("There is a problem mesajini dogrular")
    public void there_is_a_problem_mesajini_dogrular() {
        String expectedText="There is a problem";
        String actualText=practiceAmazonPage.problemMessage.getText();
        Assert.assertEquals("Problem mesaji esit degil " ,expectedText,actualText);
    }
    @Then("Need help'e tiklar")
    public void need_help_e_tiklar() {
        practiceAmazonPage.needHelp.click();

    }
    @Then("Forgot your password'e tiklar")
    public void forgot_your_password_e_tiklar() {
        practiceAmazonPage.forgetPasswordLink.click();

    }
    @Then("Password help metnini dogrular")
    public void password_help_metnini_dogrular() {
        Assert.assertTrue(practiceAmazonPage.passwordHelpText.isDisplayed());

    }
    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        practiceAmazonPage.createYourAccountButton.click();
    }

    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
        Assert.assertTrue("Create Account Text icermiyor ", practiceAmazonPage.createAccountText.getText().contains("Create Account"));

    }
    @Then("Web sayfasini kapatir")
    public void web_sayfasini_kapatir() {
        Driver.quitDriver();

    }


}
