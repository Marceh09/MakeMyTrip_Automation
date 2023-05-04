package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class W3schoolsComp extends Base{

    //HTML locators
    By htmlTutorials = By.id("navbtn_tutorials");
    By learnHtmlOption = By.cssSelector("a[href='/html/default.asp']");
    By htmlIframesOption = By.cssSelector("a[href='html_iframe.asp']");

    //Iframe locators
    By iframe = By.cssSelector("iframe[src='default.asp']");
    By cssInIframe = By.cssSelector("a[title='CSS Tutorial']");

    public By getCssTitle() {
        return cssTitle;
    }

    By cssTitle = By.xpath("//h1[contains(text(), 'CSS')]");

    //builder
    public W3schoolsComp(WebDriver driver) {
        super(driver);
    }

    //Methods
    public void clickHtmlTutorials() {
        click(htmlTutorials);
    }

    public void clickLearnHtmlOption() {
        click(learnHtmlOption);
    }

    public void clickHtmlIframesOption() {
        click(htmlIframesOption);
    }

    //Method get frame
    public By getIframe() { return iframe;
    }

    //Method click in CSS of iframe
    public void clickCssInIframe() {
        click(cssInIframe);
    }

    public String getTexTitleCSS(){
        return getText(cssTitle);
    }
}
