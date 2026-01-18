package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserStackConfig;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDriver implements WebDriverProvider {

    private final BrowserStackConfig config;
    public BrowserStackDriver() {
        this.config = ConfigFactory.create(BrowserStackConfig.class, System.getProperties());
    }

    @NotNull
    @Override
    public WebDriver createDriver(@NotNull Capabilities capabilities) {

        MutableCapabilities caps = new MutableCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", config.getUser());
        caps.setCapability("browserstack.key", config.getKey());

        // Set URL of the application under test
        caps.setCapability("app", config.getApp());

        // Specify device and os_version for testing
        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOsVersion());

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(
                    new URL(config.getRemoteURL()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
