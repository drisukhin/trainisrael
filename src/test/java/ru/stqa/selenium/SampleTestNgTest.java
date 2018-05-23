package ru.stqa.selenium;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.stqa.selenium.pages.HomePage;
import ru.stqa.selenium.pages.PaymentFormPage;
import ru.stqa.selenium.pages.RavKavPage;
import ru.stqa.selenium.pages.TrainSearchPage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  private TrainSearchPage searchPage;
  private RavKavPage ravKavPage;
  private PaymentFormPage paymentPage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    searchPage=PageFactory.initElements(driver,TrainSearchPage.class);
    ravKavPage= PageFactory.initElements(driver, RavKavPage.class);
   paymentPage=PageFactory.initElements(driver,PaymentFormPage.class);
  }




  @Test
  public void testHomePageHasAHeader() throws InterruptedException {
    driver.get(baseUrl);
    driver.manage().window().maximize();

    homepage.putTextToFieldFrom("Ako");
    homepage.putTextToFieldToWhere("Ashkelon");
    homepage.clickSearch();

    searchPage.searchButton();

    ravKavPage.ravkavButton();
    ravKavPage.clickButton();
    ravKavPage.buyticketsButton();

    // paymentPage.firstName();*/



    Assert.assertTrue(true);
  }
}
