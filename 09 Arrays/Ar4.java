public class Ar4 {
    // to find largest number in a given array
    public static int getLargest( int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return largest ;
       

    }
    public static void main(String[] args) {
        int numbers[] = { 1,3,2,7,5,9};
        System.out.println("Largest value is " + getLargest(numbers));
    }
}
