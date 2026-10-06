import java.util.*;
import java.util.LinkedList;
public class QueueH {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()) { //first push all elements of queue into stack
            s.push(q.remove());
        }
        while(!s.isEmpty()) { // then push all elements of stack into queue 
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while(!q.isEmpty()) {
            System.out.println(q.remove() + "");
        }
        
        
    }
}
