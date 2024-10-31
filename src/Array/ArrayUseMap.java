package Array;

/*
WAP to print how many number of pairs are present in Array.
        I/P: 10size-->3 1 7 7 1 7 7 1 4 3
        O/P:  4      hint : 3,3  1,1  7,7  7,7
*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayUseMap{
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of Array: ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            //  System.out.println("Enter value for index " + i + ": ");
            ar[i] = sc.nextInt();
        }

        //-----------------------------------------------//

        for (int i = 0; i < ar.length; i++) {
            if (hm.containsKey(ar[i])){
                int v=hm.get(ar[i]);
                hm.put(ar[i],v+1);
            }
            else {
                hm.put(ar[i],1);
            }
        }
        //-----------------------------------------------//
        //access the value

        Collection<Integer> value =hm.values();
        int sum=0;
        for (Integer i :value) {
            sum+=i/2;
        }
        System.out.println(sum);

    }
}