package utilities;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static int anagram(ArrayList <String> arrs){

        int count = 0;
        for(String arr : arrs){
          char [] chArr1 = arr.toCharArray();
            Arrays.sort(chArr1);
            for (int i = 0; i < arrs.size(); i++) {
                if (arrs.get(i).equalsIgnoreCase(chArr1+"")){
                    count++;
                }
            }
        }
                     return count;
    }
}
