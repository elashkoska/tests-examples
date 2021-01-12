package com.fe;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WorkingWithElementsList {
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
    void testListOfElements() throws Exception {
        boolean isChecked = false;
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
       // List<WebElement> radioButtons = driver.findElements(By.name("cars"));
        int size = radioButtons.size();
        System.out.println("Size of the list is" + size);
        for (int i = 0; i < size; i++) {
            isChecked = radioButtons.get(i).isSelected();

            if ((!isChecked)) {
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }

        }
    }

    @AfterAll
    void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
}
