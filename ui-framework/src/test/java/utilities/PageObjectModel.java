package utilities;

import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PageObjectModel {
    private WebDriver driver;
    private String baseUrl;


    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elashkoska\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

        baseUrl = "https://www.expedia.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() {
        driver.get(baseUrl);
        SearchPage.fillOriginTextBox(driver, "New York");
        SearchPage.destinationTextBox(driver).sendKeys("Chicago");
        SearchPage.departureDateTextBox(driver).sendKeys("12/12/2020");
        SearchPage.returnDateTextBox(driver).sendKeys("30/12/2020");
        SearchPage.clickOnSearchButton(driver);
    }

    @AfterAll
    public void tearDown() throws Exception {

    }
}
