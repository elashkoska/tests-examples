package com.fe;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ElementDisplayed {
    WebDriver driver;
    String baseUrl;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    void testDisplay() throws Exception {
        driver.get(baseUrl);

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text Box displayed " + textBox.isDisplayed());

        Thread.sleep(2000);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("Text box is displayed " + textBox.isDisplayed());

        Thread.sleep(2000);
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Text box is displayed " + textBox.isDisplayed());

    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
}
