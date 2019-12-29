package tests;

import utilities.Anagram;
import utilities.RandomString;

import java.util.ArrayList;
import java.util.Arrays;

public class hdjhgj {

    public static void main(String[] args) {
        System.out.println(Anagram.anagram(RandomString.randomString()));
    }

    public static int anagram(ArrayList<String> arrs){

        int count = 0;
        for(String arr : arrs){
            char [] chArr1 = arr.toCharArray();
            Arrays.sort(chArr1);

            for (int i = 0; i < arrs.size(); i++) {
                if (arrs.get(i).length() == (chArr1+"").length()){
                    if(arrs.get(i).equalsIgnoreCase(chArr1+"")){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
