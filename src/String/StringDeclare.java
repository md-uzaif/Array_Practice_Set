package String;

public class StringDeclare {
    public static void main(String[] args) {
        /*
        Strings are the types of objects which can store characters as elements.
        https://www.javatpoint.com/java-string---
        1.String :String is an immutable class which means a constant and cannot be changed once created.
        2.StringBuffer :a peer class of String, it is mutable in , and it is thread safe class.
        3.StringBuilder:it creates a mutable sequence of characters, and it is not thread safe.
        */

    //  Declaration a String :
        //String[] sarr={"hello","hi","by"};
        String[] sar=new String[10];
        sar[0]="hello";
        sar[1]="hi";
        sar[2]="by";

//        There are two ways to create String object:
//       1. By string literal
        String s="Hello";  // Created in String constant pool.
//       2. By new keyword
        String snew=new String("hello hi by"); //this statement create two object i.e
        // 1.Created in heap memory  2.Created in String constant pool



    }
}
