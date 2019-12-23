package utilities;

import java.util.ArrayList;
import java.util.Random;



public class RandomNum {


    public static ArrayList<Integer> randomNum(){
        ArrayList<Integer> array = new ArrayList<Integer>();

        Random random = new Random();


        for (int i = 0; i < 1000000; i++) {
            array.add(random.nextInt(99999));
        }

        return array;
    }

}
