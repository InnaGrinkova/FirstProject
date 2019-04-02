package pages;

import org.openqa.selenium.By;

public class HomePage {
//Test1
    private By banner = By.xpath("/html/body/div[1]/header/div/div[1]/div[2]");
    public By getBanner() {
        return banner;
    }

//Test2
    private By text = By.xpath("//*[@id=\"column-center\"]/div/ul/li[5]/a/small");
    public By findLink(){return text;}

    private By title = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/ul/li[3]/h1/span");
    public By findTitle() {return title;}

//Test3
    private By logoCity = By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a/span[2]");
    public By findLogoCity() {return logoCity;}

    private By city = By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[2]/div/div[3]/ul/li[1]/a");
    public By findCity(){return city;}

    private By city2 = By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a/span[2]");
    public By findCity2(){return city2;}

//Test4
    private By field = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/input");
    public By searchField(){return field;}

    private By button = By.xpath("//*[@id=\"search\"]/div[1]/div[3]/input");
    public By searchButton(){return button;}

    private By title2 = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div/span");
    public By findTitle2(){return title2;}

    private By field1 = By.xpath("//*[@id=\"register-form-email\"]");
    public By emailField(){return field1;}

//Test5
    private By dropDown = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/nav/ul/li[3]/span/a");
    public By findSignIn(){return dropDown;}

    private By dialogeSignIn = By.xpath("//*[@id=\"login-form-container\"]/div/div/div");
    public By checkDialoge(){return dialogeSignIn;}

    private By text1 = By.xpath("//*[@id=\"userSettings\"]/li[4]");
    public By findLink1(){return text1;}

    private By text2 = By.xpath("//*[@id=\"login-form-container\"]/div/div/div/div/div/div[2]/div/div[2]/p/a");
    public By findLink2(){return text2;}

    private By passwordField = By.xpath("//*[@id=\"register-form-password\"]");
    public By getPasswordField(){return passwordField;}

    private By passwordField = By.name();
    public By getPasswordField(){return passwordField;}
}

