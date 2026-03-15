import java.util.*;
public class throwKey{

   static class alpha{
        void divide(){
          
            System.out.println("The calC is Started");
            Scanner sc=new Scanner(System.in);
              System.out.println("Kindly enter the numarator");
            int n=sc.nextInt();
            System.out.println("Kindly enter the denominator");
            int d=sc.nextInt();

            int res=n/d;

            System.out.println("The result is : " + res);
            
          


        }
    }
    public static void main(String args[]){
        throwKey.alpha n=new throwKey.alpha();
  try{
        n.divide();
  }
          catch(ArithmeticException e){
                System.out.println("Exception handled in divide method");
                throw e;
            }

    }
}