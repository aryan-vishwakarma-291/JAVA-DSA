public class lam {
    public static void main(String[] args) {

        //Java convert each data type in int while evaluating expression
        
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte)(a + b + c) ;
        System.out.println(bt);

        /* 
         if one operand is long ,float or double the whole expression
         converted to long float or double
        */
        int e = 10;
        float f = 20.25f;
        long g = 25;
        double d = e + f + g ;
        System.out.println(d);



    }
}
