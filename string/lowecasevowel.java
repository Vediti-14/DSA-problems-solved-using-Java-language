package string;

public class lowecasevowel {
    public static String lowercaseVowel(String str){
        StringBuilder newstr = new StringBuilder("");
        Integer count =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if('a' ==str.charAt(i)||'e' ==str.charAt(i)||'i' ==str.charAt(i)||'o' ==str.charAt(i)||'u'==str.charAt(i)){
                count++;
                
            }
        
        }
        newstr.append(count);
        return newstr.toString();
    }
    public static void main(String[] args){
        String str = "qwertaeiogh";
        System.out.println(lowercaseVowel(str));

    }
    
}
