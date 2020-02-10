package utilities;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Anagram {

    static private final Logger log = Logger.getLogger(Anagram.class.getName());

    public static int anagram(ArrayList <String> arrs){

        int counter = 0;
        for (int i = 0; i < arrs.size(); i++) {
            String [] arrayOne = arrs.get(i).split("");
            Arrays.sort(arrayOne);
            for (int j = i+1; j < arrs.size(); j++) {
                String [] arrayTwo = arrs.get(j).split("");
                Arrays.sort(arrayTwo);
                if (Arrays.equals(arrayOne, arrayTwo)){
                    counter++;
                    arrs.remove(j);
                    arrs.remove(i);
                    i--;
                    break;
                }
            }
        }
    
        return counter;
    }
}
