package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class DriverClass {


        private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
        public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

        public static WebDriver getDriver() {
            if (threadDriver.get() == null) {
                String browserName = threadBrowserName.get() != null ? threadBrowserName.get() : "chrome";
                switch (browserName.toLowerCase()) {
                    case "chrome":

                        break;
                    case "edge":
                        System.setProperty("webdriver.edge.driver", "https://parabank.parasoft.com/");
                        threadDriver.set(new EdgeDriver());


                }
                threadDriver.get().manage().window().maximize();
            }
            return threadDriver.get();
        }

        public static void quitDriver() {
            if (threadDriver.get() != null) {
                threadDriver.get().quit();
                threadDriver.remove();
            }
        }
    }


