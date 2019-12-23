package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {


    public static ArrayList<Integer> findDuplicates(ArrayList <Integer> num) {
         ArrayList <Integer> arr = new ArrayList<>();

         int [] array = new int [num.size()];

        for (int i = 0; i < num.size() ; i++) {
            array[i] = num.get(i);
        }

        Arrays.sort(array);

        String str = "";
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i] == array[i+1]){

                if(!str.contains(array[i] + "")){

                    arr.add(array[i]);
                    str += array[i] + " ";
                }

            }
        }
        return arr;
    }

    public static ArrayList<String> findduplicates(ArrayList <String> arr) {
         ArrayList <String> newarr = new ArrayList<>();

         for(int i = 0; i < arr.size(); i++) {
            int count = 0;

            for (int k = 0; k < arr.size(); k++) {

                if (arr.get(i).equalsIgnoreCase(arr.get(k))) {
                    count++;

                    if (count > 1) {
                        newarr.add(arr.get(i));
                    }
                }
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(3);
        num.add(4);
        num.add(3);
        num.add(4);
        num.add(9);
        num.add(10);

        ArrayList <String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("hello");
        arr.add("hi");
        arr.add("hi");

        System.out.println(findDuplicates(num));
        System.out.println(findduplicates(arr));
    }
}
