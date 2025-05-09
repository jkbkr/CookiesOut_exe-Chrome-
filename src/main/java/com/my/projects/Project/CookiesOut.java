package com.my.projects.Project;

import com.my.projects.Pages.CookieBanner_1;
import com.my.projects.Pages.CookieBanner_2;
import com.my.projects.Pages.CookieBanner_3;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.Random;

public class CookiesOut {


    private static CookieBanner_1 cb1;
    private static CookieBanner_2 cb2;
    private static CookieBanner_3 cb3;


    public static void Before() {

        String url = "https://www.google.com/";

        try {
            WebDriver driver = new ChromeDriver();

            // Anonymni rezim
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");

            java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            // Možnosti velikostí okna
            int[][] sizes = {
                    {(int) (screenSize.getWidth() * 0.9), (int) (screenSize.getHeight() * 0.8)},
                    {(int) (screenSize.getWidth() * 0.9), (int) (screenSize.getHeight() * 0.9)},
                    {(int) (screenSize.getWidth() * 0.7), (int) (screenSize.getHeight() * 0.7)},
                    {(int) (screenSize.getWidth() * 0.85), (int) (screenSize.getHeight() * 0.85)},
                    {(int) (screenSize.getWidth() * 0.75), (int) (screenSize.getHeight() * 0.75)},
                    {(int) (screenSize.getWidth() * 0.8), (int) (screenSize.getHeight() * 0.8)},
                    {(int) (screenSize.getWidth() * 0.88), (int) (screenSize.getHeight() * 0.88)},
                    {(int) (screenSize.getWidth() * 0.72), (int) (screenSize.getHeight() * 0.72)},
                    {(int) (screenSize.getWidth() * 0.83), (int) (screenSize.getHeight() * 0.78)},
                    {(int) (screenSize.getWidth() * 0.91), (int) (screenSize.getHeight() * 0.82)},
                    {(int) (screenSize.getWidth() * 0.76), (int) (screenSize.getHeight() * 0.74)},
                    {(int) (screenSize.getWidth() * 0.87), (int) (screenSize.getHeight() * 0.81)},
                    {(int) (screenSize.getWidth() * 0.79), (int) (screenSize.getHeight() * 0.76)},
                    {(int) (screenSize.getWidth() * 0.92), (int) (screenSize.getHeight() * 0.85)},
                    {(int) (screenSize.getWidth() * 0.81), (int) (screenSize.getHeight() * 0.79)},
                    {(int) (screenSize.getWidth() * 0.74), (int) (screenSize.getHeight() * 0.73)},
                    {(int) (screenSize.getWidth() * 0.95), (int) (screenSize.getHeight() * 0.89)},
                    {(int) (screenSize.getWidth() * 0.78), (int) (screenSize.getHeight() * 0.77)},
                    {(int) (screenSize.getWidth() * 0.89), (int) (screenSize.getHeight() * 0.84)},
                    {(int) (screenSize.getWidth() * 0.86), (int) (screenSize.getHeight() * 0.83)},
                    {(int) (screenSize.getWidth() * 0.77), (int) (screenSize.getHeight() * 0.75)},
                    {(int) (screenSize.getWidth() * 0.82), (int) (screenSize.getHeight() * 0.80)},
                    {(int) (screenSize.getWidth() * 0.90), (int) (screenSize.getHeight() * 0.87)},
                    {(int) (screenSize.getWidth() * 0.73), (int) (screenSize.getHeight() * 0.72)},
                    {(int) (screenSize.getWidth() * 0.93), (int) (screenSize.getHeight() * 0.86)},
                    {(int) (screenSize.getWidth() * 0.84), (int) (screenSize.getHeight() * 0.82)},
                    {(int) (screenSize.getWidth() * 0.96), (int) (screenSize.getHeight() * 0.88)},
                    {(int) (screenSize.getWidth() * 0.80), (int) (screenSize.getHeight() * 0.79)},
                    {(int) (screenSize.getWidth() * 0.75), (int) (screenSize.getHeight() * 0.74)}
            };

            // Vybere náhodnou velikost
            Random random = new Random();
            int[] selectedSize = sizes[random.nextInt(sizes.length)];

            // Nastaví random velikost okna
            driver.manage().window().setSize(new Dimension(selectedSize[0], selectedSize[1]));




            //java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            //int width = (int) (screenSize.getWidth() * 0.9);
            //int height = (int) (screenSize.getHeight() * 0.9);
            //driver.manage().window().setSize(new Dimension(width, height));
            cb1 = PageFactory.initElements(driver, CookieBanner_1.class);
            cb2 = PageFactory.initElements(driver, CookieBanner_2.class);
            cb3 = PageFactory.initElements(driver, CookieBanner_3.class);


            // driver.manage().window().maximize();
            driver.get(url);
        } catch (SessionNotCreatedException e) {
            System.out.println("Session not created, trying again");
            Before();
        }
    }
//Infinite loop checks if there is any type of cookies while browsing
//Solves >>> https://www.kdomivolal.eu/
//Solves >>> https://www.mediafire.com/download/gp00z1oqvlmc4pr
//Solves >>> https://icon-icons.com/search/icons/?filtro=google+chrome

    public static void RemoveCookiesLoop() {

        while (true) {
            try{
                CookiesOut_1();
            }catch(Exception e){
                try{
                    CookiesOut_2();
                }    catch(Exception e1){
                    try{
                        CookiesOut_3();
                    } catch (Exception e2) {
                        RemoveCookiesLoop();
                    }
                }
            }
        }
    }


    //For >>> CookieBanner_1
    public static void CookiesOut_1(){
        cb1.cookiesOptions();
        CookieBanner_1.buttonsLoop();
        //CookieBanner_1.noButtonsCheckedAssertion();
        cb1.moreCookiesOptions();
        CookieBanner_1.buttonsLoop();
        //CookieBanner_1.noButtonsCheckedAssertion();
    }

    //For >>> CookieBanner_2
    public static void CookiesOut_2(){
        cb2.setManageSettings(cb2.manageSettings);
        CookieBanner_2.checkboxesLoop();
        CookieBanner_2.checkboxAssertion();
        cb2.setshowVendors(cb2.showVendors);
        CookieBanner_2.checkboxesLoop();
        CookieBanner_2.checkboxAssertion();
    }

    //For >>> CookieBanner_3
    public static void CookiesOut_3(){
        cb3.setManageSettings(cb3.manageSettings);
        CookieBanner_3.noButtonsCheckedAssertion();
        CookieBanner_3.SelectVendors();
        CookieBanner_3.noButtonsCheckedAssertionVendors();
        CookieBanner_3.LegitimateInterest();
        CookieBanner_3.ObjectToEverything();
    }



}


