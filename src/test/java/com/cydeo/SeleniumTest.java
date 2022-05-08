package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1- Setting up the webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2- create instance of the chrome driver
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        if(driver.getTitle().equalsIgnoreCase("google")){
            System.out.println("passed");
        }
        String google="https://www.google.com";


    }
}
