package utilities;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;


public class RandomNum {

    public static ArrayList<Integer> RandomInteger = new ArrayList<>();

    static private final Logger log = Logger.getLogger(RandomNum.class.getName());

    public static ArrayList<Integer> randomNum(){
        int count = 0;
        String randomset = Config.getProperty("RandomNumGenerate");
        int n = Integer.parseInt(randomset);

        Random random = new Random();


        for (int i = 0; i < n; i++) {
            RandomInteger.add(random.nextInt(99999));
            count++;
        }
        System.out.println("NUMBER OF INTEGERS : " + count);
        return RandomInteger;
    }
    public void RandomNum(){

    }
}
