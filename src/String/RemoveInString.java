package String;

import java.util.Scanner;

public class RemoveInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

//        removeSpcl(s);  //Spc--->special character
//        removeSpclAndSort(s);
//        removeSpaceSE(s);
//        removeAllSpace(s);
        removeExtraSpace(s);

//------------------------------------------------------------------------
    }
//------------------------------------------------------------------------
// I/P :[     How are     you     ] & O/P :[Howareyou]
    static void removeAllSpace(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if (ch1 != ' ') {
                System.out.print(ch1);
            }
        }
    }

    //------------------------------------------------------------------------
// remove spaces from starting and ending of the string other(b/w string) remain same.
// I/P :[     How are     you     ] & O/P :[How are     you]
static void removeSpaceSE(String s) {
    int start=0;
    int end=0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)!=' '){
            start=i;
            break;
        }
    }
    for (int i = s.length()-1; i >=0; i--) {
        if (s.charAt(i)!=' '){
            end=i;
            break;
        }
    }
    for (int i = start; i <= end; i++) {
        System.out.print(s.charAt(i));
    }

}
//------------------------------------------------------------------------
//remove all extra spaces start,end and middle of the String.
// I/P :[     How are     you     ] & O/P :[How are you]
     static void removeExtraSpace(String s) {
        int si=0;   //start index
        int ei=0;   //End index
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) != ' ') {
                 si=i;break;
             }
         }
         for (int i = s.length()-1; i >=0 ; i--) {
             if (s.charAt(i) != ' ') {
                 ei=i;break;
             }
         }
         for (int i = si; i <=ei; i++) {
             if (s.charAt(i)!=' '  || (s.charAt(i)==' ' && s.charAt(i+1)!=' ')){
                 System.out.print(s.charAt(i));
             }

         }

     }

 //------------------------------------------------------------------------
    //1.remove special character  2.adding the number 3.Not mix char and Num
    static void removeSpclAndSort(String n) {
        String s="";
        int in=0;
        for (int i = 0; i < n.length(); i++) {
            char ch=n.charAt(i);
            if ((ch >= 'a') && (ch <= 'z') ||
                    (ch >= 'A') && (ch <= 'Z'))
            {
                s=s+ch;
            } else if (ch>'0' && ch<='9') {
               in= in+ch-48;  //use -48 to convert char-ascii to int.
            }
        }
        System.out.println(s+in);

    }
//------------------------------------------------------------------------
    //remove special character in string
    static void removeSpcl(String n) {
        String s="";
        for (int i = 0; i < n.length(); i++) {
            char ch=n.charAt(i);
            if (    (ch >= 'a') && (ch <= 'z') ||
                    (ch >= 'A') && (ch <= 'Z') ||
                    (ch >= '0') && (ch <= '9')  )
            {
                s=s+ch;
            }

        }
        System.out.println(s);

    }

}
