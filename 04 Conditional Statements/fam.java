import java.util.*;
public class fam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Enter choice :");
        System.out.println(" + for Addition :");
        System.out.println(" - for Subtraction :");
        System.out.println(" * for Multiplication :");
        System.out.println(" / for Division :");
        char operator = sc.next().charAt(0);
      
        switch(operator) {
            case '+' : System.out.println("Adition :" + (a+b));
                        break;
            case '-' : System.out.println("Subtraction :" + (a-b));
                        break;
            case '*' : System.out.println("MUltiplication :" + (a*b));
                        break;
            case '/' : System.out.println("Division :" + (a/b));
                        break;
            default : System.out.println("Operator not comsidered ");

        }
        sc.close();
    }
}
