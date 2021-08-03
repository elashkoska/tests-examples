package Utils;

import Enums.DriverTyppeEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private final static String GOOGLE_CHROME_SETUP_NAME = "webdriver.chrome.driver" ;
    private final static String GOOGLE_CHROME_SETUP_PATH = "src/main/resources/Drivers/chromedriver.exe" ;


    public static WebDriver createDriverForBrowserWithValue(DriverTyppeEnum driverTyppeEnum) {

        WebDriver driver = null;
        if (driverTyppeEnum.equals(DriverTyppeEnum.GOOGLE_CHROME_DRIVER)) {
             driver=new ChromeDriver();
        }


        if(driver==null){
            throw new RuntimeException("Driver wasn't initialised");
        }

        driver.manage().window().maximize();
        return null;
    }
}
