package com.cbt.utilities;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args)  {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        WebDriver driver =  BrowserFactory.getDriver("chrome");

        List<String> title = new ArrayList<>();
        for (String eachUrl : urls) {
            driver.get(eachUrl);
            title.add(driver.getTitle());


            if(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
        for(int i = 0; i <title.size()-1 ; i++) {
            StringUtility.verifyEquals(title.get(i),title.get(i+1));
        }

        driver.quit();

        }
    }




