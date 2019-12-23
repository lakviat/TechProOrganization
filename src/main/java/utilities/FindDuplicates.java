package utilities;

import java.util.ArrayList;

public class FindDuplicates {


    public static ArrayList<Integer> findDuplicates(ArrayList <Integer> num) {
         ArrayList <Integer> arr = new ArrayList<>();
        for(int i = 0; i < num.size(); i++) {
            int count = 0;

            for(int k = 0; k < num.size(); k++) {

                if(num.get(i) == num.get(k)) {
                    count++;

                    if(count > 1) {
                      arr.add(num.get(i));
                    }
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
