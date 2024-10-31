package Set;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet hs =new HashSet();    //HashSet neither reserve insertion order nor Sorted.

        String s="bob,alex,tam,charlie,denis,alex,tam";
        String[] ar=s.split(",");

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
            hs.add(ar[i]);
        }
        System.out.println();
        System.out.println(hs);

    }
}
