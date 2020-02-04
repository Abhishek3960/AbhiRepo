package TestBase;

import drivers.DriverInitializer;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws Exception {
        //driver = new DriverInitializer(System.getProperty("driver")).init();
        driver = new DriverInitializer("chrome").init();
    }
    protected void navigateTo(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }
}
