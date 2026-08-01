public class fsi5 {

    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i<=n; i++) {
            f = f*i;
        }
        return f;
    }

    public static int binocoeff(int n , int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_mnr = factorial(n-r);

        int bin = fact_n / (fact_r * fact_mnr);
        return bin;
    }
    public static void main(String[] args) {
    //    System.out.println(factorial(3));
        System.out.println(binocoeff(5, 2));
    }
}
