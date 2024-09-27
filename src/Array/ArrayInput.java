package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

//********************************************************************************
    static int MaxElement(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;

    }
//********************************************************************************
    static int MaxElementOfIndex(int[] a) {
        int cnt = 0;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                //cnt++;  or also use cnt=i;
                cnt = i;
            }


        }
        return cnt;

    }

//********************************************************************************
    static int MinElement(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }


        }
        return min;

    }
//********************************************************************************
    static int NumberOccure(int a[], int occur) {
        int cnt = 0;
        int k = occur;
        for (int i = 0; i < a.length; i++) {
            if (k == a[i]) {
                cnt += 1;
            }

        }
        return cnt;
    }
//********************************************************************************

    static int[] reverseArray(int a[]) {
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            //System.out.print(a[i]+" , "); if void then use
            b[a.length - i - 1] = a[i];
        }
        return b;
    }
//********************************************************************************

  static int[][] Pair(int []ar){
      int pairsCount = (ar.length * (ar.length - 1)) / 2;

      int[][] retn = new int[pairsCount][2];
      
        int indx=0;
      for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++) {
                //System.out.println(ar[i] +" , "+ ar[j]);
                retn[indx][0]=ar[i];   //store value row colm wise [00  01]---->[1   2]
                retn[indx][1]=ar[j];   //store value row colm wise [10  11]---->[1   3]
                indx+=1;
            }
        }
        return retn;
    }

//********************************************************************************

    static int SecondLargest(int [] ar){
       // int[] ar={1,2,3,41,47,44,31,59,-60,59};
        int sl=0;
        int l=0;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>l){
                sl=l;
                l=ar[i];
            } else if (ar[i]>sl && sl<=l) {
                sl=ar[i];
            }
        }
        return sl;


    }
//********************************************************************************






//   ******************************<MAIN METHOD>******************************
//   *************************************************************************


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter no." + i);
            a[i] = sc.nextInt();
        }

        int result =SecondLargest(a);
        System.out.println("Second Largest Element is: "+ result);

//********************************************************************************
//        int[][] result=Pair(a);
//        for (int[] arr : result) {
//            System.out.println(arr[0] + " , " + arr[1]);
//        }
//        for(int i = 0; i < result.length; i++) {
//            System.out.println(result[i][0] + " , " + result[i][1]);
//        }
//********************************************************************************
//        System.out.println("enter to check which number : ");
//        int occur = sc.nextInt();
//        int resultOfOccur = NumberOccure(a, occur);
//        System.out.println(occur + " element Occur of array in " + resultOfOccur + " times.");
//********************************************************************************
//        int result1 = MaxElement(a);
//        int result11 = MaxElementOfIndex(a);
//        System.out.println("the Maximun element of array is : " + result1 + " index is: " + result11);
//********************************************************************************
//        int result2 = MinElement(a);
//        System.out.println("the Minimun element of array is:" + result2);
//********************************************************************************
//        int[] reverseArray = reverseArray(a);
//        System.out.println(" element Occur of array in after reverse : " + Arrays.toString(reverseArray));
//        for (int arr : reverseArray) {
//            System.out.println(arr);
//        }
//********************************************************************************

    }

}
