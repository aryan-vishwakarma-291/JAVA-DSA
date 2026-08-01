public class birpractise {
     
    public static int clearIthBit(int n , int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }
    public static void update(int num , int i , int newb) {
        num = clearIthBit(num, i);
        int bitmask = newb<<i;
        System.out.println(num|bitmask);
      
        
    }
    public static int clearibits(int num , int i) {
        int bitmask = (~0)<<i;
        return num & bitmask;
    }

    public static int clearrangeofbits(int num , int i , int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b;
        return  num & bitmask;
    }
    public static void ispowerof2(int n ) {
        if((n&(n-1))==0) {
            System.out.println("yes");
        }
        else {
            System.out.println("false");
        }
    }
    public static void number(int n) {
        int count = 0;
        while(n>0) {
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    public static int fasexpo(int a ,int n) {
        int ans = 1;
        while(n>0) {
            if((n&1)!=0) {
                ans = ans*a;
            }
            a = a*a;
            n =n>>1;

        }
        return ans;


    }
    public static void main(String[] args) {
        // update(10,2,1);
        // ispowerof2(15);
        // number(10);
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~6);
        // System.out.println(5<<2);
        // System.out.println(6>>1);

        // odd even number

        // int n = 3;
        // if((n&1) == 1                                                                                                                                                                     ) {
        //     System.out.println("odd numbre");
        // } else {
        //     System.out.println("even number");
        // }

        // get ith bit
        
        // int n = 10;
        // int i = 1;
        // if((n&(1<<i)) == 1) { //1<<i --> 0000100  where i =2 & n is original number
        //     System.out.println("1");
        // }else {
        //     System.out.println("0");
        // }

        //set ith bit
        // System.out.println(n|1<<i);

        //clear ith bit
        // System.out.println(n & ~(1<<i));




        // System.out.println(fasexpo(2, 4));
     
    }
}
