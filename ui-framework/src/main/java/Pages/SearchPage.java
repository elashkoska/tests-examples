package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    public static WebElement originalTextBoxWebDriver(WebDriver driver) {
        element = driver.findElement(By.id("flight-origin"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin) {
        element = originalTextBoxWebDriver(driver);
        element.sendKeys(origin);
    }


    public static WebElement destinationTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-destination"));
        return element;
    }


    public static WebElement departureDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-departing"));
        return element;
    }

    public static WebElement returnDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-returning"));
        return element;
    }

    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.id("search-button"));
        return element;
    }

    public static void clickOnSearchButton(WebDriver driver) {
        element = searchButton(driver);
        element.click();
    }

    public static void navigateToFlightsTab(WebDriver driver) {
        driver.findElement(By.id("header-history")).click();
        element = driver.findElement(By.id("tab-flight-tab"));
        element.click();
    }
}
