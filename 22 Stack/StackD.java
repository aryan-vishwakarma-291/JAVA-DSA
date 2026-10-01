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

    public static boolean isValid(String str) {  //fo r valid parenthesis
        Stack<Character> s = new Stack<>(); // create a stack s

        for(int i=0; i<str.length(); i++) { //iterate throufh each characer of str
            char ch = str.charAt(i); // store it in ch
            //for opening 
            if(ch == '(' || ch == '[' || ch == '{') { // condition for checking openini bracket
                s.push(ch); //push it 
            } else {  //check for closing bracket
                if(s.isEmpty()) { //first we check if the stack is empty
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || //then check pair of each open and closing pair
                    (s.peek() == '[' && ch == ']') ||
                    (s.peek() == '{' && ch == '}')
                ) {
                    s.pop(); //if true pop the element from top
                } else {
                    return false; //else return false
                }
            }
           
        }
        if(s.isEmpty()) { //at last we have to check if stack is empty or not 
            return true; //if emprty return true
        } else {  //else return false
            return  false;
        }
    }

    //valid parenthesis
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;  // duplicate exists

                } else {
                    s.pop();
                }

            } else {
                ///opening 
                s.push(ch);
            }
        }
        return false;
    }

    public static void  maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer>  s = new Stack<>();
        //next smallest right
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //curretn width = j-i-1 = 
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max area in histogram is " + maxArea);
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
        // int stocks[] = {100,80,60,70,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks,span);

        // for(int i=0; i<span.length; i++) {
        //     System.out.println(span[i] + " ");
        // }

        //ques 5
        // int arr[] = {6,8,0,1,3};
        // Stack<Integer> s = new Stack<>();
        // int nextGreater[] = new int [arr.length];

        // for(int i=arr.length-1; i>=0; i--) {
        //     //while loop
        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        //         s.pop();
        //     }

        //     //if-else
        //         if(s.isEmpty()) {
        //             nextGreater[i] = -1;
        //         } else {
        //             nextGreater[i] = arr[s.peek()];     
        //         }

        //     // push element in statck
        //     s.push(i);

             
        // }
        // for(int i=0; i<nextGreater.length; i++) {
        //     System.out.print(nextGreater[i] + " ");
        // }
        // System.out.println();


    //Ques 6
    // String str = "";  //O(N)
    // System.out.println(isValid(str));

    //ques 7
    //duplicate parenthesis
    // String str = "((a+b))"; //true  //O(N)
    // String str2 = "(a-b)"; // false
    // System.out.println(isDuplicate(str2));

    
    //ques 8
    //Max area in histogram
    int arr[] = {2,1,5,6,2,3};
    maxArea(arr);

    }
}
