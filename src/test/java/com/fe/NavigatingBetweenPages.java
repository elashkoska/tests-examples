package com.fe;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NavigatingBetweenPages {
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
        String title = driver.getTitle();
        System.out.println("Title of the page is:" + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is:" + currentUrl);

        String urlToNavigate="https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);

        currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        Thread.sleep(2000);
        driver.navigate().back();

        currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        Thread.sleep(2000);
        driver.navigate().forward();
        currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        driver.navigate().refresh();

    }

    @AfterAll
    void tearDown() throws Exception {
        driver.quit();

    }
}
