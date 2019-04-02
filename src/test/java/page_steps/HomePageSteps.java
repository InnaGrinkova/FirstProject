package page_steps;


import email_provider.UserDataProvider;
import pages.HomePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePageSteps {

    private HomePage pageInstance = new HomePage();

    //Tes1 checkThatBannerIsVisible
    public HomePageSteps checkThatBannerIsVisible() {
        $(pageInstance.getBanner()).shouldBe(visible);
        return this;
    }

    // Test2 checkNavigation
    public HomePageSteps findTextAndClick() {
        $(pageInstance.findLink()).shouldBe(text("Диваны")).click();
        return this;
    }

    public HomePageSteps checkTitle() {
        $(pageInstance.findTitle()).shouldBe(text("Диваны для гостинной в Харькове "));
        return this;
    }

    //Test3 checkChangingCity
    public HomePageSteps findLogoCityAndClickOnIt() {
        $(pageInstance.findLogoCity()).shouldBe(text("Харьков")).click();
        return this;
    }

    public HomePageSteps findCityandClickOnIt() {
        $(pageInstance.findCity()).shouldBe(text("Тернополь"));
        return this;
    }

    public HomePageSteps checkTitle2() {
        $(pageInstance.findCity2()).shouldBe(text("Тернополь"));
        return this;
    }

    //Test4 enterDataToSearchField
    public HomePageSteps findSearchField() {
        $(pageInstance.searchField()).setValue("Телефоны");
        return this;
    }

    public HomePageSteps clickOnSearchButton() {
        $(pageInstance.searchButton()).click();
        return this;
    }

    public HomePageSteps findTitleAfterSearchPerformance() {
        $(pageInstance.findTitle2()).shouldBe(text("Телефоны"));
        return this;
    }

    //Test5 RegisterNewUser
    public HomePageSteps findSignInAndClickOnIt() {
        $(pageInstance.findSignIn()).click();
        return this;
    }

    public HomePageSteps findSignInLinkAndClickOnIt() {
        $(pageInstance.findLink1()).click();
        return this;
    }

    public HomePageSteps checkSignInDialogeVisible() {
        $(pageInstance.checkDialoge()).shouldBe(visible);
        return this;
    }

    public HomePageSteps findRegisterLinkCkickOnIt() {
        $(pageInstance.findLink2()).click();
        return this;
    }

    public HomePageSteps findEmailFieldAndEnterDataIntoIt() {
        String randomEmail = new UserDataProvider().getRandomEmail();
        $(pageInstance.emailField()).setValue(randomEmail);
        return this;
    }

    public HomePageSteps findPasswordFieldAndClickOnIt(){
        $(pageInstance.getPasswordField()).click();
        return this;
    }

    public HomePageSteps findPasswordFieldAndClickOnIt2(){
        $(pageInstance.getPasswordField()).click();
        return this;
    }
}
