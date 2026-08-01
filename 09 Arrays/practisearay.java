public class practisearay {
    public static int linearSear(int key , int arr[]) {
        for(int i=0; i<=(arr.length); i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      int key = 3;
      int index = linearSear(key, arr);
      if(index==-1) {
        System.out.println("NUmber not found");
      }
      else {
        System.out.println("NUmber found at " + (index+1) + " position");
      }


    }
}
