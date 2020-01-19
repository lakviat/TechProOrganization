package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {

    public static ArrayList<String> RandomString = new ArrayList<>();

    public static ArrayList<String> randomString(){
        Random random = new Random();
        int count = 0;
        String randomset = Config.getProperty("RandomStringGenerate");
        int n = Integer.parseInt(randomset);
        String str = "";

        for (int i = 0; i < n;  i++) {
            str = "";
            for (int j = 0; j < 10 ; j++) {
                char a = (char)(random.nextInt(26) + 'a');
                str +=a + "";
            }
            count++;
            RandomString.add(str);
        }

        System.out.println("NUMBER OF STRINGS : " + count);
        return RandomString;

    }

}
