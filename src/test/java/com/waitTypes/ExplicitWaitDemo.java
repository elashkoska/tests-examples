package com.waitTypes;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.DocFlavor;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExplicitWaitDemo {
    WebDriver driver;
    String baseUrl;
    WaitTypes wt;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://letskodeit.teachable.com/p/practice";
        wt=new WaitTypes(driver);


        driver.manage().window().maximize();

    }

    @Test
    void test() throws Exception {
        driver.get(baseUrl);

        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();
        WebElement emailField=wt.waitForElement(By.id("user_email"),3);
        emailField.sendKeys("test");


        wt.clickWhenReady(By.id("commit"),3);
      //  WebDriverWait wait=new WebDriverWait(driver,3);
      //  WebElement emailField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
       // emailField.sendKeys("test");

      //  driver.findElement(By.id("user_email")).sendKeys("test");


    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
}
