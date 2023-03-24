package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeMyTripHome extends Base {

        public MakeMyTripHome(WebDriver driver){
            super(driver);
        }

        public By getFlightMenuOption() {
                return flightMenuOption;
        }

        public By getFlightMenuIcon() {
                return flightMenuIcon;
        }

        public By getFlightMenuLabel() {
                return flightMenuLabel;
        }

        public By getHotelsMenuOption() {
                return hotelsMenuOption;
        }

        public By getHotelsMenuIcon() {
                return hotelsMenuIcon;
        }

        public By getHotelsMenuLabel() {
                return hotelsMenuLabel;
        }

        public By getHometaysMenuOption() {
                return hometaysMenuOption;
        }

        public By getHometaysMenuIcon() {
                return hometaysMenuIcon;
        }

        public By getHometaysMenuLabel() {
                return hometaysMenuLabel;
        }

        public By getHolidaysMenuOption() {
                return holidaysMenuOption;
        }

        public By getHolidaysMenuIcon() {
                return holidaysMenuIcon;
        }

        public By getHolidaysMenuLabel() {
                return holidaysMenuLabel;
        }

        public By getTrainsMenuOption() {
                return trainsMenuOption;
        }

        public By getTrainsMenuIcon() {
                return trainsMenuIcon;
        }

        public By getTrainsMenuLabel() {
                return trainsMenuLabel;
        }

        public By getBusesMenuOption() {
                return busesMenuOption;
        }

        public By getBusesMenuIcon() {
                return busesMenuIcon;
        }

        public By getBusesMenuLabel() {
                return busesMenuLabel;
        }

        public By getCabsMenuOption() {
                return cabsMenuOption;
        }

        public By getCabsMenuIcon() {
                return cabsMenuIcon;
        }

        public By getCabsMenuLabel() {
                return cabsMenuLabel;
        }

        public By getForexMenuOption() {
                return forexMenuOption;
        }

        public By getForexMenuIcon() {
                return forexMenuIcon;
        }

        public By getForexMenuLabel() {
                return forexMenuLabel;
        }

        public By getCharterFlightsMenuOption() {
                return charterFlightsMenuOption;
        }

        public By getCharterFlightsMenuIcon() {
                return charterFlightsMenuIcon;
        }

        public By getCharterFlightsMenuLabel() {
                return charterFlightsMenuLabel;
        }

        public By getActivitiesMenuOption() {
                return activitiesMenuOption;
        }

        public By getActivitiesMenuIcon() {
                return activitiesMenuIcon;
        }

        public By getActivitiesMenuLabel() {
                return activitiesMenuLabel;
        }

        //Flights
        By flightMenuOption = By.className("menu_Flights");
        By flightMenuIcon = By.cssSelector("a .chFlights");
        By flightMenuLabel = By.cssSelector("li.menu_Flights .chNavText");

        //Hotels
        By hotelsMenuOption = By.cssSelector("li.menu_Hotels a.hrtlCenter");
        By hotelsMenuIcon = By.cssSelector("li .chHotels");
        By hotelsMenuLabel = By.className("li.menu_Hotels .chNavText");

        //Hometays
        By hometaysMenuOption = By.cssSelector("li.menu_Homestays a.hrtlCenter");
        By hometaysMenuIcon = By.cssSelector("li .chHomestays");
        By hometaysMenuLabel = By.className("li.menu_Homestays .chNavText");

        //Holidays
        By holidaysMenuOption = By.cssSelector("li.menu_Holidays a.hrtlCenter");
        By holidaysMenuIcon = By.cssSelector("li .chHolidays");
        By holidaysMenuLabel = By.cssSelector("li.menu_Holidays .chNavText");

        //Trains
        By trainsMenuOption = By.cssSelector("li.menu_Trains a.hrtlCenter");
        By trainsMenuIcon = By.cssSelector("li .chTrains");
        By trainsMenuLabel = By.cssSelector("li.menu_Trains .chNavText");

        //Buses
        By busesMenuOption = By.cssSelector("li.menu_Buses a.hrtlCenter");
        By busesMenuIcon = By.cssSelector("li .chBuses");
        By busesMenuLabel = By.cssSelector("li.menu_Buses .chNavText");

        //Cabs
        By cabsMenuOption = By.cssSelector("li.menu_Cabs a.hrtlCenter");
        By cabsMenuIcon = By.cssSelector("li .chCabs");
        By cabsMenuLabel = By.cssSelector("li.menu_Cabs .chNavText");

        //Forex
        By forexMenuOption = By.cssSelector("li.menu_Forex a.hrtlCenter");
        By forexMenuIcon = By.cssSelector("li .chForex");
        By forexMenuLabel = By.cssSelector("li.menu_Forex .chNavText");

        //Charter Flights
        By charterFlightsMenuOption = By.cssSelector("li.menu_CharterFlights a.hrtlCenter");
        By charterFlightsMenuIcon = By.cssSelector("li .chCharterFlights");
        By charterFlightsMenuLabel = By.cssSelector("li.menu_CharterFlights .chNavText");

        //Activities
        By activitiesMenuOption = By.cssSelector("li.menu_Activities a.hrtlCenter");
        By activitiesMenuIcon = By.cssSelector("li .chActivities");
        By activitiesMenuLabel = By.cssSelector("li.menu_Activities .chNavText");





}
