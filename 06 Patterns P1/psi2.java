public class psi2{
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++) {
        //     for(int j = i ; j <=5 ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Ulternate way

        int n = 4;
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=n-i+1; j++)
            System.out.print("*");
            System.out.println();
        }
    }
}