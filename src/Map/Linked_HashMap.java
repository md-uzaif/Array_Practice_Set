package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap<Character , Integer> lhm=new LinkedHashMap();
        
       /* 
        lhm.put("Alphabet",26);
        lhm.put("Hindi",52);
        lhm.put("Arabic",28);
        lhm.put("Urdu",39+13); //39 basic letters and 13 extra characters, 52 all together.
        System.out.println(lhm);
        */
        
        String s="mssissippi";

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (lhm.containsKey(ch)){
                Integer v=lhm.get(ch);
                lhm.put(ch,v+1);
            }
            else {
                lhm.put(ch,1);
            }
            
        }
        //Accessing the value from MAP.
         Set<Map.Entry<Character ,Integer>> access = lhm.entrySet();

        String temp="";
        for (Map.Entry<Character,Integer> Get : access) {
    //      System.out.print(Get.getKey() + Get.getValue()); //O/P: 110119108114 becz char + int =int Not String.
            temp=temp+Get.getKey()+Get.getValue();

        }
        System.out.print(temp);


    }
}
