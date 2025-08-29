package com.Ecommerce.genricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant {

    public FileUtility f = new FileUtility();
    public WebDriverUtility w = new WebDriverUtility();
    public static WebDriver driver;

    @BeforeSuite
    public void toConnectServer() {
        Reporter.log("===server started===", true);
    }

    @BeforeTest
    public void toConnectDatabase() {
        Reporter.log("===database connected successfully===", true);
    }

    @Parameters({"browser", "url"})
    @BeforeClass
    public void setup(@Optional("chrome") String browser, @Optional("https://demowebshop.tricentis.com/") String url) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                Reporter.log("===Invalid browser name===", true);
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        Reporter.log("===" + browser + " launched successfully===", true);
        w.maximizeWindow(driver);
        w.implicitWait(driver, 10);
        w.launchApplication(url, driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        Reporter.log("===browser closed successfully===", true);
    }

    @AfterTest
    public void toCloseDb() {
        Reporter.log("===database closed successfully===", true);
    }

    @AfterSuite
    public void toCloseServer() {
        Reporter.log("===Server closed successfully===", true);
    }
}
