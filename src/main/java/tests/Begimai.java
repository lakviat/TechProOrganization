package tests;

import utilities.RandomNum;
import utilities.RemoveZeros;

import java.util.ArrayList;

public class Begimai {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Integer> arr = RandomNum.randomNum();

        System.out.println(RemoveZeros.removeZeros(arr));
        int size = arr.size();
        System.out.println(size);
    }
}
