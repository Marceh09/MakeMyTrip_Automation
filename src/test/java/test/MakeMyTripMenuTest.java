package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Base;

public class MakeMyTripMenuTest {

    static WebDriver driver;
    @BeforeTest
    public void setUpClass(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void testMakeMyTrip(){

    }

    @AfterTest
    void tearDown(){
        driver.quit();
    }
}
