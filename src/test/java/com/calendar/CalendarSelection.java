package com.calendar;

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
public class CalendarSelection {
    WebDriver driver;
    String baseUrl;


    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

        // baseUrl = "https://letskodeit.teachable.com/p/practice";
        baseUrl = "https://www.expedia.com/";


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    void test() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[2]/a")).click();
        WebElement departingField = driver.findElement(By.id("d1-btn"));
        departingField.click();
        WebElement dateToSelect = driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[5]/button"));
        dateToSelect.click();

    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
}
