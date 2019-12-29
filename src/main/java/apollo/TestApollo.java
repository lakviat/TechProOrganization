package apollo;

import utilities.Duplicates;
import utilities.RandomNum;
import utilities.RandomString;

import java.util.Random;

public class TestApollo {
    public static void main(String[] args) {
        //System.out.println( Duplicates.duplicatesInteger(RandomNum.randomNum()));
        //System.out.println(Duplicates.duplicatesString(RandomString.randomString()));

        RandomNum.randomNum();
        RandomString.randomString();
        Duplicates.duplicatesInteger(RandomNum.randomNum());
        Duplicates.duplicatesString(RandomString.randomString());

    }

}
