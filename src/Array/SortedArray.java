package Array;

import java.util.Scanner;
// this class is to find how many times an element is repeat in Array.
public class SortedArray {

    static void repeation(int []ar,int n){
        int count=1;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                count++;
            }
            else {
                System.out.println(ar[i] + "--->" + count);
                count=1;
            }
        }

        System.out.println(ar[n-1] +"--->"+ count);
    }
//***********************************************************************************************

    static void Notrepeation(int []ar,int n){
      //  int count=1;
        for(int i=0;i<n-1;i++){
            if(ar[i]!=ar[i+1]){         // ==  --use->  !=
                System.out.println(ar[i] +"  ");
//              count++;
            }
//            else {
//                System.out.println(ar[i] +"  ");
//                count=1;
//            }
        }
        System.out.println(ar[n-1]);
    }

//***********************************************************************************************
static void UniqueElement(int []ar,int n) {
    int count = 1;
    for (int i = 0; i < n - 1; i++) {
        if (ar[i] == ar[i + 1]) {
            count++;
        } else {
            if (count == 1) {
                System.out.println(ar[i]);
            }
            else {
                count = 1;
            }
        }
    }
    if (count == 1) {
        System.out.println(ar[n - 1]);
    }
}

//***********************************************************************************************
static void UniqueElementCount(int []ar,int n) {
        int uniq_count=0;
        int count = 1;
    for (int i = 0; i < n - 1; i++) {
        if (ar[i] == ar[i + 1]) {
            count++;
        } else {
            if (count == 1) {
                uniq_count++;
            }
            else {
                count = 1;
            }
        }
    }
    if (count == 1) {
        uniq_count++;
    }
    System.out.println(uniq_count);
}

//**********************************************************************************************
//Find the largest element which occur more than one times :i/p--->2 3 3 3 4 5 7 7 9 11 : o/p---> 7
    // array is sorted so i travers to find largest to [<ar.length-1> to 0] is best approach.
    static void LargEleOccur(int [] ar){
        for(int i=ar.length-1;i>0;i--){
            if(ar[i]==ar[i-1]){
                System.out.println(ar[i]);
                break;
            }

        }
    }
//************************************************************************************************
//Find the largest element which Unique & one times :i/p--->2 3 3 3 4 5 7 7 9 9 : o/p---> 5
    // array is sorted so i travers to find largest to [<ar.length-1> to 0] is best approach.
    static void LargUniq(int [] ar){
        int count=1;
        for(int i=ar.length-1;i>0;i--){
            if(ar[i]==ar[i-1]){
                count++;

            }
            else {
                if(count==1){
                    System.out.println(ar[i]);
                    return;
                }
                else {
                    count=1;
                }
            }

        }
    }

//##########################################################################
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of Array: ");
        int n=sc.nextInt();

        int[] ar = new int[n];
       // System.out.println("index :"  +" =");

        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }

//        repeation(ar,n);
//        Notrepeation(ar,n);
//        UniqueElement(ar,n);
//        UniqueElementCount(ar,n);
//        LargEleOccur(ar);
        LargUniq(ar);


    }
}
