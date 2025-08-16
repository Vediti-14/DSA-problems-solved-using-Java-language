package string;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String str1 = "cares";
        String str2 = "racei";
        str1.replaceAll("\\s","").toLowerCase();
        str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()==str2.length()){
            char[] arraycharstr1 = str1.toCharArray();
            char[] arraycharstr2 = str2.toCharArray();
            Arrays.sort(arraycharstr1);
            Arrays.sort( arraycharstr2);
              boolean result = Arrays.equals(arraycharstr1, arraycharstr2);
              if(result){
                System.out.println("are anagrams");
              }
              else{
                System.out.println("not anagrams");
              }
        }
        else{
            System.out.println("lengths are not rqual so othey are not anagrams");
        }
         
    }
    
}
