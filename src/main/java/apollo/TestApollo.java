package apollo;

import utilities.Duplicates;
import utilities.RandomNum;
import utilities.RandomString;

public class TestApollo {
    public static void main(String[] args) {
        System.out.println(RandomNum.randomNum());
        System.out.println(RandomString.randomString());
        System.out.println( Duplicates.duplicatesInteger(RandomNum.randomNum()));
        System.out.println(Duplicates.duplicatesString(RandomString.randomString()));

    }

}
