package string;

public class compression {
    /*public static String compress(String str){
        String newstr = "";
        for(int i =0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
            

            
        }
        return newstr;


    }*/
    public static String sbCompression(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i =0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));//append character
        if(count>1){
            newstr.append(count);//apppend count
        }
        }
        return newstr.toString();
    }
    public static void main (String[] args){
        String str = "abbccddddd";
        System.out.println(sbCompression(str));
    


    }
    
}
