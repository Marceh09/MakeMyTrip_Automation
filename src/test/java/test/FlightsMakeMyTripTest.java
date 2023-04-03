package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
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
        driver = new EdgeDriver();
        flightsMakeMytrip = new FlightsMakeMyTripComp(driver);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @Test
    public void testDropDownList(){
        flightsMakeMytrip.clickFromOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> lista = flightsMakeMytrip.getFromList();
        System.out.println("Tamaño de la lista: "+lista.size());
        System.out.println(lista.get(0).getText());
    }

    @AfterTest
    void tearDown(){
        driver.quit();
    }
}

