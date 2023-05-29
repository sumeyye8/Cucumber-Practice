Feature: US1010 herokuapp Delete testi

  Scenario: TC15 herokuapp'dan delete butonu calismali

    Given kullanici "herokuappUrl" anasayfasinda
    And add element butonuna basar
    Then Delete butonu goronur oluncaya kadar bekler
    And Delete butonunun goronur oldugunu test eder
    Then Delete butonuna basar
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir

