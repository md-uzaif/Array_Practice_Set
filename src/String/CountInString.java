package String;

import java.util.Scanner;

public class CountInString {

    private static void countString(String s) {
        int vc=0; //for vowel count
        int cc=0; //for consonant count
        int nc=0; //for number count
        int sc=0; //for special char count
        for (int i = 0; i < s.length(); i++) {
           char ch=s.charAt(i);

            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                if((ch=='a'||ch=='A' || ch=='e'||ch=='E' || ch=='i'||
                        ch=='I' || ch=='o'||ch=='O' || ch=='u'||ch=='U'))
                {
                    vc++;
                }
                else {
                    cc++;
                }
            } else if (ch>='0' && ch<='9') {
                nc++;
            }
            else {
                sc++;
            }
        }
        System.out.println("Vowel: " +vc +"\n"
                +"Consonent: " +cc +"\n"
                +"Numeric: "+nc +"\n"
                +"Special Char: "+sc);
    }

//********************** MAIN ********************************************
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String s=sc.nextLine();

        countString(s);
//      countSpace(s);
//      countWord(s);
//        countVowel(s);
//        countConsonant(s);
//------------------------------------------------------------------------
}


    static void countConsonant(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            if(!(ch=='a'||ch=='A' || ch=='e'||ch=='E' || ch=='i'||
                 ch=='I' || ch=='o'||ch=='O' || ch=='u'||ch=='U'))
            {
                count++;
            }
        }
        System.out.println(count);
     }
//------------------------------------------------------------------------

    static void countVowel(String s) {
        int count=0;
         for (int i = 0; i < s.length(); i++) {
             char ch=s.charAt(i);
             if(ch=='a'||ch=='A' ||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                 count++;

             }
         }
         System.out.println(count);
    }
//------------------------------------------------------------------------

    static int countWord(String s) {
        int count=0;
        for (int i = 0; i < s.length()-1; i++) { //use s.length()-1 to ignore (StringIndexOutOfBoundsException) becz compare(i+1)
             if (s.charAt(i)==' ' && s.charAt(i+1)!=' '){ //s.charAt(i+1)!=' ' --->use to ignore multiple spaces
                 count++;
             }

         }
        int res = s.charAt(0) ==' ' ? count : count+1 ; // ignore space at starting
    //     System.out.println(res);
        return res; //it used in String Reverse
    }
//------------------------------------------------------------------------

    static void countSpace(String s) {
        int count=0;
        //char sp=' ';
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i)==' ') {
                 count++;
             }
         }
         System.out.println(count);
    }

//-------------------------------------------------------------------------
}
