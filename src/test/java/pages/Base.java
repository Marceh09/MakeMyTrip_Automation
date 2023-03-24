package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    //Object WebDriver
    private WebDriver driver;

    //Builder
    //parameter->object WebDriver
    public Base(WebDriver driver){
        this.driver = driver;
    }

    //Wrapping of Methods selenium
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void click(By lacator){
        driver.findElement(lacator).click();
    }
}
