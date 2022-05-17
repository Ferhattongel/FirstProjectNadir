package com.cydeo.test.ExtraPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.nextbasecrm.com/");
        Thread.sleep(2000);

        WebElement login= driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("helpdesk51@cybertekschool.com");

        WebElement pass= driver.findElement(By.name("USER_PASSWORD"));
        pass.sendKeys("UserUser"+Keys.ENTER);

        String expectedTitle="Portal";
        String title=driver.getTitle();


        if(title.contains(expectedTitle)){
            System.out.println("TC001 VALID LOGIN CASE SUCCESSFUL");
        }else{
            System.out.println("TC001 VALID LOGIN CASE FAILED");
        }
        System.out.println(title);
        driver.close();

    }
}
