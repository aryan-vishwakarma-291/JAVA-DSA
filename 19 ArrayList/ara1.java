import java.util.ArrayList;
public class ara1 {
    public static void swap(ArrayList<Integer> list , int idx1 , int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // add elemets 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); //time complexity O(1)
        list.add(1,9); //O(n)
        // System.out.println(list);

        //get operation
        //time complexity o(1)
        // int element = list.get(2);
        // System.out.println(element);

        //remove operation
        //time complexity O(n)
        // list.remove(2);
        // System.out.println(list);

        //set operation
        //time complexityo(n)
        // list.set(2, 10);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        //size function
        // System.out.println(list.size());

        //print the arraylist
        // for(int i=0; i<list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }

        //to print reverse of array list
        // for(int i=list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        // to print max number
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++) {
        //     // if(max < list.get(i)) {
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("MAx element = " + max);

        //swap two numbers
        int idx1 = 1 , idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
