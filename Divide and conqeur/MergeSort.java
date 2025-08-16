public class MergeSort {

    public static void printArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
     public static void MergeSorts(int[] arr,int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si +((ei-si)/2);

        //kaam
        MergeSorts(arr, si, mid);//left part
        MergeSorts(arr,mid+1,ei);//right part
        Merge(arr,si,ei,mid);
    }


    public static void Merge(int[] arr,int si,int ei,int mid){
        int[] temparr = new int[ei-si+1];
         mid = si +((ei-si)/2);
        int i = si;

        int j = mid +1;
        int k =0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temparr[k]= arr[i];
                i++;
            }
            else{
                temparr[k] = arr[j];
                j++;
            }
            k++;
        } 

        //for remaining left element
        while(i<=mid){
            temparr[k++] = arr[i++];
        }
        while(j<=ei){
            temparr[k++] = arr[j++];
        }


        //copying to original arr
        for(k=0 , i=si ;k<temparr.length;k++,i++){
            arr[i] = temparr[k];

        }
        
        
    }


   



    public static void main(String[] args){
        int[] arr ={6,3,9,5,2,8};
        MergeSorts(arr,0,arr.length-1);
        printArr(arr);



    }
    
}
