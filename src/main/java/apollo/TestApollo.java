package apollo;

import utilities.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class TestApollo {

    static private final Logger log = Logger.getLogger(TestApollo.class.getName());


    public static void main(String[] args) {

        RandomNum.randomNum();
        RandomString.randomString();

       RemoveZeros.removeZeros(RandomNum.RandomInteger);

       Duplicates.duplicatesString(RandomString.RandomString); // Ayganysh
       Duplicates.duplicatesInteger(RandomNum.RandomInteger);  // Maks

       Anagram.anagram(RandomString.RandomString); // Zhazgul



    }

}
