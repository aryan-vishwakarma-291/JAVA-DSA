public class Ar7 {

    public static void printPairs( int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=(i+1); j<numbers.length; j++) {
                System.out.print("("+curr + "," +numbers[j]+")");
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        int n = numbers.length;
        int tp = n*(n-1)/2;
        printPairs(numbers); 
        System.out.println("Total numbers of pairs : " + tp);

    }
}
