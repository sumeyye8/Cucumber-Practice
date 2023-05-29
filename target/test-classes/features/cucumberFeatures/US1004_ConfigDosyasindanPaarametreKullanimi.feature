Feature: US1004 Kullanici parametre ile configration file'i kullanabilmeli

 @config @sirali @pr2
  Scenario: TC07 configration properties dosyasindan parametre kullanimi

    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url'in "techproeducation" icerdigini test eder
    Then sayfayi kapatir