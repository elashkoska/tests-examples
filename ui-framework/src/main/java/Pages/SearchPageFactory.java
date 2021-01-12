package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {

    WebDriver driver;

    @FindBy(id = "tab-flight-tab")
    WebElement flightsTab;
    @FindBy(id = "flight-type-roundtrip-label")
    WebElement roundTrip;

    @FindBy(id = "flight-type-multi-dest-label")
    WebElement multiDestination;


    //

    @FindBy(id = "header-history")
    WebDriver headerHistory;

    @FindBy(id = "tab-flight-tab")
    WebElement flightTabs;

    @FindBy(id = "header-origin")
    WebDriver originCity;

    @FindBy(id = "flight-destination")
    WebElement destinationCity;

    @FindBy(id = "flight-departing")
    WebElement departureDate;

    @FindBy(id = "flight-returning")
    WebElement returnDate;

    public SearchPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickFlightTab() {
        flightsTab.click();
    }

    public void clickRoundTrip() {
        roundTrip.click();
    }

    public void clickMultipleDestination() {
        multiDestination.click();
    }

    public void setOriginCity(String origin) {

    }

    public void setDestination(String destination) {
        setDestination(destination);
    }

}
