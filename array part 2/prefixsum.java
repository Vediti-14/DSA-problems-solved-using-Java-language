public class prefixsum{
    
    public static void MaxSubarraySum(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i=1;i<number.length;i++){
             prefix[i] = prefix[i-1]+number[i];//correctly store prefix sum
        }
        
        

        for( int i=0;i<number.length;i++){
            for(int j = i;j<number.length;j++){
                currsum = ( i == 0) ? prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
public static void main(String args[]){
    int number[] = {3,4,5,6,7};
    MaxSubarraySum(number);
 
}
}