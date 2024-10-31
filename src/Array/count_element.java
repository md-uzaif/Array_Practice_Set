package Array;

public class count_element {
    public static void main(String[] args) {
        int[] ar={2,2,2,3,4,4,4,4,24};
       int count=1;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]==ar[i+1]){
                count++;
            }
            else {
                System.out.println("element :"+ar[i] +" count is "+ count);
                count=1;
            }
        }
        System.out.println("element :"+ar[ar.length-1] +" count is "+ count);



    }
}
