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
        int counterAnagram = 0;
        for(int i = 0; i < arrs.size(); i++) {
            for (int k = 0; k < arrs.size(); k++) {
                int counter = 0;
                if (arrs.get(i).length() == arrs.get(k).length()) {
                    for (int j = 0; j < arrs.get(i).length(); j++) {
                        for (int l = 0; l < arrs.get(i).length(); l++) {
                            if (arrs.get(i).charAt(j) == arrs.get(l).charAt(l)) {
                                counter++;
                                arrs.get(i).replaceFirst(arrs.get(k).charAt(l) + "", "");
                                break;
                            }

                        }
                    }
                    if(counter == arrs.get(i).length()){
                        counterAnagram++;
                    }


                }
            }
        }
        log.info("THIS IS THE ANAGRAM NUMBER : " + count);
        return count;



//
//        for (int i = 0; i < arrs.size()-1; i++) {
//            for (int j = 0; j < arrs.size()-1; j++) {
//                if(arrs.get(i).charAt(i) == arrs.get(j).charAt(j)){
//                    count++;
//                    arrs.get(j).replaceFirst(arrs.get(j).charAt(j) + "", "");
//                    break;
//                }
//
//            }
//
//        }






    }
}
