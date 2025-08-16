

public class bubble {
    public static void bubbleSorting(int arr[]){
        for( int turn = 0;turn<arr.length-1;turn++){
            int swap = 0;
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
                swap++;

            }
            

            }
            if(swap==0){
                break;
                
            }

        }
    }
    public static void printarr(int arr[]){
        
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
}

System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,6,3,2,4};
        bubbleSorting(arr);
        printarr(arr);

    }

}


    

