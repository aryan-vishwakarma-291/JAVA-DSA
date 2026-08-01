public class dsi {
    public static void main(String[] args) {
        // for(int i=1 ; i <= 4 ; i++) {
        //     System.out.println("* * * *");
        // }

        //QUESTION -- PRINT REVERSE OF A NUMBER

        int n = 10899;

        while(n > 0){
            int lastdigit = n % 10; // to print last digit of a number
            System.out.print(lastdigit + " ");
            n = n / 10; // To remove last digit of a number
        }
    }
}