package apollo;

import utilities.Duplicates;
import utilities.RandomNum;
import utilities.RandomString;

import java.sql.Connection;
import java.util.Random;
import java.util.logging.Logger;

public class TestApollo {

    static private final Logger log = Logger.getLogger(TestApollo.class.getName());

    public static void main(String[] args) {
        //System.out.println( Duplicates.duplicatesInteger(RandomNum.randomNum()));
        //System.out.println(Duplicates.duplicatesString(RandomString.randomString()));


        ///RandomNum.randomNum();
        //RandomString.randomString();
        //Duplicates.duplicatesInteger(RandomNum.randomNum());
        //Duplicates.duplicatesString(RandomString.randomString());

        Duplicates.duplicatesString(RandomString.randomString());

    }

}
