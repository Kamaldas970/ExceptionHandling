import java.util.*;

public class launchEH2{
   static class alpha{
        void divide(){
            try{
            Scanner sc=new Scanner(System.in);
            System.out.println("The calC is started");
         

            System.out.println("Kindly enter the Numerator");
            int n=sc.nextInt();

            System.out.println("Kindly enter  the Denominator");
            int d=sc.nextInt();

            int res=n/d;
            System.out.println("The result is : " + res);
            }
            catch(ArithmeticException e){
                System.out.println("Exception Handled in divide mathod()");
                throw e; //aft throw it wont print any statement.//
            }
            finally{
           
            System.out.println("divide Application is terminated");
            }
        
            
          
        }
    }
    public static void main(String args[]){
        try{
        launchEH2.alpha a= new launchEH2.alpha();
      a.divide();
        }
        catch(ArithmeticException e){
            System.out.println("Exception Handled in Main Method()");
        }
         System.out.println("Main Application is terminated");
       
       


    }
}