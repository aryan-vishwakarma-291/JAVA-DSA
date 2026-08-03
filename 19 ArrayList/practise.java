import java.util.ArrayList;
import java.util.Collections;

public class practise {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(8);
        // list.add(4);
        // list.add(5);
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
        
        // Collections.sort(list , Collections.reverseOrder());
        // System.out.println(list);

        // ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList <Integer> list1 = new ArrayList<>();
        // ArrayList <Integer> list2 = new ArrayList<>();
        // for(int i=1; i<=5; i++) {
        //     list1.add(i);
        //     list2.add(i*2);
        // }
        //  mainList.add(list1);
        //  mainList.add(list2);
        
        // for(int i=0; i<mainList.size(); i++) {
        //     ArrayList <Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // most water contatner problem
        ArrayList <Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(6);
        list3.add(2);
        list3.add(5);
        list3.add(4);
        list3.add(8);
        list3.add(3);
        list3.add(7);
        // int maxWater = 0 ;
        // for(int i=0; i<list3.size(); i++) {
        //     for(int j=0; j<list3.size(); j++) {
        //         int ht = Math.min(list3.get(i), list3.get(j));
        //         int wd = j-i;
        //         int currWater = ht*wd;
        //         maxWater = Math.max(currWater, maxWater);
        //     }
        // }

        // System.out.println(maxWater);

        // #2pointer approach
       

        int LP = 0; 
        int RP = list3.size()-1;
        int maxWater = 0;
        
        while(LP < RP) {
            
            int ht = Math.min(list3.get(LP) , list3.get(RP));
            int wd = RP-LP;
            int currWater = ht*wd;
            maxWater = Math.max(currWater, maxWater);
            if(list3.get(LP) < list3.get(RP)) {
                LP++;
            } else {
                RP--;
            }

        }
        System.out.println(maxWater);



    }
}
