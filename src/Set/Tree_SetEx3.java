package Set;

import java.util.TreeSet;

public class Tree_SetEx3 {

   static TreeSet<String> removeDuplicateArrangeAlphabetically(String s){
        TreeSet<String> set=new TreeSet<String>();
  //    String[] ar=s.split(",");  //1st Method to Solve
        String t="";              //2nd Method to Solve
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ',') {
                set.add(t);
                t="";
            } else {
                t = t + ch;
            }
        }
        return set;
    }
//********************************* MAIN() *******************************************
    public static void main(String[] args) {
        //  I/P : bob,alex,tam,charlie,denis,alex,tam
        //  O/P :
        //  alex
        //  bob
        //  charlie
        //  denis
        //  tam

        String s="bob,alex,tam,charlie,denis,alex,tam";
        TreeSet<String> set=removeDuplicateArrangeAlphabetically(s);

        for (Object i : set) {
            System.out.println(i);
        }


    }
}
