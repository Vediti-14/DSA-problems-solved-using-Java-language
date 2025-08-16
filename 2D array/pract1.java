public class pract1 {
    public static int finding7(int[][] mat){
        int count =0;
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                if(mat[i][j]==9){
                    count++;

                }

            }
            
        }
        return count;
    }
    public  void main(String[] args){
        int mat[][] =  {{4,7,8},{8,8,7},{7,7,7} };
       int num =  finding7(mat);
        System.out.println(num);
    }
    
}
