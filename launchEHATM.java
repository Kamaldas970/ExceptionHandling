import java.util.*;
    class InvalidCustomerException extends java.lang.Exception{

    }
   class ATM{
        private int acc_n=111222;
        private int password=112233;
        private  int a_n;
        private int pw;

        void input() {

           
            System.out.println("ATM is getting started");
            Scanner sc=new Scanner(System.in);

            System.out.println("Please enter the Account Numner");
             a_n=sc.nextInt();

            System.out.println("Please enter the Password");
            pw=sc.nextInt();
        }

            void verify() throws InvalidCustomerException {

             if(a_n==acc_n && pw==password){
                System.out.println("Please collect your Cash");

             }
             else{
                System.out.println("Invalid credentials");
                 throw new InvalidCustomerException();
             } 

            }
        
    }
    class Bank{

       void initiate(){
         ATM atm=new ATM();

         try{
         atm.input();
         atm.verify();
         }
         catch(InvalidCustomerException ice){

              try{
         atm.input();
         atm.verify();
         }
         catch(InvalidCustomerException ic){

                try{
         atm.input();
         atm.verify();
         }
             catch(InvalidCustomerException ie){
                System.out.println("Seems like LEGENDS!, Should i call Police");
             }
         }

         }
       }
    }
    

    public class launchEHATM{
    public static void main(String args[]){
     Bank bb=new Bank();
       bb.initiate();

    }
    }