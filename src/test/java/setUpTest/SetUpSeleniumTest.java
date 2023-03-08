package setUpTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetUpSeleniumTest {
    static WebDriver driver;

    /**
     * This method init the driver in order to manage the browser
     */
    @BeforeTest
    static void setUpClass() {
        WebDriverManager.edgedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        driver = new EdgeDriver();
    }


    /**
     * This is the test case the idea is that you can modify some lines to know how it works
     */
    @Test
    public void openGoogle() {
        // Exercise
        driver.get("https://google.com");
        String title = driver.getTitle();
        WebElement search = driver.findElement(By.name("q"));

        search.sendKeys("Hola mundo");
        search.submit();

        //String title = driver.getTitle();

        // Verify
        Assert.assertEquals("Google", title);
    }

    /**
     * This is to close the browser and finish the session
     */
    @AfterTest
    void tearDown() {
        driver.quit();
    }

}
