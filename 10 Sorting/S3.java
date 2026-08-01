import java.util.Arrays;
import java.util.Collections;
// import java.util.*;
public class S3 {
    public static void main(String[] args) {
       Integer arr[] = {5,4,2,1,3};
    // sorting in ascending order

    //    Arrays.sort(arr); 
    //    Arrays.sort(arr,0,3); 

    //sorting in descending order

        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
       for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");
       }
       
    }
}
