package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
    By returnDaySelect = By.cssSelector("div[class='dateInnerCell']");
    By returnDataOption = By.cssSelector("p[data-cy='returnDate']");


    //Travellers & class locator
    By travellersOption = By.cssSelector("div[data-cy='flightTraveller']");
    By travelernumberOption = By.cssSelector("ul[class='guestCounter font12 darkText gbCounter'] li");
    By travellersDateOption = By.cssSelector("span[data-cy='travellerText']");
    By travelClassOption = By.cssSelector("p.appendBottom1");
    By travelOffers = By.cssSelector("div[class='introGBFlt'] p");


    //Button Apply
    By btnApply = By.xpath("//button[contains(text(), 'APPLY')]");


    //Fare type
    By fareTypeOptions = By.className("specialFareNew");

    By trendingOptions = By.cssSelector("ul[class='flt-recentSearches makeFlex']");

    //Button search
    By searchBtn = By.cssSelector("p[data-cy='submit']>a");

    //Iframe locators
    By iframe = By.name("notification-frame-~55850c31");
    By closeIframe = By.id("webklipper-publisher-widget-container-notification-close-div");


    //advertising Modal locator:
    By advertisingModal = By.cssSelector("div[class='imageSlideContainer']");
    By advertisingModalClose = By.className("commonModal__close");


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

    //Method click from option
    public void clickFromOption() {
        click(fromOption);
        wait(2);
    }

    //Method verifies if the element FromCity is present and displayed
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

    //List of from elements
    public List<WebElement> getFromList() {
        return findElements(fromList);
    }

    //Method click to option
    public void clickToOption() {
        click(toOption);
        wait(2);
    }

    //Method verifies if the element ToCity is present and displayed
    public boolean isToCityOption() {
        return isDisplayed(toCityOption);
    }

    public By getToAirportOption() {
        return toAirportOption;
    }

    public By getToSearch() {
        return toSearch;
    }

    //List of to elements
    public List<WebElement> getToList() {
        return findElements(toList);
    }

    public void clickDepartureBtn() {
        click(departurebtn);
    }

    public boolean isDepartureDateOption() {
        return isDisplayed(departureDateOption);
    }

    public By getDepartureDayOption() {
        return departureDayOption;
    }

    //Lit of Departure day element
    public List<WebElement> getDepartureSelectDay() {
        return findElements(departureSelectDay);
    }

    public void clickReturnOption() {
        click(returnOption);
    }

    //List return day elements
    public List<WebElement> getReturnDaySelect() {
        return findElements(returnDaySelect);
    }

    public boolean isReturnDataOption() {
        return isDisplayed(returnDataOption);
    }

    public void clickTravellersOption() {
        click(travellersOption);
    }

    //List of traveler number elements
    public List<WebElement> getTravelerNumberOption() {
        return findElements(travelernumberOption);
    }

    public boolean isTravellersDateOption() {
        return isDisplayed(travellersDateOption);
    }

    public By getTravelClassOption() {
        return travelClassOption;
    }

    public By getTravelOffers() {
        return travelOffers;
    }

    public void clickBtnApply() {
        click(btnApply);
    }

    public By getFareTypeOptions() {
        return fareTypeOptions;
    }

    public By getTrendingOptions() {
        return trendingOptions;
    }

    //Method click Search flight button
    public void clickSearchBtn() {
        click(searchBtn);
    }

    //Click method closes modal
    public void clickAdvertisingModalCLose() {
        click(advertisingModalClose);
    }

    //Method verifies if the modal is visible
    public boolean isAdvertisingModal() {
        return isDisplayed(advertisingModal);
    }

    //Method to close the iframe
    public void closeIframe() {
        switchToIframe(iframe);
        click(closeIframe);
        defaultContent();
    }

    //Method verifies if the modal is visible and close it
    public void verifyAndCloseModal() {
        if (isAdvertisingModal()) {
            wait(2);
            clickAdvertisingModalCLose();
        }
    }

    //Method select the from option
    public void selectFromOption(){
        clickFromOption();
        List<WebElement> fromList = getFromList();
        for (WebElement optionFromList : fromList) {
            if (optionFromList.getText().contains("Dubai")) {
                wait(2);
                optionFromList.click();
                break;
            }
            wait(2);
        }

        Assert.assertTrue(isFromCityOption(), "Dubai");
    }

    //Method select to option
    public void selectToOption(){
        clickToOption();
        List<WebElement> toList = getToList();
        for (WebElement optionToList : toList){
            if (optionToList.getText().contains("Pune")) {
                wait(2);
                optionToList.click();
                break;
            }
            wait(2);
        }
        Assert.assertTrue(isToCityOption(), "Pune");
    }

    //Method departure option
    public void selectDepartureOption(){
        clickDepartureBtn();
        List<WebElement> departureList = getDepartureSelectDay();
        for (WebElement dayDepartureList : departureList){
            if (dayDepartureList.getText().contains("20")){
                wait(2);
                dayDepartureList.click();
                break;
            }
            wait(2);
        }
        Assert.assertTrue(isDepartureDateOption(),"20");
    }

    //Method select return option
    public void selectReturnOption(){
        clickReturnOption();
        List<WebElement> returnList = getReturnDaySelect();
        for (WebElement dayReturnList : returnList) {
            if (dayReturnList.getText().contains("25")){
                wait(2);
                dayReturnList.click();
                break;
            }
            wait(2);
        }
        Assert.assertTrue(isReturnDataOption(),"25");
    }

    //Method select travellers option
    public void selectTravellersOption(){
        clickTravellersOption();
        List<WebElement> travellersList = getTravelerNumberOption();
        for (WebElement travelersNumberList : travellersList) {
            if (travelersNumberList.getText().contains("2")) {
                wait(2);
                travelersNumberList.click();
                clickBtnApply();
                break;
            }
            wait(2);
        }
        Assert.assertTrue(isTravellersDateOption(), "2");
    }
}
