import java.util.*;
public class hat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a*b;
        System.out.println(mul);
        int r = sc.nextInt();
        double ar = (3.14*(r^2));
        System.out.println(ar);

        sc.close();
    }
}
