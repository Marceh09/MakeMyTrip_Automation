import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class YoutubeTest {

    static WebDriver driver;

    /**
     * This method init the driver in order to manage the browser
     */
    @BeforeTest
    static void setUpClass() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openYouTube() {
        // Exercise: Replay YouTube video
        driver.get("https://youtube.com");
        String title = driver.getTitle();
        WebElement search = driver.findElement(By.name("search_query"));

        search.sendKeys("rush");
        search.submit();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement song = driver.findElement(By.cssSelector("a[href=\"/watch?v=crtQSTYWtqE\"]"));
        song.click();

        // Verify
        Assert.assertEquals("YouTube", title);
    }

    /**
     * This is to close the browser and finish the session
     */
    @AfterTest
    void tearDown() {
        driver.quit();
    }
}
