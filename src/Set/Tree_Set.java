package Set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {  //Tree set give the result in sorted order.
    public static void main(String[] args) {
        Set ts=new TreeSet();

        String s="www.google.com,www.amazon.com,www.zoho.com,www.facebook.com,www.flipkart.com";
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
        //    String[] t=arr[i].split("\\.");  //remove (www.   .com) (.)means every char
            ts.add(arr[i]);
        //   ts.add(t[1]);
        }
        //   System.out.println(ts);
        for (Object url :ts) {
            System.out.println(url);
        }
    }
}