package Array;

import java.util.Scanner;

public class SubArray {
//**********************************************************************************************

    //WAP to print all subArray of given length size like
    // I/P: 9 ---> { 5 1 2 4 9 3 1 3 3 } size-3
    // O/P: [512  124  249  493  931  313  133] array.length-3
    // if size 4 then [5124 1249 2493 4931 9313  3133] array.length-4
    static void subArrayPair(int[] arr, int size) {
        for (int i = 0; i <= arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
//**********************************************************************************************

    static void subArrayPairSum(int[] arr, int size) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

//**********************************************************************************************

    static void subArrayPairSumToK(int[] arr, int size) {
        int sum = 0;
        int count = 0;
        int k = 7;
        for (int i = 0; i <= arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                sum += arr[j];
            }
            if (sum == k) {
                count++;
                //  System.out.println(arr[i] +" "+arr[i+1]+" "+ arr[i+2]);//when print element = k
            }
            sum = 0;
        }
        System.out.println(count);
    }

//**********************************************************************************************

    //WAP to print all subArray of given Array
    // I/P: 9 ---> { 5 1 2 4 } size-1 size-2 size-3 . . . . n
    // O/P: [5 1 2 4 ][51 12 24] [512 124] [5124]
    static void PrintAllSubArray(int[] arr) {
        for (int size = 1; size <= arr.length; size++) {
            for (int i = 0; i <= arr.length - size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }

    //**********************************************************************************************

    //WAP to print all subArray of given Array
    // I/P: 11 ---> { 2 1 0 1 1 0 2 1 0 4 1 } size-1 size-2 size-3 . . . . n
    // O/P: 0 1 1 0 2 1 0 ******if find smallest the o/p is : 4 1

    // PLSAEK=Print Longest Sub Array whose Sum Equal to K(5).
    static void PLSAEK(int[] arr) {
        int k = 5; //also user input pass with array.
        for (int size = arr.length; size >= 1; size--)
      //  for (int size =1; size<=arr.length; size++) //only use this to find the smallest pair

        {

            for (int i = 0; i <= arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                if (sum == k) {
                    for (int j = i; j < i + size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    return;
                }
            }
        }
    }

    //########################################################################################
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of Array: ");
        int n = sc.nextInt();

        int[] ar = new int[n];
        // System.out.println("index :"  +" =");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
//        int size = sc.nextInt();        // want this if we pass array with size.
//        subArrayPair(ar, size);
//        subArrayPairSum(ar, size);
//        subArrayPairSumToK(ar, size);
//        PrintAllSubArray(ar);
          PLSAEK(ar);


    }
}
