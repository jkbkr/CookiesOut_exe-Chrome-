package com.my.projects.Project;

import com.my.projects.Pages.BadCookiesWebSite;
import com.my.projects.Pages.BadCookiesWebSite_2;
import com.my.projects.Pages.BadCookiesWebSite_3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BadCookiesOut {


    private static WebDriver driver;
    private static BadCookiesWebSite bcw;
    private static BadCookiesWebSite_2 bcw2;
    private static BadCookiesWebSite_3 bcw3;


public static void Before() {

        String url = "https://www.google.com/";

        try {
            driver = new ChromeDriver();

            bcw = PageFactory.initElements(driver, BadCookiesWebSite.class);
            bcw2 = PageFactory.initElements(driver, BadCookiesWebSite_2.class);
            bcw3 = PageFactory.initElements(driver, BadCookiesWebSite_3.class);


            driver.manage().window().maximize();
            driver.get(url);
        } catch (SessionNotCreatedException e) {
            System.out.println("Session not created, trying again");
            Before();
        }
    }
//Infinite loop checks if there is any type of bad cookies while browsing
//Solves >>> https://www.kdomivolal.eu/
//Solves >>> https://www.mediafire.com/download/gp00z1oqvlmc4pr
//Solves >>> https://icon-icons.com/search/icons/?filtro=google+chrome

    public static void MakeBadCookiesGoOut() {

        while (true) {
        try{
    MakeBadCookiesWebSiteOut();
}catch(Exception e){
    try{
            MakeBadCookiesWebSiteOut_2();
    }    catch(Exception e1){
        try{
            MakeBadCookiesWebSiteOut_3();
        } catch (Exception e2) {
            MakeBadCookiesGoOut();
        }
      }
    }
  }
}


//For >>> BadCookiesWebSite
    public static void MakeBadCookiesWebSiteOut(){
        bcw.cookiesOptions();
        BadCookiesWebSite.buttonsLoop();
        //BadCookiesWebSite.noButtonsCheckedAssertion();
        bcw.moreCookiesOptions();
        BadCookiesWebSite.buttonsLoop();
        //BadCookiesWebSite.noButtonsCheckedAssertion();
    }

//For >>> BadCookiesWebSite_2
    public static void MakeBadCookiesWebSiteOut_2(){
        bcw2.setManageSettings(bcw2.manageSettings);
        BadCookiesWebSite_2.checkboxesLoop();
        BadCookiesWebSite_2.checkboxAssertion();
        bcw2.setshowVendors(bcw2.showVendors);
        BadCookiesWebSite_2.checkboxesLoop();
        BadCookiesWebSite_2.checkboxAssertion();
    }

    //TODO: WIP
//For >>> BadCookiesWebSite_3
    public static void MakeBadCookiesWebSiteOut_3(){
        bcw3.setManageSettings(bcw3.manageSettings);
        //wait for testing purposes
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BadCookiesWebSite_3.noButtonsCheckedAssertion();
    }
}
