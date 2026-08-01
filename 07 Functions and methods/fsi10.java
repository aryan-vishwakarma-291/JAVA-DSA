public class fsi10 {
// Question -- To calculate the Averageg of 3 Numbers
    public static int Average(int a , int b , int c){
        int avg = (a+b+c)/3;
        return avg;
    }
// Question -- To check EVEN NUMBERS

    public static boolean isEven(int n) {
        if(n%2 == 0){
           return true;
        }
        return false;
    }

//Question -- to check palindrome Number
public static boolean isPalindrome(int number) {
    int palindrome = number;// copied number intovariable
    int reverse = 0;
    while(palindrome!=0) {
    int remainder = palindrome % 10;
    reverse = reverse * 10 + remainder;
    palindrome = palindrome / 10;
    }
    if(number==reverse) {
        return true;
        }
        return false;
    
}

public static int sumDigits(int n) {
    int sum = 0;
    while(n>0) {
    int lastDigit = (n%10);
    sum += lastDigit;
    n = n/10;
}
   return sum;
  }
   
   
    
    public static void main(String[] args) {
        // Q1 -- System.out.println(Average(5, 5, 5));
        // Q2 -- System.out.println(isEven(3));
        // Q3 -- int palindrome = 121;
        // if(isPalindrome(palindrome)) {
        //     System.out.println("Number : "+palindrome+" is a palindrome");
        // } 
        // else {
        //     System.out.println("Number : "+palindrome+" is not a palindrome");
        // }
        System.out.println(sumDigits(789));
  
        
        
    
    }

}
