package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentFormPage extends Page{

    @FindBy(id ="first_name")

    WebElement first;


    public PaymentFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void firstName() throws InterruptedException {
        first.click();
        Thread.sleep(1000);

    }
}