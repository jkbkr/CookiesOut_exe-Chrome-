package com.my.projects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//Solves >>> https://www.mediafire.com/download/gp00z1oqvlmc4pr
public class CookieBanner_2 extends Constructor{


    public CookieBanner_2(WebDriver driver) {
        super(driver);
    }

    public @FindBy(id="ez-manage-settings")
    WebElement manageSettings;

    public @FindBy(id="ez-show-vendors")
    WebElement showVendors;


//Click on manage settings button (in the desired situation)
    public void setManageSettings(WebElement manageSettings) {
        this.manageSettings = manageSettings;
        WebElement privacy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.mediafire.com/policies/privacy_policy.php']")));
        if(privacy.isDisplayed()&&manageSettings.isDisplayed()){
            manageSettings.click();
        }
    }

//Click on "Show Vendors"
    public void setshowVendors(WebElement showVendors) {
        this.showVendors = showVendors;
        showVendors.click();
    }


// Checkboxes loop >>> unselecting all checked checkboxes
    public static void checkboxesLoop(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // List of all checkboxes on the page
        List<WebElement> checkedButtons2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.ez-cmp-li-checkbox.ez-cmp-checkbox")));
        // Loop through each selected checkbox
        for (WebElement button : checkedButtons2) {
            // Check if the checkbox is visible and selected
            if (button.isDisplayed() && button.isSelected()) {

                button.click();
            }}}


// Assertion: no checkboxes selected
    public static void checkboxAssertion(){

        // List of all checkboxes on the page
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input.ez-cmp-li-checkbox.ez-cmp-checkbox"));

        // Assert none are checked
        boolean anyChecked = false;
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                anyChecked = true;
                break;
            }
        }

        if (anyChecked) {
            System.out.println("There is a checked checkbox on the page! - Will be solved soon");
            checkboxesLoop();
            checkboxAssertion();
        } else {
            System.out.println("Assertion passed: No checkboxes are checked.");
        }

    }
}

