import java.util.*;
public class bsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Question 1 
        // int i = 1;
        // while(i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }

//Question 2 

        // System.out.println("Enter number :");
        // int n = sc.nextInt();
        // int i = 1;

        // while(i <= n) {
        //     System.out.println(i);
        //     i++;
        // }

//Question 3 

        System.out.println("Enter Range :");
        int n = sc.nextInt();
        int i = 1;
        int s = 0;
        System.out.println("The sum of given number Range :");
        while(i <= n) {
           s = s + i;
           i++;
        }
        System.out.println(s);
        sc.close();
    }
}