public class QueueA {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //for checking empty quwuw
        public static boolean isEmpty() {
            return rear == -1;
        }

        //add 
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
             rear = rear + 1; //-> -1+1 = 0
             arr[rear] = data;
        }

        //remove
         public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];  //first store the front element
            for(int i=0; i<rear; i++) { //shift all element by by one index
                arr[i] = arr[i+1];
            }
            rear = rear-1; // make rare to rear -1 
            return front;
         }

        //peek 
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0]; //return only 0 indexed element
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
