package drivers.driverFactory;

public class FirefoxBrowser {
    public WebDriver getDriver() throws Exception {
        setDriverBinaryPath();
        return new FirefoxDriver();
    }

    public void setDriverBinaryPath() {
        WebDriverManager.firefoxdriver().setup();
    }
}
