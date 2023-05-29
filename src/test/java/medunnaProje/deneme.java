package medunnaProje;

public class deneme {

    /*
           SCROLL

         JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", webElement);

     */


    /*

  @US25_TC01
  Scenario: TC01 Hasta portallerini kullanarak yeni bir randevu alabilir


    Given Hasta Phone butonunun gorunur oldugunu test eder
    When Hasta gecerli bir telefon numarasi girer
    Then Hasta Send an Appointment Request butonunun gorunur oldugunu test eder
    When Hasta Send an Appointment Request butonuna tiklar
    Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini görerek randevu alindigini dogrular
    And Kullanici sayfayi kapatir


  @US25_TC02
    Scenario: TC02 Kullanicinin herhangi bir karakter iceren First Name yazmasi gerekir ve bos birakilamaz.


    Then Kullanici First Name butonunun gorunur oldugunu test eder
    When Kullanici First Name butonuna tiklar
    Then Kullanici SSN butonunun gorunur oldugunu test eder
    When Kullanici SSN butonuna tiklar
    Then Kullanici First Name butonu altinda 'Your FirstName is required.' yazisinin goruntulendigini dogrular
    And Kullanici gecerli bir first name girer
    And Kullanici sayfayi kapatir




  @US25_TC03
  Scenario: TC03 Kullanici SSN numarasi girmeli (kayitli SSN) bos birakilamaz.

    Given Kullanici gecerli bir first name girer
    Then Kullanici SSN butonunun gorunur oldugunu test eder
    When Kullanici SSN butonuna tiklar
    Then Kullanici Last Name butonunun gorunur oldugunu test eder
    When Kullanici Last Name butonuna tiklar
    Then Kullanici SSN butonu altinda 'Your SSN is required.' yazisinin goruntulendigini dogrular
    And Kullanici gecerli bir SSN girer
    And Kullanici sayfayi kapatir



  @US25_TC04
  Scenario: TC04 Kullanici, herhangi bir karakter iceren Last Name yazmasi gerekir, bos birakilamaz.

    Given Kullanici gecerli bir first name girer
    And Kullanici gecerli bir SSN girer
    Then Kullanici Last Name butonunun gorunur oldugunu test eder
    When Kullanici Last Name butonuna tiklar
    Then Kullanici Phone butonunun gorunur oldugunu test eder
    When Kullanici Phone butonuna tiklar
    Then Kullanici Last Name butonu altinda 'Your LastName is required.' yazisinin goruntulendigini dogrular
    And Kullanici gecerli bir Last Name girer
    And Kullanici sayfayi kapatir




  @US25_TC05
  Scenario: TC05 Kullanici gecerli bir phone girmeli

    Given Kullanici gecerli bir first name girer
    When Kullanici gecerli bir SSN girer
    And Kullanici gecerli bir last name girer
    Then Kullanici Phone butonunun gorunur oldugunu test eder
    And Kullanici gecerli bir telefon numarasi girer
    And Kullanici sayfayi kapatir



  @US25_TC06
  Scenario: TC06 Kullanici randevu alıp kaydoldugunda, profillerini görebilir ve uygulamada oturum acabilir.

    Given Kullanici gecerli bir first name girer
    And Kullanici gecerli bir SSN girer
    And Kullanici gecerli bir last name girer
    And Kullanici gecerli bir Email girer
    Then Kullanici Appointment DateTime butonunun gorunur oldugunu test eder
    When Kullanici Appointment DateTime butonuna tiklar
    And Kullanici gecerli bir tarih girer
    Then Kullanici Send an Appointment Request butonunun gorunur oldugunu test eder
    When Kullanici Send an Appointment Request butonuna tiklar
    Then Kullanici ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini gorerek randevu alindigini dogrular
    And Kullanici sayfayi kapatir




  @US25_TC07
  Scenario: TC07 Kullanici randevu alip kaydoldugunda, profillerini gorebilir ve uygulamada oturum acabilir.

    Given Kullanici randevunun gorundugunu dogrular
    And Kullanici sayfayi kapatir




  @US25_TC08
  Scenario: TC08 Kullanici gecerli tarih girmelidir. (guncel tarih secebilmelidir)

    Given Hasta Phone butonunun gorunur oldugunu test eder
    When Hasta gecerli bir telefon numarasi girer
    Then Hasta Appointment DateTime butonunun gorunur oldugunu test eder
    When Hasta Appointment DateTime butonuna tiklar
    And Hasta guncel bir tarih girer
    Then Hasta Send an Appointment Request butonunun gorunur oldugunu test eder
    When Hasta Send an Appointment Request butonuna tiklar
    Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini görerek randevu alindigini dogrular
    And Kullanici sayfayi kapatir


  @US25_TC09
  Scenario: TC09 Kullanici gecerli tarih girmelidir. (gelecek tarih secebilmelidir)

    Given Hasta Phone butonunun gorunur oldugunu test eder
    And Hasta gecerli bir telefon numarasi girer
    Then Hasta Appointment DateTime butonunun gorunur oldugunu test eder
    When Hasta Appointment DateTime butonuna tiklar
    And Hasta gelecekteki bir tarih girer
    Then Hasta Send an Appointment Request butonunun gorunur oldugunu test eder
    When Hasta Send an Appointment Request butonuna tiklar
    Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini görerek randevu alindigini dogrular
    And Kullanici sayfayi kapatir



  @US25_TC10
  Scenario: TC10 Tarih sirasi gun/ay/yil (ay/gun/yil) seklinde olmalidir.

    Given Hasta Phone butonunun gorunur oldugunu test eder
    And Hasta gecerli bir telefon numarasi girer
    Then Hasta Appointment DateTime butonunun gorunur oldugunu test eder
    When Hasta Appointment DateTime butonuna tiklar
    And Hasta Appointment DateTime 'a tarihi gün/ay/yil seklinde yazar
    Then Hasta Send an Appointment Request butonunun gorunur oldugunu test eder
    When Hasta Send an Appointment Request butonuna tiklar
    Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini gorerek randevu alindigini dogrular
    And Kullanici sayfayi kapatir

     */

}
