public class R3 {
    // Question 1
    public static void occuOfNum(int arr[] , int key , int idx) {
        if(idx == arr.length) {
            return ;
        }
        if(arr[idx] == key) {
            System.out.print(idx + " ");
        }
        occuOfNum(arr, key, idx+1);
    }

    // Question 2
    static String digits[] = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine" , "ten"};
    public static void printDigit(int number) {
        if(number == 0) {
            return;
        }
        int lastdigit = number%10;
        printDigit(number/10);
        System.out.print(digits[lastdigit] + " ");   
    }

    public static void lenOfString(String str , int i , int len) {
        if(i == str.length()) {
            System.out.println(len);
            return;
        }
        len+=1;
        lenOfString(str, i+1 , len );

    }
     public static void main(String[] args) {
        // Question 1
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // int idx = 0;
        // occuOfNum(arr, key, idx);

        // Question 2
        // printDigit(1234);

        // Question 3
        // String str = "Aryan";
        // int len = 0;
        // lenOfString(str, 0, len);

         





    }


}
