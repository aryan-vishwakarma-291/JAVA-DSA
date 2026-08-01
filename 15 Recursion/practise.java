public class practise {
    public static int tiling(int n) {
       //base case
       if(n==0 || n==1) {
        return 1;
       }
       //kam
       //for vertical
       int fn1 = tiling(n-1);
       //for horizontal
       int fn2 = tiling(n-1);

       int res = fn1 + fn2;
       return res;
    }
    public static void main(String[] args) {
        System.out.println(2);
    }
}
