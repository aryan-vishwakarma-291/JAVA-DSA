import java.util.*;
public class StackD {
    public static void pushAtBottom(Stack <Integer> s , int data) { //
        if(s.isEmpty()) { // if stack empty then push the data
            s.push(data);
            return ;
        }
        int top = s.pop(); //remove top element
        pushAtBottom(s, data); // then calling recursive function
        s.push(top); // again pushing the same elements
    }

    public static String reverseString(String str) { // to reverse a string
        Stack<Character> s = new Stack<>(); // make a stack of character
        int idx = 0;
        while(idx<str.length()) {  //push the character of str into stack s
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder(); //make result string to store reverse string
        while(!s.isEmpty()) {
            char ch = s.pop();
            result.append(ch);
        }

        return result.toString(); //converting again stringBuilder into string
    }
    public static void main(String[] args) { //TO push an element at bottom
       //Ques 1
        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4); // calling a recursive function

        // while (!s.isEmpty()) { {  // to print stack elements
        //     System.out.println(s.peek());
        //     s.pop();
        // }
            
        // }

        //Ques2
        String str = "abc";
        String result =  reverseString(str);
        System.out.println(result);
    }
}
