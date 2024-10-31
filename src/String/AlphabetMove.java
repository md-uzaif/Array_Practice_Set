package String;

public class AlphabetMove {
    public static void main(String[] args) {
        //Given I/P: abc-xyz   ,  3                I/P:bcd-yza   ,  2
        // output is: def-abc                      O/P:def-abc

        String s="abc-xyz";        //"abc-xyz";
        int k=2;

        String temp="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='z'){
               if ((char)s.charAt(i)+k <='z' || (char)s.charAt(i)+k <='Z') {
                   temp = temp + (char) (s.charAt(i) + k);
               }else {
                   temp = temp + (char) (s.charAt(i) + k-26);
               }
            }else {
                temp= temp+s.charAt(i);
            }
        }
        System.out.println(temp);


    }
}
