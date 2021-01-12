package com.waitTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
    WebDriver driver;

    public WaitTypes(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement(By locator, int timeoout) {
        WebElement element = null;
        try {
            System.out.println("Waiting for max:" + timeoout + "seconds for element available");

            WebDriverWait wait = new WebDriverWait(driver, timeoout);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            System.out.println("Element appeared on the page");

        } catch (Exception e) {
            System.out.println("Element not appeared");
        }
        return element;
    }


    public void clickWhenReady(By locator, int timeoout) {

        try {
            WebElement element;
            System.out.println("Waiting for max:" + timeoout + "seconds for element to be available");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            System.out.println("Element clicked on the page");

        } catch (Exception e) {
            System.out.println("Element not appeared");
        }
    }
}
