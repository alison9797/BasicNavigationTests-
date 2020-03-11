package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        Chrome();
        //FireFox();
        //Safari();
    }

    public static void Chrome(){
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("https://www.google.com");
            String titleGoogle = driver.getTitle();
            driver.get("https://www.etsy.com");
            String titleEtsy = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(titleGoogle, driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(titleEtsy, driver.getTitle());
        driver.quit();
    }

        public static void FireFox () {
        WebDriver driver = BrowserFactory.getDriver("firefox");
            driver.get("https://www.google.com");
            String titleGoogle = driver.getTitle();
            driver.get("https://www.etsy.com");
            String titleEtsy = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(titleGoogle, driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(titleEtsy, driver.getTitle());
            driver.quit();

        }
        public static void Safari () {
        WebDriver driver = BrowserFactory.getDriver("safari");
            driver.get("https://www.google.com");
            String titleGoogle = driver.getTitle();
            driver.get("https://www.etsy.com");
            String titleEtsy = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(titleGoogle, driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(titleEtsy, driver.getTitle());
            driver.quit();

        }
    }

