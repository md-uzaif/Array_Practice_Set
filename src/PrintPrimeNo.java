import java.util.Scanner;

public class PrintPrimeNo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       boolean s= checkPrime(n);
        System.out.println(s ? "Palindrome" : "Not Palindrome");
     //   printPrime(n);

//------------------------------------------
//        int k=5;
//        do { System.out.println("Enter the range where you've to print a prime Number");
//            int n=sc.nextInt();
//            firstNthPrime(n);
//            k--;
//        }while (k>=51);
//-----------------------------------------
    }
//*******************************************************************
   static void firstNthPrime(int n){
       int count=0;
       for(int i=2;n>count;i++){
          if(checkPrime(i)) {
              System.out.println(i);
              count++;
          }

       }
    }


//*******************************************************************
   static boolean checkPrime(int n){
            for(int j=2;j*j<=n;j++) {  //check the prime no.

                if (n % j == 0) {
                    return false;
                }
            }
            return true;
    }

//*******************************************************************
   static void printPrime(int n){
       int c=1;
       for(int p=2;p<=n;p++){

            if (checkPrime(p)){
                System.out.println(p);



       //it required format for highest range like 500 1000  need prime number
//                if(c<10){
//                    System.out.print(p + " ,");
//                    c++;
//                }
//                else{
//                    System.out.println(p+" ,");
//                    c=1;
//                }
            }

        }
    }

}
