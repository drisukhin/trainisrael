package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RavKavPage extends Page {
    @FindBy(xpath = "//a[@href='/en/ravkav/Pages/default.aspx']")
    WebElement ravkav;

    @FindBy(xpath = "//span[@role='button']")
    WebElement clickbuy;

    @FindBy(xpath = "//a[@href='/en/pages/ravkavform.aspx'][contains(text(),'Buy tickets online')]")
    WebElement buytickets;


    public RavKavPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);

    }

    public void ravkavButton() throws InterruptedException {
        ravkav.click();
        Thread.sleep(1000);
    }

    public void clickButton(){
        clickbuy.click();

    }

    public void buyticketsButton () throws InterruptedException {
        buytickets.click();
        Thread.sleep(3000);


    }
}
