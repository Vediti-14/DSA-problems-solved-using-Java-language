

public class key {


    public static void solution(int[][] matrix,int keys){
        for(int i =0 ;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(keys == matrix[i][j]){
                    System.out.println("found the key at"+ i +","+j);
                    return;
                }

            }
            System.out.println("key not found");
        }

    }


    
    public static void main(String[] args){
        
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        solution(matrix,1);
        
    }
    
}
