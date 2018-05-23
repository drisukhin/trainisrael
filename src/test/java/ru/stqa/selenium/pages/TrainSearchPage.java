package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainSearchPage extends Page {
    @FindBy(xpath = "//a[@href='/en/about']")
    WebElement search;

    public TrainSearchPage(WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(driver, this);
    }

    public void searchButton() throws InterruptedException {

        search.click();
        Thread.sleep(1000);
    }
}
