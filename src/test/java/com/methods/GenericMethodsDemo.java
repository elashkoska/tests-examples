package com.methods;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GenericMethodsDemo {
    WebDriver driver;
    String baseUrl;
    GenericMethods genericMethods;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://letskodeit.teachable.com/p/practice";
        genericMethods = new GenericMethods(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    void testGetText() throws Exception {
        driver.get(baseUrl);
        WebElement element = genericMethods.getElement("name", "id");
        element.sendKeys("test");

    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        // driver.quit();

    }
}