package String;

import java.util.Scanner;
//Ascii  Range ---48 57,65 90,97 122 --0 9 A Z a z --- 65 97 -- A a -- +25 +25 -- Z z
public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        changeLower(s);
        changeUpper(s);
//----------------------------------------------------------------------------------
    }

    private static void changeUpper(String s) {
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                s1=s1+(char)(ch-32);
            }else {
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }

//-----------------------------------------------------------------------
// change String Upper case to Lower Case without using inbuilt method.
     static void changeLower(String s) {
            String s1="";
         for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
//65 'A' +32 =97 'a' use explicit cast otherwise O/P will come int value
                 s1 = s1 + (char) (s.charAt(i) + 32);
             }else{
                 s1=s1+s.charAt(i);
             }
         }
         System.out.println(s1);
    }
}
