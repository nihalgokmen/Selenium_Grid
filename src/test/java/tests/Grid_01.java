package tests;

import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

import java.lang.annotation.Target;
import java.net.MalformedURLException;
import java.net.URL;

public class Grid_01 {

    DriverManager driverManager = new DriverManager();
    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444"),new ChromeOptions());
        driver.get("https://wwww.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    void remoteChromeDriverTest(){

        driver = driverManager.setUpChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // java -jar selenium-server-4.10.0.jar standalone
    }
}
