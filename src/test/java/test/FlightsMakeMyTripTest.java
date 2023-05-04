package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FlightsMakeMyTripComp;

import java.time.Duration;
import java.util.List;

public class FlightsMakeMyTripTest {

    static WebDriver driver;
    static FlightsMakeMyTripComp flightsMakeMytrip;

    @BeforeTest
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(edgeOptions);
        flightsMakeMytrip = new FlightsMakeMyTripComp(driver);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @Test
    public void testDropDownList(){
        flightsMakeMytrip.closeAdvertising();
        flightsMakeMytrip.clickFromOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> lista = flightsMakeMytrip.getFromList();

        for (WebElement optionListFrom : lista) {
            if (optionListFrom.getText().contains("Dubai")) {
                optionListFrom.click();
                break;
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        }

        Assert.assertTrue(flightsMakeMytrip.isFromCityOption(), "Dubai");
    }

    @Test
    public void testToList(){
        flightsMakeMytrip.closeAdvertising();
        flightsMakeMytrip.clickToOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> lista = flightsMakeMytrip.getToList();
        System.out.println(lista.size());
        System.out.println(lista.get(2).getText().split("\n", 0)[0]);

        Assert.assertTrue(flightsMakeMytrip.isToCityOption(), "Bangkok");
    }

    @AfterTest
    void tearDown(){
        driver.quit();
    }
}

