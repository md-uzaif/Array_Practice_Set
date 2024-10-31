package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet { //Linked HashSet give the result in Input order wise or Preserve the insertion order
    public static void main(String[] args) {
        //i/p : mississippi   //o/p :  misp
        Set set=new LinkedHashSet<String>();

        String st="mississippi";

        for (int i = 0; i < st.length(); i++) {
            char ch=st.charAt(i);
            set.add(ch);
        }
        for (Object s : set) {
            System.out.print(s);


        }
    }
}
