public class St4 {

    public static String substr(String str , int si , int ei) {
        String subs = "";
        for(int i=si; i<ei; i++) {
            subs += str.charAt(i);
        }
        return subs;
    }
    public static void main(String[] args) {
        // String S1 = "Aryan";
        // // String S2 = "Aryan";
        // String S3 = new String("Aryan");
        // if(S1 == S2) {
        //     System.out.println("String are equal");
        // }
        // else {
        //     System.out.println("String are not Equal");
        // }

        // if(S1 == S3) {
        //     System.out.println("String are Equal");
        // }
        // else {
        //     System.out.println("String are not equal");
        // }

        // if(S1.equals(S3)) {
        //     System.out.println("String are Equal");
        // }
        // else {
        //     System.out.println("STring are not Equal");
        // }

        String str = "Hellow World!";
        // System.out.println(substr(str,0,5));

        //inbuild function of substring
        System.out.println(substr(str,0,5));
    }
}
