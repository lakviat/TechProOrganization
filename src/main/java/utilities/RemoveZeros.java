package utilities;

import java.util.ArrayList;
import java.util.logging.Logger;

public class RemoveZeros {

/*
This method is checking Random Integers and if there are 0 integers,
this method will remove 0.
 */
static private final Logger log = Logger.getLogger(RemoveZeros.class.getName());

    public static ArrayList<String > removeZeros(ArrayList<Integer> arr) {

    ArrayList<String> str = new ArrayList<>();
    log.info("PROCEEDING WITH REMOVING ZERO'S : ");
            for (int i = 0; i < arr.size(); i++) {

                if(arr.get(i)==0){
                    arr.remove(i);
                    i--;
                    continue;
                }
               String s = arr.get(i)+"";
                 if (s.contains("0")) {
                     s = s.replaceAll("0", "");
                     str.add(s);
                 }
                }
       return str;
    }
}
