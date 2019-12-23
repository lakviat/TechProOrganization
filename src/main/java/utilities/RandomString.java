package utilities;

import java.util.ArrayList;
import java.util.Random;

public class RandomString {




    public static ArrayList<String> randomString(){
        Random random = new Random();
        ArrayList<String> array = new ArrayList<String>();

        String str = "";

        for (int i = 0; i < 1000000; i++) {
            str = "";
            for (int j = 0; j < 10 ; j++) {
                char a = (char)(random.nextInt(26) + 'a');
                str +=a + "";
            }
            array.add(str);
        }

        return array;
    }
}
