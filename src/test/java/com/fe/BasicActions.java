package com.fe;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BasicActions {
    WebDriver driver;
    String baseUrl;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void test() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();
    }

    @AfterAll
    void tearDown() throws Exception {
    driver.quit();

    }
}
