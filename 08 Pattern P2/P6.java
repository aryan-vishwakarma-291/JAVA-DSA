public class P6 {
    public static void butterfly(int n) {
        // for first half
        for(int i=1; i<=n; i++) {
            // for stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // for spaces 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // for stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
// for second half
        for(int i=n; i>=1; i-- ) {
            
                // for stars - i
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                // for spaces 2*(n-i)
                for(int j=1; j<=2*(n-i); j++) {
                    System.out.print(" ");
                }
                // for stars - i
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }


        // spaces 2*(n-1)
        
    }
    public static void main(String[] args) {
        butterfly(4);
    }
}
