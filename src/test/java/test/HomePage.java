package test;

import org.junit.Rule;
import org.testng.annotations.Test;
import page_steps.HomePageSteps;

public class HomePage extends test.Test {
    //@Rule OpenPageRule openPageRule = new OpenPageRule("https://pn.com.ua");

    @Test
    //Test1
    public void checkThatBannerIsVisible() {

        new HomePageSteps()
                .checkThatBannerIsVisible();
    }

    @Test
    //Test2
    public void checkNavigation() {
        new HomePageSteps()
                .findTextAndClick()
                .checkTitle();
    }

    @Test
    //Test3
    public void checkChangingCity() {
        new HomePageSteps()
                .findLogoCityAndClickOnIt()
                .findCityandClickOnIt()
                .checkTitle2();
    }

    @Test
    //Test4
    public void enterDataToSearchField() {
        new HomePageSteps()
                .findSearchField()
                .clickOnSearchButton()
                .findTitleAfterSearchPerformance();
    }

    @Test
    //Test 5
    public void RegisterNewUser() {
        new HomePageSteps()
                .findSignInAndClickOnIt()
                .findSignInLinkAndClickOnIt()
                .checkSignInDialogeVisible()
                .findRegisterLinkCkickOnIt()
                .findEmailFieldAndEnterDataIntoIt()
                .findPasswordFieldAndClickOnIt();

    }
}
