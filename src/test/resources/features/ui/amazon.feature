@amazon
  Feature: Amazon UI Test

    Scenario:TC01 Checking add to card function
      Given user goes to amazon url "https://www.amazon.com.tr"
      When user clicks Giris yap button
      When user enters "email" into E-posta adresi veya telefon numarasi field
      When user clicks Devam Et button
      When user enters "password" into sifre field
      When user clicks Giris Yap button on login page
      When user enters "iphone 13" into search button
      When user clicks the search icon
      When user clicks the first product
      Then user verify that the chosen product is the same
      When User clicks the Sepete ekle button
      When User clicks the Sepet button
      Then User verify that price is the same




