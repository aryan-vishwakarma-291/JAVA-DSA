public class Ar14 {
    // Ques --1
    // public static int checkNum(int nums[]) {
    //     for(int i=0; i<nums.length; i++) {
    //         for(int j=i+1; j<nums.length; j++){
    //             if (nums[i] == nums[j]){
    //                 return 1;
    //             }
    //         }
    //     }
    //     return 0;
    // }   

    //Ques --2
    // public static int maxProfit(int nums[]) {
    //     int maxP = Integer.MIN_VALUE;
    //     int currP = 0;
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++) {
    //             if(nums[j] > nums[i]) {
    //                 currP = nums[j] - nums[i];
    //                 maxP = Math.max(maxP,currP);
    //             }
    //         }
           
    //     }
    //     if(maxP <= 0) {
    //         return 0;
    //     } else {
    //     return maxP;
    //     }
    //  }

    // Ques --3

    // public static int trapWater(int height[]) {
    //     int n = height.length;
    //     // for leftSubArray
    //     int leftmax[] = new int[n];
    //     leftmax[0] = height[0];
    //     for(int i=1; i<n; i++) {
    //         leftmax[i] = Math.max(leftmax[i] , height[i-1]);
    //     }

    //     // for rightSubArray 
    //     int rightmax[] = new int[n];
    //     rightmax[n-1] = height[n-1];
    //     for(int i=n-2; i>=0; i--) {
    //         rightmax[i] = Math.max(rightmax[i] , height[i+1]);
    //     }

    //     // for waterlevel--
    //     int trappedwater = 0;
    //     for(int i=0; i<n; i++) {
    //         int waterlevel = Math.max(leftmax[i],rightmax[i]);
    //         trappedwater += waterlevel - height[i];
    //     }
    //     return trappedwater;

    // }

    // Ques - 4
     public static void triplet(int nums[]) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                for(int k=1; k<n; k++){
                    if((nums[i]+nums[j]+nums[k]) == 0){
                        System.out.println("[ "+ nums[i] + "," + nums[j] + "," + nums[k] + " ]" );
                    }
                }
            }
        }
     }
    public static void main(String[] args) {
        // Ques --1
        // int nums[] = {1,2,3,4};
        // int n = checkNum(nums);
        // if(n==1) {
        //     System.out.println("True");
        // } 
        // else {
        //     System.out.println("False");
        // }


        // Ques--2

        // int nums[] = {7,1,5,3,6,4};
        // System.out.println(maxProfit(nums));

        //Ques --3
        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // System.out.println(trapWater(height));

        //Ques -- 4
        int nums[] = {-1, 0, 1, 2, -1, -4 };
        System.out.println(nums);
    }
}
