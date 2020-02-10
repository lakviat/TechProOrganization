package utilities;

import cucumber.api.java.sl.In;
import net.bytebuddy.utility.RandomString;

import java.util.ArrayList;
import java.util.List;

public class CountTheNumberOfCharacter {


    public static int countTheNumberOfCharacterOfString(ArrayList<String> stringList) {

        int count = 0;

        for (String element : stringList) {
            String[] array = element.split("");
            for (int i = 0; i < array.length; i++) {
                count++;
            }
        }
        return count;

    }



}