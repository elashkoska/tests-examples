package com.fe;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DropdownSelect {
    WebDriver driver;
    String baseUrl;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    void testListOfElements() throws Exception {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);


        Thread.sleep(2000);
        sel.selectByValue("benz");

        Thread.sleep(2000);
        sel.selectByIndex(2);

        Thread.sleep(2000);
        sel.selectByVisibleText("BMW");


        List<WebElement>options=sel.getOptions();
        int size=options.size();
        for (int i=0;i<size;i++)
        {
            String optionName=options.get(i).getText();
            System.out.println(optionName);
        }
    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
}
