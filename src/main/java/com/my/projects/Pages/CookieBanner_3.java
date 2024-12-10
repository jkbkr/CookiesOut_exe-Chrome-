package com.my.projects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
// TODO >>> CookieBanner_3 WIP
//Solves >>> https://icon-icons.com/search/icons/?filtro=google+chrome
public class CookieBanner_3 extends Constructor{

    public CookieBanner_3(WebDriver driver) {
        super(driver);
    }

    public @FindBy(id="sn-b-custom")
    WebElement manageSettings;

    @FindBy(xpath="//label[contains(@class, 'sn-switch')]//input[@type='checkbox']")
    WebElement button;

    //Click on manage settings button
    public void setManageSettings(WebElement manageSettings) {
        this.manageSettings = manageSettings;
        manageSettings.click();
    }

    // Assertion: no buttons selected
    public static void noButtonsCheckedAssertion(){

        // List of all checkboxes on the page //label[contains(@class, 'sn-switch')]//input[@type='checkbox']
        List<WebElement> checkedButtons = driver.findElements(By.xpath("//input[@type='checkbox']"));

        // Assert - no checked buttons
        boolean anyChecked = false;
        for (WebElement button : checkedButtons) {
            if (button.isSelected()) {
                anyChecked = true;
                break;
            }
        }

        if (anyChecked) {
            System.out.println("There is a checked button on the page! - Will be solved soon");
            buttonsLoop();
            noButtonsCheckedAssertion();

        } else {
            System.out.println("Assertion passed: No buttons are checked.");
        }


    }

//TODO >>> assertion tested - ok, buttonsLoop - nok
    public static void buttonsLoop(){
//label[contains(@class, 'sn-switch')]//input[@type='checkbox']
        List<WebElement> checkedButtons = driver.findElements(By.xpath("//input[@type='checkbox']"));
        // Loop through each checked button //label[contains(@class, 'sn-switch')]//input[@type='checkbox']
        for (WebElement button : checkedButtons) {
            // Check if the button is visible and selected
            if (button.isDisplayed() && button.isSelected()) {

                Actions actions = new Actions(driver);
                actions.moveToElement(button).perform();

                button.click();
            }
        }
    }
}
