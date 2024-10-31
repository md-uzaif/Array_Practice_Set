package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();

//(2)   create a method palindrome() and call it.
        //String res= palindrome(s);
        //System.out.println(res);

    //  String s = "forgeeksskeegfor";
    //  String s = "mississippi";
        System.out.println(longestPalSubstr(s));


//(1) this approach is good but not best

//        String res=StrReverse(s); //call reverse method
//        if(s.equals(res)){
//            System.out.print("palindrome");
//        }
//        else {
//            System.out.println("not palindrome");
//        }


    }

    //---------------------------------------------------------------------
    static Boolean palindrome(String s) {
        int start = 0;            //starting index pointing of String ++
        int end = s.length() - 1;  //ending index pointing of String --
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;

    }


    //****************************************************
    static boolean checkPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
//---------------------------------------------------------------------------------------------
    // This function prints the longest palindrome substring
    // It also returns the length of the longest palindrome
    static String longestPalSubstr(String s) {
        int n = s.length();

        // All substrings of length 1 are palindromes
        int maxLen = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // Check if the current substring is palindrome
                if (checkPal(s, i, j) && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
        //            System.out.println(s.substring(start, start + maxLen));
                }
            }
        }

        return s.substring(start, start + maxLen);
    }



}