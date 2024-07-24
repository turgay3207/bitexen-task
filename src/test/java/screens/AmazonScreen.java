package screens;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonScreen {
    public AmazonScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);


    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowElement;
    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
    public WebElement skipSignIn;




    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.amazon.mShop.android.shopping:id/chrome_search_hint_view\"]")
    public WebElement searchButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.amazon.mShop.android.shopping:id/rs_search_src_text\"]")
    public WebElement searchButtonSendKeys;



    @AndroidFindBy(xpath = "(//android.widget.Image[contains(@text,'iPhone')])[1]")
    public WebElement selectFirstProduct;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Heart to save an item to your default list\"]")
    public WebElement productVerify;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.amazon.mShop.android.shopping:id/btn_cancel\"]")
    public WebElement cancelBtn;


}
