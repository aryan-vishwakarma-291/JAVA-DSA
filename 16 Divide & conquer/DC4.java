public class DC4 {
    // Question 1
    public static int majorityElement(int arr[]) {
        int majorCount = arr.length/2;
        for(int i=0; i<arr.length; i++) {
            int count = 0 ;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] == arr[i]) {
                    count+=1;
                }
            }
            if(count > majorCount) {
                return arr[i];
            }
        }
        return -1;
    }

    // question 2 
    public static int inversion(int arr[]) {
        int invCount = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }
    public static void main(String[] args) {
        //Question 1
        // int arr[] = {3,3,3,4,4,4,4};
        // System.out.println(majorityElement( arr));

        //Question 2
        int arr[] = {2,4,1,3,5};
        System.out.println(inversion(arr));

    }
}
