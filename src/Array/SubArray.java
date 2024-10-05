package Array;

import java.util.Scanner;

public class SubArray {
//WAP to print all subArray of given length size like
    // I/P: 9 ---> { 5 1 2 4 9 3 1 3 3 } size-3
    // O/P: [512  124  249  493  931  313  133] array.length-3
    // if size 4 then [5124 1249 2493 4931 9313  3133] array.length-4
    static void subArrayPair(int [] arr,int size){

        for(int i=0;i<=arr.length-size;i++){
            for (int j=i;j<i+size;j++){
                System.out.print(arr[j] +" ");


            }
            System.out.println();

        }
    }





//###########################################################################
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range of Array: ");
        int n=sc.nextInt();

        int[] ar = new int[n];
        // System.out.println("index :"  +" =");

        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        int size=sc.nextInt();
        subArrayPair(ar,size);


    }
}
