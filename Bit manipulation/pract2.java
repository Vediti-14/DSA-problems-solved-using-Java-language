public class pract2 {
    public static void main(String[] args){
        int x = 3 ;
        int y = 8 ;
        System.out.println("x value is"+x+"y value is"+y);
       
// swap two numbers
         x = x^y;

        y = x^y;
        x = x^y;
        System.out.println("x value is  "+ x +"  y value is"+y);
    }
    
}
