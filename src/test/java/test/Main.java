package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.Waiter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Main {

    public static void main(String[] args) {


       open("https://ru.selenide.org/quick-start.html");
       $(By.xpath("/html/body/div[2]/section/div[1]/div/h3")).waitUntil(visible,20000);

    }
}
