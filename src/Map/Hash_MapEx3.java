package Map;

import java.util.HashMap;
import java.util.Set;

/*
WAP to print all the words that occur more than 3 times. Each word should be printed on a new line.
[I/P String: fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering]
[ O/P: to
      leads ]
*/



public class Hash_MapEx3 {
    public static void main(String[] args) {
        String s="     fear       leads to anger anger leads to hatred hatred   leads to conflict conflict leads to suffering    ";

        HashMap<String,Integer> hm=new HashMap<String,Integer>();
    //-----------------------------------------------------//
   /*
        String t="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c!=' '){
                t+=c;
            }
            else if (!t.isEmpty()){
                if (hm.containsKey(t)){
                    hm.put(t,hm.get(t)+1);
                    t="";
                }else {
                    hm.put(t,1);
                    t="";
                }
            }
        }
        // for last word stored.
        if (hm.containsKey(t)){
            hm.put(t,hm.get(t)+1);
            t="";
        }else {
            hm.put(t,1);
            t="";
        }
      */
    //-----------------------------------------------------//
     //easy way to solve using getOrDefault() method. return 0 value if key  not available
      String[] ar=s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            if (!ar[i].isEmpty()){
            Integer v=hm.getOrDefault(ar[i],0);
            hm.put(ar[i],v+1);
        }}
       Set<String> set = hm.keySet();
        System.out.println(hm);

        for (String acs :set) {
            Integer i=hm.get(acs);
            if (i>3){
                System.out.println(acs +" "+ i);
            }

        }


    }
}
