package String;

import java.util.Scanner;

import static String.CountInString.countWord;

public class StringReverse {


//************************************************************************************************
    //Store the String in Array word by word.

    static String[] StringInArray(String s){
        int count= countWord(s);
        String []arr=new String[count];

        int j=0;
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);

            if (ch!=' '){
                t=t + ch;
            }
            else if (t.length()>0){
                arr[j]=t;
                j++;
                t="";
            }
        }
        if (t.length()>0) {
            arr[j] = t;
        }

        return arr;
    }


//----------------------------------------   1   -----------------------------------------------------
//I/P :    India is my Country
//O/P1:    yrtnuoC ym si aidnI

    static String StringReverse(String s){
        String t="";
        for (int i=s.length()-1; i>=0; i--){
            t=t+s.charAt(i);
        }
        return t;
    }


//----------------------------------------   2   -----------------------------------------------------
    
//I/P :      India is my Country
//O/P2:      Country my is India
static void StringReverse2(String s) {
/*

        int count= countWord(s);
        String []arr=new String[count];

    int j=0;
    String t = "";
    for (int i = 0; i < s.length(); i++) {
        char ch= s.charAt(i);

        if (ch!=' '){
           t=t + ch;
       }
        else if (t.length()>0){
           arr[j]=t;
           j++;
           t="";
       }
    }
    if (t.length()>0) {
        arr[j] = t;
    }
*/



    String []arr=StringInArray(s);

    for (int i = arr.length-1; i >=0; i--) {
        System.out.print(arr[i] + " ");
//        System.out.print(StringReverse(arr[i]) + " ");
//         yrtnuoC ym si aidnI
    }
}


//----------------------------------------   3   -----------------------------------------------------
    
//I/P :      India is my Country
//O/P3:      India5 is2 my2 Country7
static void StringReverse3(String s){
    int count=0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)!=' '){
            count++;
            System.out.print(s.charAt(i));
        }
        else {
            System.out.print(count+" ");
            count=0;
        }
    }
    System.out.print(count);
}

//----------------------------------------   4   -----------------------------------------------------

//I/P :      India is my Country
//O/P4:      isIndia Countrymy
static void StringReverse4(String s) {

    String[] arr=StringInArray(s);

    for (int i = 0; i < arr.length-1; i=i+2) {

        System.out.print(arr[i+1]+arr[i] +" ");

    }

}


//----------------------------------------   5   -----------------------------------------------------

//I/P :      India is my Country
//O/P5:      IndiaCountry ismy

    static void StringReverse5(String s){
        String[] arr=StringInArray(s);
        for (int i = 0,j=arr.length-1;   i < j;   i++,j--) {
            System.out.print(arr[i]+arr[j] +" ");
        }
    }

//----------------------------------------   6   -----------------------------------------------------
    
//I/P :      India is my Country
//O/P6:      yrtnuoCIndia ymis   HINTS: here arr[j] is reverse only call StringReverse().

    static void StringReverse6(String s){
        String[] arr=StringInArray(s);
        for (int i = 0,j=arr.length-1;   i < j;   i++,j--) {
            System.out.print(   StringReverse(arr[j] )  +   arr[i]     +  " ");
        }
    }



//************************************   MAIN()   *************************************************

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();


//        String res=StringReverse(s);
//        System.out.println(res);


        StringReverse2(s);
        System.out.println();

//        StringReverse3(s);

//        StringReverse4(s);
//        System.out.println();
//
//        StringReverse5(s);
//        System.out.println();
//
//        StringReverse6(s);
//        System.out.println();

    }
}

