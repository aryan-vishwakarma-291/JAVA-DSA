public class fsi6 {
    // Function Overloading
     public static int sum(int a ,int b){
        return a + b;
     }

     public static float sum(float a, float b){
        return a + b;
     }

     public static int sum(int a , int b , int c){
        return a + b + c;
     }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(1,3,5));
        System.out.println(sum(4.5f,4.5f));
    }
}
