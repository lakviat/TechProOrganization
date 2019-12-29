package utilities;

import java.util.ArrayList;

public class RemoveZeros {

/*
This method is checking Random Integers and if there are 0 integers,
this method will remove 0.
 */

    public static ArrayList<String > removeZeros(ArrayList<Integer> arr) {

    ArrayList<String> str = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {

                if(arr.get(i)==0){
                    arr.remove(i);
                    i--;
                }
               String s = arr.get(i)+"";
                 if (s.contains("0")) {
                     s = s.replaceAll("0", "");
                     str.add(s);
                 }
                 if(i==20){
                     System.out.println();
                 }
                }
       return str;
    }
}
