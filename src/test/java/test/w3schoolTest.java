package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.W3schoolsComp;

import java.time.Duration;

public class w3schoolTest {

    static WebDriver driver;
    static W3schoolsComp w3Schools;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    public void openHomeW3Schools(){
        w3Schools = new W3schoolsComp(driver);
        driver = w3Schools.edgeDriverSetUpHome();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
    }

    @Test
    public void testIframeW3Schools(){
        w3Schools.clickHtmlTutorials();
        w3Schools.clickLearnHtmlOption();
        w3Schools.clickHtmlIframesOption();
        w3Schools.switchToIframe(w3Schools.getIframe());
        w3Schools.clickCssInIframe();

        String titleCSS = w3Schools.getTexTitleCSS();
        Assert.assertEquals(titleCSS,"CSS Tutorial");
    }

    @AfterTest
    public void tearDown(){ driver.quit();
    }
}
