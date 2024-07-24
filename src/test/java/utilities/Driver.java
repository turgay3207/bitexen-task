package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {


    private Driver() {
    }

    private static UiAutomator2Options options;
    private static AndroidDriver driver;

    private static final String appUrl = System.getProperty("user.dir")
            + File.separator + "AndroidBuilt"
            + File.separator + "amazon.apk";

    public static AppiumDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options = new UiAutomator2Options().
                            setPlatformName("Android").
                            setApp(appUrl)
                            .setAppPackage("com.amazon.mShop.android.shopping")
                            .setAppActivity("com.amazon.mShop.splashscreen.StartupActivity")
                            .setAutomationName("UiAutomator2")
                            .setUdid("emulator-5554")
                            .setNoReset(false)
                            .autoGrantPermissions()
                            .setNewCommandTimeout(Duration.ofMinutes(30));

                    try {
                        driver = new AndroidDriver(
                                new URL("http://127.0.0.1:4723"), options);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }


                case "IOS":
                    //ios ile ilgili konfigurasyonlar buraya...
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }

    }
}
