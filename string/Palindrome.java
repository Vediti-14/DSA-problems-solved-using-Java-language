package string;


public class Palindrome {
    public static boolean isPalindrome(String fname){
    
    for(int i =0;i<fname.length()/2;i++){
        int n = fname.length();
        if(fname.charAt(i) != fname.charAt(n-i-1)){
            return false;
        }
    }
    return true;

    
}
public static void main(String[] args){
    String fname = "noons";
    System.out.println(isPalindrome(fname));


}
}