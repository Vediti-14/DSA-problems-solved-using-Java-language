package string;

/*public class Shortpath {
    public static float getshortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;

            }
            else if (dir=='W'){
                x++;
            }
            else if (dir=='E'){
                x--;
            }
        }
        int X2 = x*x;
        int Y2 =y*y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getshortestPath(path));
    }
    
}
*/import java.util.*;

public class Shortpath{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0 ;i<n;i++){
            for(int j =0 ;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        
        }
        for(int i =0 ;i<n;i++){
            for(int j =0 ;j<m;j++){
                System.out.println(matrix[i][j]);
            }
        
        }
        

        

        }
    }
    



