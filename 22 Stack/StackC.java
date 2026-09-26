import java.util.*;;  
public class StackC {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();  //IT is the stack implemetation using java collection framework
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        
        s.pop();
        System.out.println(s.peek());

    }
}
