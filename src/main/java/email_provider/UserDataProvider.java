package email_provider;

import java.util.Random;

public class UserDataProvider {

    public String getRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        return "username"+ randomInt +"@gmail.com";
    }
}
