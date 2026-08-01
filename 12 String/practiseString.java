// import java.util.*;
// public class practiseString {
//     public static int romanToInt(String s) {
//         int sum = 0;
//         for(int i=0; i<s.length()-1; i++) {
//             if(s.charAt(i) == 'I') {
//                 if(s.charAt(i+1) == 'V') {
//                     sum += 4;
//                     i++;
//                 }
//                 else if(s.charAt(i+1) == 'X') {
//                     sum += 9;
//                     i++;
//                 }
//                 else {
//                     sum++;
//                 }
//             }
//             else if(s.charAt(i) == 'V') {
//                 sum += 5;
//             }
//             else if(s.charAt(i) == 'X') {
//                 if(s.charAt(i+1) == 'L') {
//                     sum += 40;
//                 }
//                 else if(s.charAt(i+1) == 'C') {
//                     sum += 90;
//                 }
//                 else {
//                     sum += 10;
//                 }
//             }
//             else if(s.charAt(i) == 'L') {
//                 sum += 50;
//             }
//             else if(s.charAt(i) == 'C') {
//                 if(s.charAt(i+1) == 'D') {
//                     sum += 400;
//                 }
//                 else if(s.charAt(i+1) == 'M') {
//                     sum += 900;
//                 }
//                 else {
//                     sum += 100;
//                 }
//             }
//             else if(s.charAt(i) == 'D') {
//                 sum += 500;
//             }
//             else if(s.charAt(i) == 'M') {
//                 sum += 1000;
//             }
//         }
//         return sum;
//     }

//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length(); i++) {
//             if(str.charAt(i) == ' ' && i<str.length()-1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }
//             else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();

//     }
//     public static String compress(String str) {
//         String newstr = "";
//         for(int i=0; i<str.length(); i++) {
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 count ++;
//                 i++;
//             }
//             newstr += str.charAt(i);
//             if(count > 1) {
//                 newstr += count.toString();
//             }
//         }
//         return newstr;

//     }
//     public static int path(String path) {
//        int x = 0;
//        int y = 0;
//        for(int i=0; i<path.length(); i++) {
//         char d = path.charAt(i);

//         if( d == 'W') {
//             x--;
//         }
//         else if(d == 'E') {
//             x++;
//         }
//         else if(d == 'N') {
//             y++;
//         }
//         else if(d == 'S') {
//             y--;
//         }

//        }
//        int X2 = x*x;
//        int Y2 = y*y;
//        return (int)Math.sqrt(X2+Y2);


     
//     }
//     public static void subStr(String str , int si , int ei) {
//         for(int i=si; i<ei; i++ ) {

//             System.out.print(str.charAt(i));
//         }

//     }
    
    
//     public static void main(String[] args) {
//     //    String str = "aryan";
//     //    System.out.println(str);
//     //    String s = new String("aryan");
//        Scanner sc = new Scanner(System.in);
//     //    String name;
//     //    name = sc.nextLine();
//     //    System.out.println(name);
//         sc.close();
//     //     System.out.println(name.length());

//     String firstname = "Aryan";
//     String lastname = " vishwakarma";
//     String fullname = firstname + " " + lastname;
//     // System.out.println(fullname);
//     // System.out.println(fullname.charAt(0));
//     //    compress(fullname);
// // System.out.println(path("WNEENESENNN") );
//     //  String str = "Aryan";
//     //  System.out.println(str.substring(0,5));
//         // subStr(str, 0, 3);

//         String fruits[] = {"apple" , "mango" , "banana"};
//             String largest = fruits[0];

//         for(int i=0; i<fruits.length; i++) {
//             if(largest.compareToIgnoreCase(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }

//         }
//         // System.out.println(largest);
//         // StringBuilder sb = new StringBuilder("");
//         // for(char ch = 'a'; ch <= 'z'; ch++) {
//         //     sb.append(ch);
//         // }
//         // System.out.println(sb);

//         // String sb = new String("this is a book");
//         // for(int i=0; i<sb.length(); i++) {
//         //     sb.toUpperCase(sb.charAt(i));
//         // }
//     //    System.out.println(toUpperCase("this is a car")); 
//     //    System.out.println(compress("aaabbbcccc"));
//        String strs[] = {"flower","flow","flight"};
//        String newstr = "";
//        for(int i=0; i<strs[0].length(); i++) {
//         char ch = strs[0].charAt(i);
//         boolean match = true;
//         for(int j=1; j<strs.length; j++) {
//             if(strs[j].length() < i || ch != strs[j].charAt(i)) {
//                 match = false;
//                 break;
//             }
//         }
//         if(match) {
//             newstr += ch;
//         }
//         else {
//             break;
//         }
//        }
//     //    System.out.println(newstr);
//     System.out.println(romanToInt("III"));
    
    
//     }

// }
