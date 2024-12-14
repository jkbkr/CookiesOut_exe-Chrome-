package com.my.projects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

//Solves >>> https://icon-icons.com/search/icons/?filtro=google+chrome
public class CookieBanner_3 extends Constructor{

    public CookieBanner_3(WebDriver driver) {
        super(driver);
    }
// manage settings

    public @FindBy(id="sn-b-custom")
    WebElement manageSettings;
// Vendor Consent

    @FindBy(id = "disable_all_v_pur")
    static WebElement disableAllVendorConsent;

    @FindBy(id = "enable_all_v_pur")
    static WebElement enableAllVendorConsent;
// Vendors

    @FindBy(xpath = "//li[@class='sn-header-selector' and @data-attr='vendor']")
    static WebElement vendors;

    @FindBy(id = "enable_all_v")
    static WebElement enableAllVendors;

    @FindBy(xpath = "//div//span[@class='sn-disable_all_s' and @id='disable_all_v']")
    static WebElement disableAllVendors;
// Legitimate interest

    @FindBy(xpath = "//li[@class='sn-header-selector' and @data-attr='legitimate']")
    static WebElement legitimateInterest;

    @FindBy(xpath = "//input[@class='lpd' and @type='checkbox' and @data-attr='20']")
    static WebElement objectToAll;

    @FindBy(xpath = "//input[@class='vli' and @type='checkbox' and @data-attr='2']")
    static WebElement objectToThis;

    @FindBy(xpath = "//input[@class='vli' and @type='checkbox' and @data-attr='11']")
    static WebElement objectToThis2;

    @FindBy(xpath = "//span[@class='sn-object-all' and @id='oba']")
    static WebElement objectAll;

//Click on manage settings button

    public void setManageSettings(WebElement manageSettings) {
        this.manageSettings = manageSettings;
        manageSettings.click();
    }

// Vendor Consent

    public static void EnableAll(){
        enableAllVendorConsent.click();
    }

    public static void disableAllVendorConsent(){
        disableAllVendorConsent.click();
    }

// Vendors

    public static void SelectVendors(){
        vendors.click();
    }

    public static void EnableAllVendors(){
        enableAllVendors.click();
    }

    public static void DisableAllVendors(){
        disableAllVendors.click();
    }

// Legitimate interest

    public static void LegitimateInterest(){
        legitimateInterest.click();
    }

    public static void ObjectToEverything(){
        objectToAll.click();
        objectToThis.click();
        objectToThis2.click();
        objectAll.click();
    }

    // Assertion: no buttons selected
    public static void noButtonsCheckedAssertion(){

        // Find all checkboxes on the page //label[contains(@class, 'sn-switch')]//input[@type='checkbox']
        List<WebElement> checkedButtons = driver.findElements(By.xpath("//input[@type='checkbox']"));

        // Assert none of them are checked
        boolean anyChecked = false;
        for (WebElement button : checkedButtons) {
            if (button.isSelected()) {
                anyChecked = true;
                break;
            }
        }

        if (anyChecked) {
            System.out.println("There is a checked button on the page! - Will be solved soon");
            EnableAll();
            disableAllVendorConsent();
            noButtonsCheckedAssertion();

        } else {
            System.out.println("Assertion passed: No buttons are checked.");
        }


    }

    // Assertion: no buttons selected (Vendors)
    public static void noButtonsCheckedAssertionVendors(){

        // Find all checkboxes on the page //label[contains(@class, 'sn-switch')]//input[@type='checkbox']
        List<WebElement> checkedButtons = driver.findElements(By.xpath("//input[@type='checkbox']"));

        // Assert none of them are checked
        boolean anyChecked = false;
        for (WebElement button : checkedButtons) {
            if (button.isSelected()) {
                anyChecked = true;
                break;
            }
        }

        if (anyChecked) {
            System.out.println("There is a checked button on the page! - Will be solved soon");
            EnableAllVendors();
            DisableAllVendors();
            noButtonsCheckedAssertion();

        } else {
            System.out.println("Assertion passed: No buttons are checked.");
        }
    }
}
