import java.util.*;
public class hsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1

        // for( int i = 0 ; i < 5 ; i++) {
        //     System.out.println("Hellow");
        //     i+=2;
        // }

        // Question 2

        // int number ; 
        // int choice;
        // int evenSum = 0 ;
        // int oddSum = 0;
         
        // do{
        // System.out.println("Enter a number");
        //     number = sc.nextInt();

        //     if(number%2 == 0) {
        //         evenSum += number;
        //     }
        //     else{
        //         oddSum += number;
        //     }
        //     System.out.println("Enter 1 to add more interger else press 0 ");
        //     choice = sc.nextInt();
        // }
        // while(choice == 1);
        // System.out.println("The sum of EVEN integer is " + evenSum);
        // System.out.println("The sum of ODD interge is " + oddSum);


        // Question -- 3 Factorial program

        // System.out.println("Enter number whose factorial is to be find :");
        // int a = sc.nextInt();
        // int fact = 1;
        // for( int i = 1 ; i <= a ; i++ ) {
        //     fact *= i;
        // }
        // System.out.println("Factorial : " + fact);

        // Question --4
        // To print the table of given number
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for( int i = 1 ; i <= 10 ; i++) {
            System.out.println(n*i);
        }

        
        sc.close();
        

         
        
        // Question -- 4




        sc.close();
    }
}
