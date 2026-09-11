import java.util.LinkedList;
public class Classrom {
    public static void main(String[] args) {
        //create 
        //we have to use classes like Integer , Float ets instead of obj of data types likei int float
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }  
}
