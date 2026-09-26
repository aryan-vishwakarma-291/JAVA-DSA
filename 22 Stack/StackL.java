public class StackL {
    static class Node { //to implement statck using Linked List fir we create a class of node
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack { // here we define all operation of Stack
        static Node head = null;

        public static boolean isEmpty() { //to check head is null
            return head == null;
        }
        
        // PUSH operation
        public static void push(int data) { //to push data 
            Node newNode = new Node(data); // create newNode first
            if(isEmpty()) { //if head is null then assign head to newnode
                head = newNode;
                return;
            }

            newNode.next = head; // otherwise points newnode next to head 
            head = newNode; // make newnode as head
        }

        //POP operation
        public static int pop() { // to remove the top element of stack
            if(isEmpty()) { // to check if the stack is empty
                return  -1;
            }

            int top = head.data; //store top element first
            head = head.next; // make head to head.next
            return top;  // then return the top of the stack
        }

        //PEEK operation
        public static int peek() {  //to print the top element of the stack
            if(isEmpty()) { /// to check if the stack is empty
                return -1;
            }
            return head.data;  // return the top of stack directly
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
