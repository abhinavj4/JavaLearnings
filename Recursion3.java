//This program will generate all the permutations of characters for a given string.

public class Recursion3 {
    public static void printPermutation(String str, int idx, String perm) {
        System.out.print(idx + ". ");
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
       
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1); //this will remove the char at i
            
            printPermutation(newStr, idx+1, perm+currChar);
            
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str, 0, "");
    }
 }
 