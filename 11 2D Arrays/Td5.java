public class Td5 {
    //Ques --1
    // public static void search(int matrix[][] , int key) {
    //     int count = 0;
    //     for(int i=0; i<matrix.length; i++) {
    //         for(int j=0; j<matrix[0].length; j++) {
    //             if(matrix[i][j] == key) {
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println("Total number of " + key + " are " + count);
    // }

    // Ques --2

    // public static void sum(int nums[][]) {
    //     int add = 0;
    //     int i = 1;
    //     int j = 0;
    //     while(j<nums[0].length) {
    //          add += nums[i][j];
    //          j++;
    //     }
      
    //     System.out.println("Sum of second row element is " + add );
    // }

    //Ques --3
    //Tranpse of Matrix
    public static void printmatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        //Ques --1
        // int matrix[][] = {{4,4,7},
        //                   {5,6,4}  };
        
        // int key = 4;
        // search(matrix , key);

        //Ques --2
        // int nums[][] = { {1,4,9},{11,4,5},{2,2,3}};
        // sum(nums);

        //Ques --3
        
        int matrix[][] = {{1,2,3},
                          {4,5,6}  };
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printmatrix(transpose);

    }
}
