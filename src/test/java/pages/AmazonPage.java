package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUi;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(DriverUi.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Giriş yap')]")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement devamEt;
    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signIn;


    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchIcon;



    @FindBy(xpath = "(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//*[contains(text(),'iPhone')])[7]")
    public WebElement firstProduct;


    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement productNameOnProductPage;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']//span[@class='a-price-whole']")
    public WebElement productPrice;



    @FindBy(xpath = "//span[@class='nav-line-1'][contains(text(),'Alışveriş')]")
    public WebElement sepet;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    public WebElement priceOnCart;



}
