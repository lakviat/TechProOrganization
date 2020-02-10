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
        // created the Random method for get random strings
        RandomStr = RandomString.randomString();
        // created the Random method for get random int
        RandomInt = RandomNum.randomNum();

        // Remove zero class has removeZeros method it will remove all zeros in random int
        RemoveZeros.removeZeros(RandomInt);     //Begimai

        // Dublicates class has dublicatesString method it returns dublicate strings
        Duplicates.duplicatesString(RandomStr);      // Ayganysh

        // Dublicates class has dublicatesInteger method  it returns dublicate ints
        Duplicates.duplicatesInteger(RandomInt);     // Maks

        //Anagram class has anagram method it takes ArrayList it counts anagram strings
        Anagram.anagram(RandomStr);                  // Zhazgul

        //Iterate method iterates all strings in the randomStr class
        Iterate_String_Int.iterates(RandomStr.toString(),0);
    }

}
