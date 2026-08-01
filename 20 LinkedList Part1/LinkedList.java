public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
 
    // methods like for 
    // add() at beginnig
    public void addFirst(int data) {
        //step 1 create new NOde
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 newNode next = head 
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;
    }

    //add Atlast
    public void atLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //ad at middle 
    public void add(int idx , int data) {
        // if adding at head
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i<idx-1) { 
            temp = temp.next;
            i++;
        }

        //i = idx-1 ,temp -> prev 
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //to print linked list
    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove first 
    public int removeFirst() {
        // case1  if ll is empty
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    //remove from last 
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev = size -2 
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;   
        }
        //after it is at exact prev location 
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;  
          }
        return -1;  //key not found
    }

    //recursive search
    // helper function 
    public int helper(Node head , int key) {  //O(n)
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head , key );
    }

    //to reverse a linked list
    public void reverse() {  //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //to delete nth node from end
    public void deleteNthFromEnd(int n) {
        //calculate size of LL
        int sz = 0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            sz++;
        }

        // if size = n means the last element
        if(n == sz ) {
            head = head.next;
            return;
        }

        //to calcualte for size-n
        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while(i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //to check palaindrome
    //slow-fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //it is the mid of LL
    }
    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        // step 1 - to find mid 
        Node midNode = findMid(head);

        // step 2 - to reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head; // left half head

        // step 3 - check left and right half are equal
        while(right != null) {
            if(right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }
   
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // writing methods instead of this 
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        //add at beginnig 
        // ll.print();
        
        // ll.addFirst(2);
        // ll.print();

        // ll.addFirst(1);
        // ll.print();

        //add at last
        // ll.atLast(4);
        // ll.print();

        // ll.atLast(5);

        // ll.add(2, 3);

        // ll.print();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));

        
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        //reverse
        // ll.print();
        // ll.reverse();
        // ll.print();

        //deleteNthFromEnd
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.print();


        //to check palindrome
        ll.atLast(1);
        ll.atLast(3);
        ll.atLast(2);
        ll.atLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());

    }
}
