import java.util.*;
public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num) {
            case 1 : System.out.println("Sunday");
                break;
            case 2 : System.out.println("MOnday");
                break;
            case 3 : System.out.println("Tuesday");
                break;
            default : System.out.println("wednesday");
        }

        sc.close();
    }
}
