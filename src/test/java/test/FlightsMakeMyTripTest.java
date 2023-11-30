package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FlightsMakeMyTripComp;

import java.time.Duration;
import java.util.List;

public class FlightsMakeMyTripTest extends BaseTest {
    static FlightsMakeMyTripComp flightsMakeMyTrip;

    @BeforeClass
    public void initPage(){
        flightsMakeMyTrip = new FlightsMakeMyTripComp(driver);
        flightsMakeMyTrip.wait(5);
        //flightsMakeMyTrip.closeIframe();
        flightsMakeMyTrip.verifyAndCloseModal();

    }

    @Test
    public void testDropDownList(){
        flightsMakeMyTrip.clickFromOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> lista = flightsMakeMyTrip.getFromList();
        for (WebElement optionListFrom : lista) {
            if (optionListFrom.getText().contains("Dubai")) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                optionListFrom.click();
                break;
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        }

        Assert.assertTrue(flightsMakeMyTrip.isFromCityOption(), "Dubai");
    }

    @Test
    public void testToList(){
        flightsMakeMyTrip.clickToOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> toList = flightsMakeMyTrip.getToList();
        System.out.println(toList.size());
        System.out.println(toList.get(2).getText().split("\n", 0)[0]);

        Assert.assertTrue(flightsMakeMyTrip.isToCityOption(), "Bangkok");
    }

    @Test
    public void testSelectFlights(){
        flightsMakeMyTrip.selectFromOption();
        flightsMakeMyTrip.selectToOption();
        flightsMakeMyTrip.selectDepartureOption();
        flightsMakeMyTrip.selectReturnOption();
        flightsMakeMyTrip.selectTravellersOption();
        flightsMakeMyTrip.clickSearchBtn();
    }
}

