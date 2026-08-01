import java.util.Scanner;

public class cim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A :");
        int A = sc.nextInt();
        System.out.println("Enter number B :");
        int B = sc.nextInt();
        System.out.println("Enter number C :");
        int C = sc.nextInt();

        if(A >= B && A >= C){
            System.out.println("A is largest "+ A);
        }
        else if(B >= C){
            System.out.println("B is largest :"+ B);
        }
        else{
            System.out.println("C is largest :"+ C);
        }
        sc.close();
    }
}