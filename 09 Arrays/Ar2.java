public class Ar2 {
    public static void update(int marks[]) {
        for(int i=0; i<(marks.length); i++){
            marks[i] = marks[i] + 1;
        }
    }
    // Arays use call by reference method;
    // the values changes in main function also 
    public static void main(String[] args) {
        int marks[] = {1,2,3};
        update(marks);
        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }

    }  
}
