package Map;

import java.util.Collection;
import java.util.HashMap;

public class Hash_MapEx2 {
    public static void main(String[] args) { //not insertion order preserve and sorted
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        //find the total pair of number in given array
        //3,3  1,1  7,7  7,7 -->total 4 pair
        int[] ar={3,1,7,7,1,7,7,1,4,3};  //O/P : 4


        for (int i = 0; i < ar.length; i++) {
            if (hm.containsKey(ar[i])){
//              int val=hm.get(ar[i]);
//              hm.put(ar[i],val+1);  //also use compute() method.
                hm.compute(ar[i], (k, v) -> v + 1);
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
