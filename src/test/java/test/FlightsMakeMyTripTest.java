package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FlightsMakeMyTripComp;

import java.time.Duration;
import java.util.List;

public class FlightsMakeMyTripTest extends BaseTest {
    static FlightsMakeMyTripComp flightsMakeMytrip;

    @BeforeClass
    public void initPage(){
        flightsMakeMytrip = new FlightsMakeMyTripComp(driver);
        flightsMakeMytrip.wait(5);
        flightsMakeMytrip.closeAdvertising();
    }

    @Test
    public void testDropDownList(){
        //flightsMakeMytrip.closeAdvertising();
        flightsMakeMytrip.clickFromOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> lista = flightsMakeMytrip.getFromList();
        for (WebElement optionListFrom : lista) {
            if (optionListFrom.getText().contains("Dubai")) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                optionListFrom.click();
                break;
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        }

        Assert.assertTrue(flightsMakeMytrip.isFromCityOption(), "Dubai");
    }

    @Test
    public void testToList(){
        //flightsMakeMytrip.closeAdvertising();
        flightsMakeMytrip.clickToOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> lista = flightsMakeMytrip.getToList();
        System.out.println(lista.size());
        System.out.println(lista.get(2).getText().split("\n", 0)[0]);

        Assert.assertTrue(flightsMakeMytrip.isToCityOption(), "Bangkok");
    }

    @Test
    public void testSelectFlights(){
        //flightsMakeMytrip.closeAdvertising();
        flightsMakeMytrip.selectFromOption();
        flightsMakeMytrip.selectToOption();
        flightsMakeMytrip.selectDepartureOption();
        flightsMakeMytrip.selectReturnOption();
        flightsMakeMytrip.selectTravellersOption();
    }

    

    @AfterTest
    void tearDown(){
        driver.quit();
    }
}

