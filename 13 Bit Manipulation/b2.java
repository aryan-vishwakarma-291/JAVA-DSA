public class b2 {
    public static int fastExpo(int a , int n) {
        int ans = 1;
        while(n>0) {
            if((n&1)!= 0) {
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static int countSetBit(int n) {
       int count = 0;
        while(n>0) {
            if((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static boolean ispowerofTWo(int n) {
        return (n&(n-1)) == 0;
    }
    public static int clearRange(int n , int i , int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static int clearLastIthBit(int n , int i) {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int updateIthBit(int n , int i , int newbit) {
        // if(newbit == 0) {
        //    return  clearIthBit(n, i);
        // } else {
        //    return setIthBit(n, i) ;
        // }

        //alternative way ;
        n = clearIthBit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n , int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }
    public static int setIthBit(int n , int i ) {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int  getithbit(int n , int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static void oddOreven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        // oddOreven(2);
        // oddOreven(3);

        // System.out.println(getithbit(10, 3));

        // System.out.println(setIthBit(10, 2));

        System.out.println(clearIthBit(10, 2));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearLastIthBit(15,2));

        // System.out.println(clearRange(10,2,4));

        // System.out.println(ispowerofTWo(3));

        // System.out.println(countSetBit(15));

        // System.out.println(fastExpo(3, 5));
    }
}
