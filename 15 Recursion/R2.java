public class R2 {
    // tiling problem
    public static int tilingProb(int n) {
        // base case 
        if(n == 0 || n == 1) {
            return 1;
        }
        // for vertical
        int fnm1 = tilingProb(n-1);
        // for horizontal
        int fnm2 = tilingProb(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    // duplocate string
    public static void removeduplicate(String str , int idx , StringBuilder newstr , boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newstr);
            return;
        }
         
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            removeduplicate(str, idx+1, newstr, map);
        } else {
            map[currChar-'a'] = true ;
            removeduplicate(str, idx+1, newstr.append(currChar), map);
        }
    }

    public static int pairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        // for single
        int fnm1 = pairing(n-1);
        
        // for double
        int fnm2 = pairing(n-2);
        int ways = (n-1) * fnm2;

        int totways = fnm1 + ways;
        return totways;
    }

    // combination of 0 and 1 without consecutive 1's
    public static void printones(int n , int lastPlace , String str) {
        if(n == 0) {
            System.out.println(str);
            return ;
        }

        printones(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printones(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {

        // System.out.println(tilingProb(4));

        // String str = "aappnnnacooleeggee";
        // removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);

        // pairing problem
        // System.out.println(pairing(3));

        // combination of 0's and 1's   
        printones(3, 0, "");
    }
}
