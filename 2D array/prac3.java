public class prac3 {
    public static int(int[][] matrix){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j] = matrix[j][i];
            }
        }
        
    }
    public static void main(String[][] args){
        int matrix[][] = {{11 ,  12,    13},
        {21  ,  22 ,   23}};
    }
    
}