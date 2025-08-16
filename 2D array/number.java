import java.util.*;
public class number {
    public static void larger(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                    
                }
                
            }
            
        }
        System.out.println("found the largest number"+max);
            

    }
    public static void minimum(int[][] matrix){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    
                }
            }
            
        }
        System.out.println("found the minimum number"+min);

    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        minimum(matrix);
        larger(matrix);
        sc.close();

    }
    
}
