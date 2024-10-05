package Array;

import java.util.Scanner;

public class MultipleArray {

//#################################################################################################
    //Given two sorted arrays of interger values.
    // WAP to print the elements which are repeated in both array.
    // I/P : array 1--->3 { 2 3 4 } array 2--->4 {5 6 7 8}  array 3--->5{9 10 11 12 13}
    //  O/P  : 2 5 9 3 6 10 4 7 11 8 12 13

   static void printCommonEle(int[] arr, int []arr2){
        int i=0, j=0;

       while (i<arr.length && j<arr2.length){
           if (arr[i]==arr2[j]){
               System.out.println(arr[i]);
               i++;
               j++;
           }
           else if (arr[i]>arr2[j]){
               j++;
           }
           else{
               i++;
           }
       }
   }
//**********************************************************************************************
    //Given two sorted arrays of Interger Values.
    // WAP to Merge these two array elements the resultant array is sorted.
    // I/P : array 1---> [5] {3 5 7 9 13} , array 2---> [8] {1 2 3 4 9 15 17 19}
    // O/P : 1 2 3 3 4 5 7 9 9 13 15 17 19

   static void MergeEleSort(int []arr, int []arr2){
       int i=0,j=0,k=0;
       int[] merge=new int[arr.length+arr2.length];
      while (i<arr.length && j<arr2.length) {
          if (arr[i] >= arr2[j]) {
              merge[k] = arr2[j];
              k++;  //or also use merge[k++]=arr2[j++];
              j++;
          } else {
              merge[k] = arr[i];
              k++;
              i++;
          }
      }
      while (j<arr2.length){
          merge[k++]=arr2[j++];
      }
      while (i<arr.length){
          merge[k++]=arr2[i++];
      }
        for (int res:merge){
            System.out.print(res + " ");
        }
    }
//**********************************************************************************************
    //Given three sorted arrays of Interger Values.
    // WAP to Merge these three array elements the show resultant not array is sorted.
    // I/P : array 1---> [3] {2 3 4} , array 2---> [4] {5 6 7 8} ,array 3--->[5] {9 10 11 12 13}
    // O/P : 2 5 9 3 6 10 4 7 11 8 12 13
       static void Merge3Array(int []arr,int []arr2){
           // Creating 3rd Array elements
           Scanner sc=new Scanner(System.in);
           int n3=sc.nextInt();
           int[] arr3 =new int[n3];
           for (int x=0;x<arr3.length;x++)
           {
               arr3[x]=sc.nextInt();
           }
    //--------------------------logic---------------------------------------
                int i=0,k=0;
                int []res=new int[arr.length+arr2.length+arr3.length];

                while (k<res.length){
                    if(i<arr.length){
                        res[k]=arr[i];
                        k++;
                    }
                    if (i<arr2.length) {
                        res[k]=arr2[i];
                        k++;
                    }
                    if (i<arr3.length) {
                        res[k]=arr3[i];
                        k++;
                    }
                    i++;

                }
                for (int result:res){
                    System.out.print(result+" ");
                }
        }


//###-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-###
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr =new int[n];
       for (int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
        int n2=sc.nextInt();
        int[] arr2 =new int[n2];
        for (int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }



        //printCommonEle(arr,arr2);
       // MergeEleSort(arr,arr2);
        Merge3Array(arr,arr2);

    }
}