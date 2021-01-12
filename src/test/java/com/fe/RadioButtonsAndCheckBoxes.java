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
public class RadioButtonsAndCheckBoxes {
    WebDriver driver;
    String baseUrl;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    void test() throws Exception {
        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        bmwRadioButton.click();

        Thread.sleep(2000);
        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        benzRadioBtn.click();

        Thread.sleep(2000);
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();

        System.out.println("BMW Radio is selected" + bmwRadioButton.isSelected());
        System.out.println("Benz Radio is selected" + benzRadioBtn.isSelected());
        System.out.println("Bmw check Box is selected" + bmwCheckBox.isSelected());
    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
}
