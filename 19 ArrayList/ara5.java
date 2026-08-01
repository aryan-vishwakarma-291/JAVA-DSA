import java.util.ArrayList;

public class ara5 {
    public static boolean pairsum(ArrayList<Integer> list , int target) {
        // to find lp and rp
        int lp =0; 
        int  rp = 0;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i)>list.get(i+1)) {
                 lp = i+1;
                 rp = i;
                break;
            }
        }
        // to check sum pair
        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%list.size();
             } else {
                rp = (list.size()+rp-1) % list.size();
             }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //sorted and rortated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 13;
        System.out.println(pairsum(list, target));



    }
}
