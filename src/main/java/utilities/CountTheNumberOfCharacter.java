package utilities;

import java.util.ArrayList;
import java.util.List;

public class CountTheNumberOfCharacter {

    public static List<String> nameit;

    public static ArrayList<String> countTheNumberOfCharacterOfString(String str){
         int count = 0;
        String [] array = str.split("");
        ArrayList<String> stringList= new ArrayList<String>();
        for(int i = 0; i< array.length; i++){
            stringList.add(array[i]);
            count++;
        }
        nameit = stringList;
       return stringList;
    }

   // public static int countTheNumberOfInteger(){


   // }

   // public static void main(String[] args) {
     //   System.out.println(countTheNumberOfCharacterOfString("I will go to the school 45 times today till 12:45"));
       // System.out.println(countTheIntegers(countTheNumberOfCharacterOfString("I will go to the school 45 times today till 12:45")));
    //}
   public static ArrayList<Integer> countTheIntegers(ArrayList<String> nameit){
 String [] array = new String [nameit.size()];
        for(int i = 0; i<nameit.size(); i++){
            array[i] = nameit.get(i);
        }

       ArrayList<Integer> integerList = new ArrayList<Integer>();



        for(int i = 0; i<nameit.size(); i++){
            if(nameit.toString().charAt(i)>=48 && nameit.toString().charAt(i)<=57 ){
                int x = Integer.parseInt(nameit.get(i));
                integerList.add(x);
            }
        }
        return integerList;
   }

}
