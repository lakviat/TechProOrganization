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

    }
    @Override
    public void StringCharcount() {

    }
    public static void main(String[] args) {
        //RandomNum.randomNum();              //Arif
        System.out.println(RandomString.randomString());        //Arif
//create a List of random Strings
        RandomStr = RandomString.randomString();
//create a List of random Integers
        RandomInt = RandomNum.randomNum();
// removing zeros fro List of Integers
       RemoveZeros.removeZeros(RandomInt);     //Begimai
// finding duplicates in the List of Strings
       Duplicates.duplicatesString(RandomStr);      // Ayganysh
// finding duplicates in the List of Integers
       Duplicates.duplicatesInteger(RandomInt);     // Maks
// finding anagrams in the List of Strings
        Anagram.anagram(RandomStr);                  // Zhazgul

       Iterate_String_Int.iterates(RandomStr.toString(),0);

//Checked by Max.
    }

}
