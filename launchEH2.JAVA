import java.util.*;

public class launchEH2{
   static class alpha{
        void divide(){
            Scanner sc=new Scanner(System.in);
            System.out.println("The calC is started");
         

            System.out.println("Kindly enter the Numerator");
            int n=sc.nextInt();

            System.out.println("Kindly enter  the Denominator");
            int d=sc.nextInt();

            int res=n/d;
            System.out.println("The result is : " + res);
            
          
        }

        void display(){
           
            alpha d=new alpha();
            d.divide();
            
           

        }
    }

    public static void main(String args[]){
        launchEH2.alpha a= new launchEH2.alpha();
        try{
        a.display();
        }

           catch(ArithmeticException e){
                System.out.println(" the exception is handle in Main method");
            }

    }
}