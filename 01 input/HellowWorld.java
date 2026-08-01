public class HellowWorld {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length-1-i;j++){
                if(nums1[j]>nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hellow Aryan!");
        // System.out.println("Hellow Aryan!");
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
    
}
