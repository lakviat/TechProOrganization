package apollo;

import utilities.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class TestApollo implements CharCount {

    public static ArrayList<String> RandomStr;
    public static ArrayList<Integer> RandomInt;

    @Override
    public void DigitCount() {

        //This is my code i want to merge with master branch, and this is what i done so far

    }

    @Override
    public void StringCharcount() {

    }




    public static void main(String[] args) {
        //RandomNum.randomNum();              //Arif
        //RandomString.randomString();        //Arif

        RandomStr = RandomString.randomString();
        RandomInt = RandomNum.randomNum();

       RemoveZeros.removeZeros(RandomInt);     //Begimai

       Duplicates.duplicatesString(RandomStr);      // Ayganysh
       Duplicates.duplicatesInteger(RandomInt);     // Maks

       Anagram.anagram(RandomStr);                  // Zhazgul

       Iterate_String_Int.iterates(RandomStr.toString(),0);
    }

}
