package utilities;

import java.util.ArrayList;

public class RemoveZeros {

/*
This method is checking Random Integers and if there are 0 integers,
this method will remove 0.
 */
    public static ArrayList<Integer> removeZeros(ArrayList<Integer> arr){
        ArrayList<Integer> intWithoutZero = new ArrayList<Integer>();

        for (int i=0; i<arr.size(); i++){
           if(arr.get(i) == 0){
               arr.remove(i);
               i--;
           }
           intWithoutZero.add(arr.get(i));
        }
        return intWithoutZero;
    }

}
