public class friends {


    public static int friendPair(int n){
        if(n==0||n==1||n==2){
            return n;
        }

        //single
        int fnm1 = friendPair(n-1);
        //pair
        int fnm2 = (n-1)*friendPair(n-2);

        return fnm1+fnm2;
    }

    public static void main(String[] args){
        System.out.println(friendPair(5));
    }
    
}
