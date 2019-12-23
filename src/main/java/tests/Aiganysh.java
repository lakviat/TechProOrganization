package tests;

import utilities.FindDuplicates;
import utilities.RandomNum;
import utilities.RandomString;

import java.util.ArrayList;

public class Aiganysh {
    public static void main(String[] args) {
       ArrayList <Integer> arr = RandomNum.randomNum();
        System.out.println(FindDuplicates.findDuplicates(arr));

        //ArrayList <String> arr1 = RandomString.randomString();
        //System.out.println(FindDuplicates.findduplicates(arr1));

    }

}
