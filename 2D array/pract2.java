public class pract2 {
    public static int sum(int[][] nums,int row){
        
        int sum =0;
        for(int j =0;j<nums[0].length;j++){
            sum += nums[row][j];
        }
        return sum;

    }
    public static void main(String[] args){
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        int result = sum(nums,0);
        System.out.println(result);
    }
    
}
