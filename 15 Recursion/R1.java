
public class R1 {
    public static void printdec(int n) {
        if(n == 1) {
            System.out.print(n);
            return ;
        }
        System.out.print(n + " ");
        printdec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1 ) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    public static int factNum(int n) {
        if(n == 0) {
            return 1;
        }
        int fn_1 =  factNum(n-1);
        int fn = n * fn_1;
        return fn;
    }

    public static int sumOfN(int n) {
        if(n == 1) {
            return 1;
        }
        int fsum_1 = sumOfN(n-1);
        int fsum = n + fsum_1;
        return fsum;
    }

    public static int fibonachi(int n) {
        if(n == 1 || n == 00) {
            return n;
        }
         int fib_1 = fibonachi(n-1);
         int fib_2 = fibonachi(n-2);
         int fib = fib_1 + fib_2;
         return fib;

    }

    public static boolean checkArray(int arr[] , int i) {
        // if(i == arr.length-1) {
        //     System.out.println("Array is sorted");
        //     return;
        // }

        // if(arr[i] < arr[i+1]){
        //     checkArray(arr, i+1);
        // } 
        // else {
        //     System.out.println("Array is not sorted");
        // }

        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return checkArray(arr, i+1);
    }

    public static int firstOcuur(int arr[] , int i , int key) {
        if(i == arr.length-1) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOcuur(arr, i+1, key);
        
    }

    public static int lastoccur(int arr[] , int i , int key) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastoccur(arr, i+1, key);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int powOfNum(int num , int pow ) {
        if(pow == 0) {
            return 1;
        }
         int num_n_1 = powOfNum(num, pow-1);
         int num_n = num * num_n_1 ;
         return num_n;  
    }

    public static int OpowOfNum(int a , int n) {
        if(n == 0) {
            return 1;
        }
        int halfpow = OpowOfNum(a , n/2);
        int doblePow = halfpow * halfpow ;

        // if n is odd
        if(n%2 != 0) {
            doblePow = a * doblePow;
        }

        return doblePow;
    }
    public static void main(String[] args) {
        // print number from n to 1
        // int n = 10;
        // printdec(n);

        // print number from 1 to n
        // printInc( 10);

        // print factorial of a number 
        // int res = factNum(3);
        // System.out.println(res);

        // print sum of first n natural numbers 
        // int res = sumOfN(5);
        // System.out.println(res);

        // print nth fibonachi number 
        //    System.out.println(fibonachi(25));

        // check array is sorted or not
        // int arr[] = {1,2,3,4,5};
        // int i = 0;
        // System.out.println(checkArray(arr, i));

        // check first occurance of a number
        // int arr[] = {1,2,4,3,6,4,3,6};
        // System.out.println(firstOcuur(arr, 0, 5));

        // check last occurance of a number
        // int arr[] = {1,2,4,5,7,6,5,8};
        // System.out.println(lastoccur(arr, 0, 5));

        // to calculate x to the power n 
        // int num = 2;
        // int pow = 3;
        // System.out.println(powOfNum(num, pow)); 

        // to calculate x to the power n (optimize way)
        // System.out.println(OpowOfNum(2,5));
        
    }
}
