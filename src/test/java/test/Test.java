package test;

import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class Test {

    @BeforeClass
    public void beforeClass(){
        open("https://pn.com.ua");
    }
}
