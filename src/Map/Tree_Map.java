package Map;

import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args){
        TreeMap tm=new TreeMap();
        tm.put("Alphabet",26);
        tm.put("Hindi",52);
        tm.put("Arabic",28);
        tm.put("Urdu",39+13); //39 basic letters and 13 extra characters, 52 all together.
        System.out.println(tm);

        
    }
}
