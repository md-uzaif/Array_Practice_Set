package String;

public class AddingInString {
    public static void main(String[] args) {
        String s="banana";

        String ss="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'){
                ss=ss+'*'+s.charAt(i);
            }else {
                ss+=s.charAt(i);
            }
        }
        System.out.println(ss);

//************************************************************
      //find index of the 'r'-char like Matrix o/p: 3
/*
      String s="Matrix";
      int indx=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='r' || s.charAt(i)=='R'){
                indx=i;
            }
        }
        System.out.println(indx);
*/
//****************************************************************
    }
}
