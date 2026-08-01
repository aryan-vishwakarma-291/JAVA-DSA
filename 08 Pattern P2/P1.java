public class P1 {

    public static void hollow_Rec(int rows , int col){
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=col; j++) {
                if(j==1 || j==col || i==1 || i==rows){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        hollow_Rec(6, 7);


    }
}
