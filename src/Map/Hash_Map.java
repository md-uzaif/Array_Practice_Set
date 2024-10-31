package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) { //not insertion order preserve and sorted
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Alphabet",26);
        hm.put("Hindi",52);
        hm.put("Arabic",28);
        hm.put("Urdu",39+13); //39 basic letters and 13 extra characters, 52 all together.
        System.out.println(hm);

        Set<String> set=hm.keySet();

      /*  for (String s: set) {
           Integer i= hm.get(s);
          //  System.out.println(s+"   :"+i);
          //formally Input use keyword 'format' or 'printf'
            System.out.format("%-10s : %d%n", s, i);
        }*/


        Set<Map.Entry<String,Integer>> temp=hm.entrySet();

        for (Map.Entry e : temp) {
            System.out.println(e.getKey() + " : "+ e.getValue());
        }


    }
}
