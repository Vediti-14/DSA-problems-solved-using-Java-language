public class question1 {
    public boolean duplicatet(int[] nums){
        
        for(int i =0;i<nums.length;i++){
            for(int j =i;j<nums.length;j++){
                if(nums[i]!=nums[j]){// brute force
                    return false;
                }
                
            }
        }
        return true;
        

    }
    public static void main(String[] args) {
        question1 sol = new question1();
        int[] nums = {1,2,3,4,5};
        boolean result = sol.duplicatet(nums);
        System.out.println(result);
        
    }
    
}
