class part1{
    // descending
    public static void Descending(int n){
        if(n==1){
            System.out.println(1);
            return;
            
        }
        System.out.print(n+" ");
        Descending(n-1);
     }
     //ascending order

    public static void Ascending(int n){
        if(n==1){
            System.out.println(n);
            return;
        
        }
        Ascending(n-1);
        System.out.print(n);
    }
    // sum of n natural numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
       
       int sum1 = n+ sum(n-1);
       return sum1;
    }
    //fibonacci series
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fiball = fib1 +fib2;
        return fiball;
    }

    //sorted array
    public static boolean sorted(int[] arr,int i){
        
        if(i ==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;

        }
          return sorted(arr, i+1);
    }
    //first ocurrencde
    public static int firstocur(int[] arr,int key,int i ){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return firstocur(arr, key,i+1);

    }
    //last ocuramce
    public static int lastoccur(int[] arr,int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound = lastoccur(arr, key, i+1);
        if(isFound==-1&&arr[i]==key){
            return i;
        }
        return isFound;

    }

    public static int power(int a , int n){
        if(n==0){
            return 1;
        }

        int halfpower = power(a, n/2);
        int halfpowerSqu = halfpower*halfpower;
        if(n%2!=0){
            halfpowerSqu = a*halfpowerSqu;
        }
        return halfpowerSqu;


    }
    public static void main(String[] args){
        System.out.println(power(2,2));
    }
}