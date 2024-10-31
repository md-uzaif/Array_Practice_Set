package Array;

import java.util.Scanner;

public class consecutiveSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of Array: ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            //  System.out.println("Enter value for index " + i + ": ");
            ar[i] = sc.nextInt();
        }

        //pass the array to desired output:

    //    conArray(ar);
    //    conArrayLength(ar);
    //    conArraySorted(ar);
    //    conArraySortedLength(ar);
        conArraySortedLongestLength(ar);


    }
//************************************************************************************************
    // WAP to print all the consecutive subArrays in Array.
    // I/P: 10 { 5 12 13 14 9 2 3 4 5 8 }
    //O/P: 5---12 13 14---9---2 3 4 5---8      --> \n(break line)=(---)
    public static void conArray(int[] ar) {
        for (int i = 0; i < ar.length-1 ; i++) {

            if (ar[i+1]-ar[i]==1){  //also use this logic***(ar[i]+1)==ar[i+1]***
                System.out.print(ar[i]+" ");
            }else {
                System.out.print(ar[i]);
                System.out.println();
            }
        }
        System.out.print(ar[ar.length-1]);

    }

//************************************************************************************************
// WAP to print all the consecutive subArrays in Array.
// I/P: 10 { 5 12 13 14 9 2 3 4 5 8 }
//O/P: 1---3---1---4---1      --> \n(break line)=(---)
public static void conArrayLength(int[] ar) {
        int count=1;
    for (int i = 0; i < ar.length-1 ; i++) {

        if (ar[i+1]-ar[i]==1){  //also use this logic***(ar[i]+1)==ar[i+1]***
            count++;
        }else {
            System.out.println(count);
            count=1;

        }
    }
    System.out.print(count);

}

//************************************************************************************************
// WAP to print all the consecutive subArrays in Array.
// I/P: 10 { 5 12 13 14 9 2 3 4 5 8 }
//O/P: 5 12 13 14---9---2 3 4 5 8      --> \n(break line)=(---)
    public static void conArraySorted(int[] ar) {

        for (int i = 0; i < ar.length-1 ; i++) {
            if (ar[i+1]>=ar[i]){  //also use this logic***(ar[i]+1)==ar[i+1]***
                System.out.print(ar[i] + " ");
            }
            else {
                System.out.print(ar[i]);
                System.out.println();

            }
        }
        System.out.print(ar[ar.length-1]);

    }


 //************************************************************************************************
// WAP to print all the consecutive subArrays in Array.
// I/P: 10 { 5 12 13 14 9 2 3 4 5 8 }
//O/P: 4---1---5      --> \n(break line)=(---)
    public static void conArraySortedLength(int[] ar) {
        int count=1;
        for (int i = 0; i < ar.length-1 ; i++) {
            if (ar[i]<=ar[i+1]){
                count++;
            }
            else {
                System.out.print(count);
                System.out.println();
                count=1;
            }
        }
        System.out.print(count);

    }


//************************************************************************************************
// WAP to print all the consecutive subArrays in Array.
// I/P: 10 { 5 12 13 14 9 2 3 4 5 8 }
//O/P: 2 3 4 5      --> \n(break line)=(---)
    public static void conArraySortedLongestLength(int[] ar) {
        int count=1;
        int Longest=0;
        int eindx=0;
        int sindx=0;

        for (int i = 0; i <= ar.length-2 ; i++) {
            if (ar[i+1]-ar[i]==1){
                count++;
            }
            else {
//if 2 or 3 subArray consecutive then I want to print second contv[2 3 4 5] So add =(longest<=count)
//for Ex----: 11 12 13 14 9 2 3 4 5 10(here see)[11 12 13 14] & [2 3 4 5]
                if(count>Longest){
                    Longest=count;
                    eindx=i;
                }
                count=1;
            }
        }
        if(count>Longest){
            Longest=count;
            eindx=ar.length-1;

        }
        //logic to find start index that a reason to use Longest to store count value.
        sindx = eindx-Longest + 1;  //here I was used 'count' place of 'longest' facing trouble to find error.
        for (int i=sindx;i<=eindx;i++){
        System.out.print(ar[i] +" ");
//            10
//            2 3 4 5 9 10 11 12 13 14
        }

    }
//************************************************************************************************

}
