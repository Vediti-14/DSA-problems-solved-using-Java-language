public class tiling {


    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        // horizontal
        int fnm2 = tilingProblem(n-2);

        int totalways = fnm1+fnm2;
        return totalways;
    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(tilingProblem(n));
    }
    
}
