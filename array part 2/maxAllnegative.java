import java.util.*;
public class maxAllnegative {
    public static void kedaneAlgorithm(int[] nums){
        int cs = 0;//current sum
        int ms = Integer.MIN_VALUE;//maximum sum 
        int maxNegative = Integer.MIN_VALUE;
        boolean Allnegative = true;
        
        int n = nums.length;
        
        for(int i = 0 ;i<n;i++){
            if(nums[i]>=0){
            Allnegative = false;

            }
            maxNegative = Math.max(maxNegative,nums[i]);
            cs = cs + nums[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        ms = Math.max(ms, maxNegative);
        if (Allnegative) {
            ms = maxNegative;
        }
        
        
        System.out.println("maximum sum by kedane algorithm"+" "+ms);

    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int size =  sc.nextInt();
        System.out.println("Enter the element");
        int[] nums = new int[size];

        for(int i = 0 ;i<size;i++){
            nums[i] = sc.nextInt();
        }
        kedaneAlgorithm(nums);
        sc.close();
    }
}
