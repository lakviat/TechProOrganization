package tests;

import utilities.RandomNum;
import utilities.RemoveZeros;

import java.util.ArrayList;

public class Begimai {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Integer> arr = RandomNum.randomNum();

        System.out.println("\nThe ArrayList of String numbers without Zeros: ");
        System.out.println(RemoveZeros.removeZeros(arr));
        System.out.println("\nArrayList size after removed Zeros: "+arr.size());
    }
}
