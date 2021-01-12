package com.waitTypes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutocompleteDemo {
    private WebDriver driver;
    private String baseUrl;

    @BeforeAll
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://www.goibibo.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testAutocomplete() throws Exception {
        String partialText = "Del";
        String textToSelect = "Delhi, India(DEL)";

        WebElement textField = driver.findElement(By.id("gosuggest_inputSrc"));
        textField.sendKeys(partialText);

        WebElement ulElement = driver.findElement(By.id("react-autosuggest-1"));
        String innerHtml = ulElement.getAttribute("innerHTML");
        System.out.println(innerHtml);

        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
        Thread.sleep(3000);

        for (WebElement element : liElements) {
            System.out.println(element.getText());
            element.click();
            break;
        }

    }

    @AfterAll
    void tearDown() throws Exception {
        String fileName = getRandomString(10) + ".png";

    }

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwABCDEFGH12345";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

}
