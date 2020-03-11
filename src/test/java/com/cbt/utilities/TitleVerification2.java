package com.cbt.utilities;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String eachUrl : urls ) {
            driver.get(eachUrl);

            String currentUrl=driver.getCurrentUrl();
            String title = driver.getCurrentUrl().toLowerCase().trim();

            if (currentUrl.contains(title)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
        driver.quit();
        }

    }

