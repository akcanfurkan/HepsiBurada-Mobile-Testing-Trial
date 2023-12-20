import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HepsiBurada {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        //Appium sunucusuna bağlanmak için gerekli bilgiler

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL 4");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hepsiburada.ui.startup.SplashActivity");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pozitron.hepsiburada");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Model\\IdeaProjects\\AppiumDersleri\\.idea\\Apps\\Hepsiburada.apk");

        //Appium sunucusuna bağlanma  URL'ini oluşturma

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(3000);

        //Hesabım butonuna tıklama işlemi
        MobileElement hesabimButonu = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]"));
        hesabimButonu.click();


        MobileElement searchIcon = driver.findElement(By.id("com.pozitron.hepsiburada:id/imageViewSearchIcon"));
        searchIcon.click();

        MobileElement searchKeys = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        searchKeys.sendKeys("  Iphone");



    }


}
