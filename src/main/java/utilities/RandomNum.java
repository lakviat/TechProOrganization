package utilities;

import java.util.ArrayList;
import java.util.Random;



public class RandomNum {



    public static ArrayList<Integer> randomNum(){
        ArrayList<Integer> array = new ArrayList<Integer>();

        String randomset = Config.getProperty("RandomNumGenerate");
        int n = Integer.parseInt(randomset);

        Random random = new Random();


        for (int i = 0; i < n; i++) {
            array.add(random.nextInt(99999));
        }

        return array;
    }

}
