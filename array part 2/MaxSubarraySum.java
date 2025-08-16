public class MaxSubarraySum {
    public static void bruteforce(int[] nums){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            for(int j =i;j<nums.length;j++){
                currentsum = 0;//for reset 
                for(int k =i;k<=j;k++){
                    currentsum = currentsum +nums[k];
                }
                System.out.println("current sum is"+currentsum);
                if(maxsum<currentsum){
                    maxsum = currentsum;
                }
            }

        }
        System.out.println("maxsum"+maxsum);
    }
    public static void main(String[] args){
        int[] nums = {1, 4, 5, 6};
        bruteforce(nums);
    }
}