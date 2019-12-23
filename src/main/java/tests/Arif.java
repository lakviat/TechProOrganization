package tests;

import utilities.RandomNum;
import utilities.RandomString;

import java.util.ArrayList;

public class Arif {

    public static void main(String[] args) {

        ArrayList<Integer> arr = RandomNum.randomNum();
        int num = arr.size();



        System.out.println(RandomNum.randomNum());
        System.out.println(RandomString.randomString());
        System.out.println(num);

    }
}
