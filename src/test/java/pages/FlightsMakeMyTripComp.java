package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class FlightsMakeMyTripComp extends Base {

    By oneWayOption = By.cssSelector("li[data-cy='oneWayTrip']");
    By oneWayRadioBtn = By.cssSelector("li[data-cy='oneWayTrip'] span");

    By roundTripOption = By.cssSelector("li[data-cy='roundTrip']");
    By roundTripRadioBtn = By.cssSelector("li[data-cy='roundTrip' ] span");

    By multiCityTripOption = By.cssSelector("li[data-cy='mulitiCityTrip']");
    By multiCityTripRadioBtn = By.cssSelector("li[data-cy='mulitiCityTrip'] span");


    //From locators
    By fromOption = By.className("searchCity");
    By fromCityOption = By.id("fromCity");
    By fromAirportOption = By.cssSelector("span[data-cy='defaultFromValue']");
    By fromBtn = By.cssSelector("span[class='swipCircle']");
    By fromSearch = By.cssSelector("input[placeholder='From']");
    By fromList = By.cssSelector("li[role='option']");


    //To locators
    By toOption = By.cssSelector("label[for='toCity']>span");
    By toCityOption = By.id("toCity");
    By toAirportOption = By.cssSelector("span[data-cy='defaultToValue']");
    By toSearch = By.cssSelector("input[placeholder='To']");
    By toList = By.cssSelector("li[role='option']");

    //Departure location
    By departurebtn = By.cssSelector("label[for='departure']>span");
    By departureDateOption = By.cssSelector("p[data-cy='departureDate']");
    By departureDayOption = By.cssSelector("p[data-cy='departureDay']");
    By departureSelectDay = By.cssSelector("div[class='DayPicker-Day']");


    //Return locator
    By returnOption = By.cssSelector("div[data-cy='returnArea'] span");
    By returnDataOption = By.cssSelector("p[data-cy='returnDefaultText']");


    //Travellers & class locator
    By travellersOption = By.id("label[for='travellers']>span");
    By travellersDateOption = By.cssSelector("p[data-cy='travellerText'] >span");
    By travelClassOption = By.cssSelector("p.appendBottom1");
    By travelOffers = By.cssSelector("div[class='introGBFlt'] p");


    //Fare type
    By fareTypeOptions = By.className("specialFareNew");

    By trendingOptions = By.cssSelector("ul[class='flt-recentSearches makeFlex']");

    //Button search
    By searchBtn = By.cssSelector("p[data-cy='submit']>a");

    public FlightsMakeMyTripComp(WebDriver driver) {
        super(driver);
    }

    public By getOneWayOption() {
        return oneWayOption;
    }

    public By getOneWayRadioBtn() {
        return oneWayRadioBtn;
    }

    public By getRoundTripOption() {
        return roundTripOption;
    }

    public By getRoundTripRadioBtn() {
        return roundTripRadioBtn;
    }

    public By getMultiCityTripOption() {
        return multiCityTripOption;
    }

    public By getMultiCityTripRadioBtn() {
        return multiCityTripRadioBtn;
    }

    public void clickFromOption() {
        click(fromOption);
    }

    public boolean isFromCityOption() {
        return isDisplayed(fromCityOption);
    }

    public By getFromAirportOption() {
        return fromAirportOption;
    }

    public By getFromBtn() {
        return fromBtn;
    }

    public By getFromSearch() {
        return fromSearch;
    }

    public List<WebElement> getFromList() {
        return findElements(fromList);
    }

    public void clickToOption() {
         click(toOption);
    }

    public By getToCityOption() {
        return toCityOption;
    }

    public By getToAirportOption() {
        return toAirportOption;
    }

    public By getToSearch() {
        return toSearch;
    }

    public List<WebElement> getToList() {
        return findElements(toList);
    }

    public By getDeparturebtn() {
        return departurebtn;
    }

    public By getDepartureDateOption() {
        return departureDateOption;
    }

    public By getDepartureDayOption() {
        return departureDayOption;
    }

    public By getDepartureSelectDay() {
        return departureSelectDay;
    }

    public By getReturnOption() {
        return returnOption;
    }

    public By getReturnDataOption() {
        return returnDataOption;
    }

    public By getTravellersOption() {
        return travellersOption;
    }

    public By getTravellersDateOption() {
        return travellersDateOption;
    }

    public By getTravelClassOption() {
        return travelClassOption;
    }

    public By getTravelOffers() {
        return travelOffers;
    }

    public By getFareTypeOptions() {
        return fareTypeOptions;
    }

    public By getTrendingOptions() {
        return trendingOptions;
    }

    public By getSearchBtn() {
        return searchBtn;
    }

}
