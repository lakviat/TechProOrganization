package utilities;

public class Iterate_String_Int {

        public static void iterates(String str,int num){
            String s ="";
            String nums=num+"";
            String largest=nums;
            int max=nums.length();
            int min=str.length();
            if(nums.length()<str.length()){
                max=str.length();
                min=nums.length();
                largest=str;
            }
            for(int i=0;i<min;i++){
                s+=str.charAt(i);s+=nums.charAt(i);
            }
            System.out.println(s+largest.substring(min));
        }

        public static void main(String[] args) {
            iterates("hello" , 123456);


        }
    }


