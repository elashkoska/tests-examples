package tests;


import Pages.SearchPage;
import Pages.SearchPageFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FrameworkTestCase {

    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPageFactory;


    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

        searchPageFactory = new SearchPageFactory(driver);
        baseUrl = "https://www.expedia.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() {
        SearchPage.clickOnSearchButton(driver);
        searchPageFactory.setOriginCity("New York");
        searchPageFactory.setDestination("Chicago");
    }

    @AfterAll
    public void tearDown() throws Exception {

    }
}
