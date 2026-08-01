public class S5 {
    public static void countSort(int arr[]) {
        // to find largest number for range 
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest , arr[i]);
        }

        // sorting on original array
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting on count or frequency array
         
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }




    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
