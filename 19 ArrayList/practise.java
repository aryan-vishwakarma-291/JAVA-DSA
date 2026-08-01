import java.util.ArrayList;
import java.util.Collections;

public class practise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(5);
        //  list.remove(1);
        //  list.set(0, 10);
        // System.out.println(list);
        // System.out.println(list.get(2));
        // System.out.println(list.contains(2));
        // System.out.println(list.size());
        // for(int i=list.size()-1; i>=0; i--) {
        //     System.out.print(" " + list.get(i));
        // }
        // int max = 0;
        // for(int i=0; i<list.size(); i++) {
        //     if(max < list.get(i)) {
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        // int temp = list.get(1);
        // int temp2 = list.get(3);
        // list.set(1, temp2);
        // list.set(3, temp);
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);
        
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);



    }
}
