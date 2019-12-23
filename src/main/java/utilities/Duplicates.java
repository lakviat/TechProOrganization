package utilities;

import java.util.ArrayList;

public class Duplicates {



    public static int duplicatesIntegers(ArrayList<Integer>arr){
        int count =0;
for(int i=0;i<arr.size()-1;i++){
if(arr.get(i)==(arr.get(i+1))){
    count++;
}
}
return count;
}

public static int duplicatesInString(ArrayList<String>str){
        int count=0;
    for(int i=0;i<str.size();i++){
        for(int j=0;j<str.get(i).length()-1;j++){
        if(str.get(i).charAt(j)==str.get(i).charAt(j+1)){
            count++;
        }
        }

    }
    return count;
}

//public static void iterate(String str,int num){
//        String s ="";
//        String nums=num+"";
//        String largest=nums;
//        int max=nums.length();
//        int min=str.length();
//        if(nums.length()<str.length()){
//            max=str.length();
//            min=nums.length();
//            largest=str;
//        }
//
//        for(int i=0;i<min;i++){
//            s+=str.charAt(i);s+=nums.charAt(i);
//        }
//    System.out.println(s+largest.substring(min));
//}

}
