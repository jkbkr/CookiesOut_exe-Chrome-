package com.my.projects.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Constructor {


    protected static WebDriver driver;
    protected WebDriverWait wait;


    public Constructor(WebDriver driver) {

       this.driver = driver;
       wait = new WebDriverWait(driver, Duration.ofSeconds(1));

    }
}
