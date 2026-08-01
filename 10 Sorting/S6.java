public class S6 {
    //ques 1 To print element in descending order
    public static void bubSort(int arr[]) {
        int n = arr.length;
        int temp;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //ques -- selection sort in descending order

    public static void sleSort(int arr[]) {
        int n = arr.length;
        int temp;
        for(int i=0; i<n-1; i++) {
            int minpos = i;
            for(int j = i+1; j<n; j++) {
                if(arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    // ques -- insertion sort n descending order
    public static void insSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        
    }

    // ques -- countinf sortn=ing in descending order

    public static void counSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {  
                largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
                
            }
        }
        

    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubSort(arr);
        // sleSort(arr);
        // insSort(arr);
        counSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
