// import java.util.Scanner;

import java.util.Scanner;

public class aim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("can vote");
        }

       else if(age >= 13 && age <=18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("cannot vote");
        }
        sc.close();

        //Question - To print a number odd or even
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        
        // if(number % 2 == 0){
        //     System.out.println("Number is EVEN ");
        // }
        // else{
        //     System.out.println("Number is ODD");
        // }
        // sc.close();
    }
}