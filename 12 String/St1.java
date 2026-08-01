import java.util.*;
public class St1 {
    public static void printleters(String str){
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // syntax 
        // String str = "abcd";
      
        // // syntax
        // String str2 = new String("abcd");

        // //input or output
        // String name;
        // name = sc.nextLine(); // nextline take full line of string
        // System.out.println(name);

        //length function 
        // String nam = "Aryan Vishwakarma";
        // System.out.println(nam.length());

        //concatenation
        String firstname = "Aryan";
        String lastname = "Vishwakarma";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        
        // use of charAt function to print value at index od string
        printleters(fullname);
        sc.close();
    }
}