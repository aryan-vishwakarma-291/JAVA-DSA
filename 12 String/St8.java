// import java.util.*;
public class St8 {
    //ques -- 1
    public static String countvowels(String str) {


        Integer count = 0;
        for(int i=0; i<str.length(); i++) {
            char n = str.charAt(i);
            if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                count++;
            }
        }
        String s = count.toString();
        System.out.println("Total number of vowels are ");
        return s;
    }
    public static void main(String[] args) {
        //Ques --1
        //count no of vovels in a string given by user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string :");
        // String str = sc.nextLine();
        // System.out.println(countvowels(str));

        // Ques --2
        // String str = "ShradhaDidi"; 
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        // Ques -3
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        // Ques - 4
        // String str1 = "race";
        // String str2 = "bare";
        // int flag = 0;
        // for(int i=0; i<str1.length(); i++) {
        //     for(int j=0; j<str2.length(); j++) {
        //         if(str1.charAt(i) == str2.charAt(j)){
        //             flag = 1;
        //         } else {
        //             flag = 0;
        //             break;
        //         }
                
        //     }
        // }
        // if(flag == 0) {
        //     System.out.println("They are not Anagrams");
        // }else {
        //     System.out.println("THey are Anagrams ");
        // }

        // alternative code for this

        // String str1 = "earth";
        // String str2 = "heart";

         //Convert Strings to lowercase. Why? so thatwe don't have to check
        //  separately for lower & uppercase.
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
         // First check - if the lengths are the same
        // if(str1.length() ==str2.length()) {
        // convert strings into char array 
    //    char[] str1charArray = str1.toCharArray(); 
    //    char[] str2charArray = str2.toCharArray(); // sort the char array
        
        // Arrays.sort(str1charArray);
        // Arrays.sort(str2charArray);
        // boolean result = Arrays.equals(str1charArray, str2charArray);
        // if(result) {
        // System.out.println(str1+" and "+str2+" are anagrams of each other" );
        // }
        // else {
        //     System.out.println(str1+" and "+str2+" are not anagrams of  each other.");
        // }
    // }  else {
        // case when lengths are not equal
    //     System.out.println(str1+" and "+str2+" are not anagrams of each other.");
    // }
    //     sc.close();

    // Ques -- 5
    //use of intern method
    String s1 = "Aryan";
    String s2 = "Aryan";
    String s3 = new String("Aryan");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3); 
    // so to create copy for s3 we use intern method in java
    String s4 = s3.intern();
    System.out.println(s1 == s4);
    }
}
