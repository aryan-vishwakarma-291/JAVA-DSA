import java.util.*;
public class QueueE {
    static class Queue{  //Queue using 2 stack
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add o(n)
        public static void add(int data) {
            while(!s1.isEmpty()) { //tranfer all elements in s2 first if s1 is not empty
                s2.push(s1.pop());
            }
            s1.push(data); //then push new element in s1
            while(!s2.isEmpty()) { //after tranfering s2 elements in s1 back
                s1.push(s2.pop());
            }
        }

        //remove o(1)
        public static int remove() {
            if(s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            } 
            
            return s1.pop();
            
        }

        //peek O(1)
        public static int peek() {
            if(s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            } 
            
            return s1.peek();
        }
      
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
