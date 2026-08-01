import java.util.ArrayList;
// import java.util.Collections;

public class ara2 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(1);
        // list.add(9);
        // list.add(5);
        // list.add(3);
        // Collections.sort(list);
        // System.out.println(list);  // ascending order
        // Collections.sort(list, Collections.reverseOrder());  // descending order
        // System.out.println(list);


        //multidimensional Array
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
