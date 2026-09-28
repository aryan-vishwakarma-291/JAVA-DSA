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

    public static void reverseStack(Stack<Integer> s ) {
        if(s.empty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void stockSpan(int stocks[] , int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);

        }

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
        // String str = "abc";
        // String result =  reverseString(str);
        // System.out.println(result);

        //Ques3
        //reverse a stack
        //remove element one by one from stack using recursion
        //again pushing element at bottom of each element to the stack

        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);

        // while(!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        //Ques 4
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);

        for(int i=0; i<span.length; i++) {
            System.out.println(span[i] + " ");
        }




    }
}
