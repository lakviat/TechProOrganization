package utilities;

import java.util.ArrayList;

public class RemoveZeros {

    public static void main(String[] args) {

    }

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
