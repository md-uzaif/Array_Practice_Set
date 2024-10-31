package String;

import java.util.Scanner;

import static String.Palindrome.palindrome;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        subsequence();
        String s=sc.nextLine();
//          subString(s);
        allSubString(s);
//          subStringIsPalindrome(s);
    }
//-----------------------------------------------------------------------
    static void allSubString(String s) {
       for (int size=0;size<=s.length();size++)
        for (int i = 0; i < s.length()-size; i++) {
            for(int j = i; j <=i+size ; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();

        }
    }

//----------------------------------------------------------------------
    private static void subStringIsPalindrome(String s) {
        int size=4; //length of substring to print
        for (int i = 0; i <= s.length()-size; i++) {
            String t="";
            for (int j = i; j < i+size; j++) {
                t=t+s.charAt(j);
            }
           if (palindrome(t)){
               System.out.println(t);
           }
        }
    }

//----------------------------------------------------------------------
     static void subString(String s) {
        int size=4; //length of substring to print
         for (int i = 0; i <= s.length()-size; i++) {
             String t="";
             for (int j = i; j < i+size; j++) {
                t=t+s.charAt(j);
             }
             System.out.println(t);
         }
     }


//---------------------------------------------------------------------
     static void subsequence() {
//Given 2String s,t check string t can be found as a subsequence in String s
        String s = "hereiamstackerrank";
        String t = "hackerrank";  //O/p: Yes
//      String t = "hackerramp";  //O/p: No
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == t.length()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}