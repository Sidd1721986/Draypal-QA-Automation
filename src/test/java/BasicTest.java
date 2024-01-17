import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class BasicTest {
    @Test
    public void baseTest() {
        System.out.println("Hello World!");
        /*try {
            UiAutomator2Options options = new UiAutomator2Options();



            AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }*/
    }
}
