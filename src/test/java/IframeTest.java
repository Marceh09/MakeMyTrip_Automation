import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Base;

import java.time.Duration;

import static org.bouncycastle.crypto.tls.HashAlgorithm.getText;

public class IframeTest {

    static WebDriver driver;
    By iframe = By.cssSelector("iframe[src='default.asp']");

    //By cssTitle = By.xpath("//h1[contains(text(), 'CSS')]");

    @BeforeTest
    static void setUpClass() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }

    @Test
    public void testIframeW3school(){
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        driver.switchTo().frame(driver.findElement(iframe));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.cssSelector("a[title='CSS Tutorial']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Assert.assertTrue(driver.findElement(titleCss).isDisplayed());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
