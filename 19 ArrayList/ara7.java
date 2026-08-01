import java.util.ArrayList;

public class ara7 {
    public static void alone(ArrayList<Integer> list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(j<i || j>i) {
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        alone(list);

    }
}
