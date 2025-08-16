public class practice {
    public static void bubbleSort(int[] arr){
        for(int turn =0;turn<arr.length-1;turn++){
            int swap = 0;
            for(int j =0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap--;
                }
                
            }
            
        }
    }
    public static void insertionSort(int[] arr){
        for(int i =1;i<arr.length-1;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0&& arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }

    }
    public static void countSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(arr[i],largest);
        }
        int count[] = new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i =count.length-1;i>=0;i--){
        
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;

        }
    }
    }
    
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpose =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpose]<arr[j]){
                    minpose=j;
                }
            }
            int temp = arr[minpose];
            arr[minpose] = arr[i];
            arr[i] = temp;
        }

    }


    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }

    public static void main(String[] args){
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
        printarr(arr);

    }
    
}
