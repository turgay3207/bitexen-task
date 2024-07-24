package stepdefinitions.mobil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.*;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import screens.AmazonScreen;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinition {

    AmazonScreen amazonScreen = new AmazonScreen();

    @Given("User open the app")
    public void user_open_the_app() {

        try {
            amazonScreen.cancelBtn.click();


        } catch (Exception e) {

        }
    }
    @When("user clicks the skipSignIn button")
    public void user_clicks_the_skip_sign_in_button() {
        ReusableMethods.clickWithWait(amazonScreen.skipSignIn);
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        ReusableMethods.clickWithWait(amazonScreen.searchButton);
    }
    @When("user enter {string} on the search button")
    public void user_enter_on_the_search_button(String productName) {
        amazonScreen.searchButtonSendKeys.sendKeys(productName);
        ((AndroidDriver) Driver.getDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    @When("user select first product")
    public void user_select_first_product() {
        ReusableMethods.clickWithWait(amazonScreen.selectFirstProduct);
    }

    @Then("the user verifies the resulting product")
    public void the_user_verifies_the_resulting_product() {

        Assert.assertTrue(amazonScreen.productVerify.isDisplayed());

    }

}
