package tests;

import utilities.Anagram;
import utilities.RandomString;

import java.util.ArrayList;

public class Zhazgul {
    public static void main(String[] args) {
        ArrayList<String> arr = RandomString.randomString();

        System.out.println(Anagram.anagram(arr));
        System.out.println("bla");



    }
}
