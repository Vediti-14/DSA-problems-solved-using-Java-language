public class removeduplicates {


    public static String removeDuplicateString(String str,int idx, StringBuilder newstr,boolean[] map){
        if(idx==str.length()){
            return newstr.toString();
            
        }
        //kaam
        char cuurentchar = str.charAt(idx);

        if(map[cuurentchar - 'a']==true){
           return removeDuplicateString(str, idx+1, newstr, map);
        }
        else{
            map[cuurentchar-'a'] = true;
             return removeDuplicateString(str, idx+1, newstr.append(cuurentchar), map);
        }
    }

    public static void main(String[] args){
        
         String result = removeDuplicateString("vediid", 0, new StringBuilder(""), new boolean[26]);
         System.out.println(result);
    }
    
}
