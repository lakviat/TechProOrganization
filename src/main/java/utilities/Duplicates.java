package utilities;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Duplicates {
    public static int duplicatesString(ArrayList<String>arr){
        int count=0;
        for(int i=0;i<arr.size();i++){
for(int j=0;j<arr.get(i).length()-1;j++){
    if(arr.get(i).charAt(j)==arr.get(i).charAt(j+1)){
        count ++;
    }
}
        }
        System.out.print("\nTHIS IS THE COUNT OF DUPLICATE STRING : " + count + "\n");
        return count;
    }

    public static int duplicatesInteger(ArrayList<Integer>nrr){
        int count=0;
        for(int i=0;i<nrr.size();i++){
            String str=nrr.get(i)+"";
            for(int j=0;j<str.length()-1;j++){
                if(str.charAt(j)==str.charAt(j+1)){
                    count++;



                }
            }
        }
        System.out.print("\nTHIS IS THE COUNT OF DUPLICATE INTEGERS : " + count+ "\n");
        return  count;
    }
}
