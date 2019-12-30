package utilities;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Anagram {

    static private final Logger log = Logger.getLogger(Anagram.class.getName());

    public static int anagram(ArrayList <String> arrs){

        int count = 0;
        log.info("Proceeding with Loop for Anagrams : ");
        for(String arr : arrs){
          char [] chArr1 = arr.toCharArray();
            Arrays.sort(chArr1);
            for (int i = 0; i < arrs.size(); i++) {
                if (arrs.get(i).equalsIgnoreCase(chArr1+"")){
                    count++;
                }
            }
        }
        log.info("THIS IS THE ANAGRMAN NUMBER : " + count);
        return count;
    }
}
