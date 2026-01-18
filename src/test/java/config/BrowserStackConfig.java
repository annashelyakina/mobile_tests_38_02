package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties",
        "classpath:browserstack.properties"
})

public interface BrowserStackConfig extends Config {

    @Key("user")
    String getUser();

    @Key("key")
    String getKey();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getOsVersion();

    @Key("app")
    String getApp();

    @Key("remote")
    String getRemoteURL();
}
