package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.DriverUi;

import static org.junit.Assert.assertEquals;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    String expectedProductName;
    String productPriceOnProductPage;


    @Given("user goes to amazon url {string}")
    public void user_goes_to_amazon_url(String url) {
        DriverUi.getDriver().get(url);

    }

    @When("user clicks Giris yap button")
    public void user_clicks_giris_yap_button() {
        amazonPage.girisYap.click();

    }

    @When("user enters {string} into E-posta adresi veya telefon numarasi field")
    public void user_enters_into_e_posta_adresi_veya_telefon_numarasi_field(String email) {

        amazonPage.email.sendKeys(ConfigReader.getProperty(email));
    }

    @When("user clicks Devam Et button")
    public void user_clicks_devam_et_button() {
        amazonPage.devamEt.click();

    }

    @When("user enters {string} into sifre field")
    public void user_enters_into_sifre_field(String password) {
        amazonPage.password.sendKeys(ConfigReader.getProperty(password));

    }

    @When("user clicks Giris Yap button on login page")
    public void user_clicks_giris_yap_button_on_login_page() {
        amazonPage.signIn.click();


    }

    @When("user enters {string} into search button")
    public void user_enters_into_search_button(String text) {
        amazonPage.searchButton.sendKeys(text);

    }


    @When("user clicks the search icon")
    public void user_clicks_the_search_icon() {
        amazonPage.searchIcon.click();
    }

    @When("user clicks the first product")
    public void user_clicks_the_first_product() {
        expectedProductName = amazonPage.firstProduct.getText();
        amazonPage.firstProduct.click();
        productPriceOnProductPage = amazonPage.productPrice.getText().trim();
        System.out.println("Ürün detay sayfasındaki ürünün fiyatı = " + productPriceOnProductPage);

        System.out.println("Bütün ürünlerin listesinin oldugu alandaki ürün ismi = " + expectedProductName);


    }

    @Then("user verify that the chosen product is the same")
    public void user_verify_that_the_chosen_product_is_the_same() {
        String actualName = amazonPage.productNameOnProductPage.getText();
        System.out.println("Ürün detay sayfası acıldıktan sonra ürünün ismi = " + actualName);

        // Ürün listesinde tıkladıgımız ürünün ismi ile açılan ürünün isminin aynı olup olmadığını kontrol ediyoruz
        // Bu sayede doğru ürün acıldımı acılmadı mı kontrol etmiş oluyoruz
        assertEquals(expectedProductName, actualName);

    }

    @When("User clicks the Sepete ekle button")
    public void user_clicks_the_sepete_ekle_button() {
        amazonPage.sepeteEkle.click();

    }

    @When("User clicks the Sepet button")
    public void user_clicks_the_sepet_button() {
        amazonPage.sepet.click();
    }

    @Then("User verify that price is the same")
    public void user_verify_that_price_is_the_same() {
        System.out.println("Ürünün sepetteki fiyatı = " + amazonPage.priceOnCart.getText());
        String priceOnCard = amazonPage.priceOnCart.getText().split(",")[0].trim();
        System.out.println(".00 ve Tl kısmnı attıkdan sonra Sepette gözüken fiyat = " + priceOnCard);

        //Ürün detay sayfasındaki ürünün fiyatı ile sepetteki fiyatı karsılastırıyoruz.
        assertEquals(productPriceOnProductPage, priceOnCard);

        DriverUi.closeDriver();
    }


}
