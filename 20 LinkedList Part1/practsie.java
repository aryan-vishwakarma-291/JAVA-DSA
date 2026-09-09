public class practsie {
    public static class Node {
        int data;
        Node next;
        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // define head and tail node in practsie class as a property beacause there is only one head and tail node exists/
    public static Node head;
    public static Node tail;
    // define static size variable to track the size of linked list its value is 0 bydefault
    public static int size;

    // now to create methods for add , remove , print , search node in linked list

    // add function 
    // add first 
    // now we create non static method because we create linked list using its object ll thats why
    public void addFirst(int data) {
        // 1 step -  create new node
        Node newNode = new Node(data);
        size++;
        // if there is no node then assign newnode firstly to tail then assign to tail
        if(head == null) {
            head = tail = newNode;
            return;
        }
         // 2 step - point new node next --> head
        newNode.next = head;
        // 3 step - make newnode to head;
        head = newNode;
    }

    //add last 
    public void addLast(int data) {
        // step1  create a newNOde
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 points tail node next --> newNode
        tail.next = newNode;
        // step 3 make newNode a tail
        tail = newNode;
    }
    // NOw to print a linked list 
    // 1 create temporary node temp;
    // 2 store head in temp node;
    // 3 now print data of temp node
    // 4 then points temp to temp node next
    // time complexity -> O(n)
    public  void printLL() {
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

    // ADD node in the middle
    // we pass idx and data in this function
    // O(1) for linking the node
    // O(n) to find index where we add this node
    // first we make a temporary Node and assign head to it
    // then we run a while loop i < idx-1 , temp = temp.next , i++
    // then we get our prev(temp) node
    // then we point newnode.next -> temp.next
    // then temp.next -> newnode
    // if we want to add at index 0 then we have to call addfirst beacause it is managing the head node i.e imp to manage 

    public void add(int idx , int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // to write a function for removing node from first
    // in this we head = head.next
    //there is 3 cases
    //case 1 when size = 0 then it means LL is empty
    //case 2 when size = 1 then we have to change both head and tail to null
    //case 3 other than these 2 cases make size--;
    public int removeFirst() {
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

    //function to remove from last
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
    // now finding prev node i.e prev = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // now to do iterator search for a key in LL

    public int itrSearch(int key) {
        Node temp = head;
        int i =0;

        while(temp != null) {
            if(temp.data == key) {  //key found
                return i;
            }
            temp = temp.next; //if not found move toeards next node
            i++;
        }
        return -1; // if the element is not present in the linked list
    }

    //now to write recursive search code in it
    public int helper(Node head,int key) { //O(n)
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
        return helper(head,key);
    }

    //reverse a linked list  // O(n)
    // 1 take three variable prev , curr , next
    // run while loop curr != null with these following conditions
    // next = curr.next
    // curr.next = prev
    // prev = curr
    // curr = next
    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) { 
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // at the end curr is null so the prev node is now head
        head = prev;
         
    }

    // now to find and remove Nth Node from End
    public void deleteNthNode(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        // when there is only head node to delete
        if(n == sz) {
            head = head.next;
            return;
        }
        //we have reach the sz-n node first
        //then we points to prev.next.next 
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    //to check LL is palindrome
    //function to find mid node
    // slow fast approach
    public Node findMid(Node head) {
        Node slow = head; //it moves +1
        Node fast = head;  //it moves +2

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //it is the mid node
    } 
    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        //step 2 reverse second
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head, beacause when curr null prev is last node i.e it is head
        Node left = head; // left half head

        //step 3 check left == right halft
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }
    public static void main(String[] args) {
        practsie ll = new practsie();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(4,5);
        // ll.printLL();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        
        // System.out.println(ll.recSearch(10));
        // System.out.println(ll.recSearch(3));

        // ll.reverseLL();
        // ll.printLL(); 

        // palindrome 
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(1);
        System.out.println(ll.checkPalindrome());





    }
}
