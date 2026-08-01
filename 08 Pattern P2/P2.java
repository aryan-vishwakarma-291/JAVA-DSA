public class P2 {

    public static void rectangle(int n) {
        for(int i=1; i<=n; i++){
            //for spaces in row
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //for print star at row
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            // for next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
       rectangle(7);
    }
}
