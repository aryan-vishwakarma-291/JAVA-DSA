import java.util.*;
public class fsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for(int i = 1 ; i <= 5 ; i++){
        //     if(i == 3 ) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Question -- Display all numbers entered by user except multiples iof 10;

        do {
            System.out.println("enter number");
            int n = sc.nextInt();
            sc.close();  // but do not this line of code while using continue statement
            
            if(n % 10 == 0){
                continue;
            }

            System.out.println(n);
            }
        while(true);
       
       
  }
   
}
