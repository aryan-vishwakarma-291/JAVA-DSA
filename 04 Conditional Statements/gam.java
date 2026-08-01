import java.util.*;
public class gam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Question 1 :

        // System.out.println("Enter a number :");
        // int number = sc.nextInt();

        // if(number >= 0) {
        //     System.out.println("The given number is positive.");
        // }
        // else {
        //     System.out.println("The given number is negative.");
        // }

//Question 2 : 
        
        // System.out.println("Enter a number :");
        // int number = sc.nextInt();

        // switch(number) {
        //     case 1 : System.out.println("Sunday");
        //                 break;
        //     case 2 : System.out.println("Monday");
        //                 break;
        //     case 3 : System.out.println("Tuesday");
        //                 break;
        //     case 4 : System.out.println("Wednesday");
        //                 break;
        //     case 5 : System.out.println("Thursday");
        //                 break;
        //     case 6 : System.out.println("Friday");
        //                 break;
        //     case 7 : System.out.println("Saturday");
        //                 break;
        //     default : System.out.println("Incorrect choice.");
        // }


//Question 
    
       
// Question 3
        System.out.println("Enter YEAR :");
        int year = sc.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;
        boolean z = ((year%100 == 0) && (year%400 == 0));

        if(x && (y||z)){
                System.out.println(year + "is a leap year");

        }
        else{
                System.out.println(year + "is not a leap year" );
        }
        sc.close();
    }   
}
