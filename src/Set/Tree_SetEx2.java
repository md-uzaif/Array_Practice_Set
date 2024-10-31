package Set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_SetEx2 {
    public static void main(String[] args) {
        //Que : I/P is: 10-->[3 5 7 1 5 4 1 3 2 1]
        //O/P : 1 2 3 4 5 7

        Set set=new TreeSet();
        int[] ar={3,5,7,1,5,4,1,3,2,1};
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        for (Object i : set) {
            System.out.print(i+" ");
        }
    }
}
