package test;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static com.codeborne.selenide.Selenide.open;

public class OpenPageRule implements TestRule {
    private final String url;

    public OpenPageRule(String url) {
        this.url = url;
    }

    @Override
    public Statement apply(Statement base, Description description) {

        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                open(url);
                try {
                    base.evaluate();
                }finally {

                }
            }
        };
    }
}
