import java.util.*;
import java.util.LinkedList;
public class QueueG { //first non repeating character
    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; //create a freq array to store the count of character frequenct
        Queue<Character> q = new LinkedList<>(); // createa a stack q

        for(int i=0; i<str.length(); i++) { //traverse through each character
            char ch = str.charAt(i);
            q.add(ch); // add at front of queue
            freq[ch-'a']++; // increase the frequency of that character by 1

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) { // remove the character from queue until it becomes empty and its peek element has freq greater than 1
                q.remove();
            }
            
            if(q.isEmpty()) { //if queue becomes empty then print -1
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" "); //if not then print that element
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
