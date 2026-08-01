import java.util.*;
public class esi {
    public static void main(String[] args) {
        // int count = 1;
        //  do {
        //     System.out.println("Aryan Vishwakarma ");
        //     count++;
        // }
        // while(count <= 5);
        

        // Quesition using break in a loop ;

        // for(int i = 1 ; i <=5 ; i++) {
        //     System.out.println("Hellow World ");
        //     if(i == 3) {
        //         break;
        //     }
        // }

        // System.out.println("I am out of loop");
    

        // Question -- keep entering numbers till user enters a multiple of 10

        Scanner sc = new Scanner(System.in);
    
        
        do{
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }
        while(true);
        sc.close();
        
    }
        
        
    
}
